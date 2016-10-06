package com.jira.plugin.clone.task;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.atlassian.connect.spring.AtlassianHost;
import com.atlassian.connect.spring.AtlassianHostUser;
import com.atlassian.connect.spring.IgnoreJwt;
import com.atlassian.connect.spring.internal.jira.rest.JiraRestClientFactory;
import com.atlassian.connect.spring.internal.jira.rest.JiraRestClientFactoryImpl;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.BasicProject;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.IssueType;
import com.atlassian.jira.rest.client.api.domain.SearchResult;
import com.atlassian.util.concurrent.Promise;
import com.google.gson.Gson;
import com.jira.plugin.clone.create.schema.request.Assignee;
import com.jira.plugin.clone.create.schema.request.Component;
import com.jira.plugin.clone.create.schema.request.CreateIssue;
import com.jira.plugin.clone.create.schema.request.Fields;
import com.jira.plugin.clone.create.schema.request.FixVersion;
import com.jira.plugin.clone.create.schema.request.Issuetype;
import com.jira.plugin.clone.create.schema.request.Priority;
import com.jira.plugin.clone.create.schema.request.Project;
import com.jira.plugin.clone.create.schema.request.Reporter;
import com.jira.plugin.clone.create.schema.response.CreateIssueResponse;
import com.jira.plugin.clone.create.schema.response.IssueCreateResponse;
import com.jira.plugin.clone.issuesearch.schema.SearchIssue;
import com.jira.plugin.clone.schema.search.post.req.SearchPostReq;
import com.jira.plugin.clone.schema.search.post.res.SearchPostRes;

@Controller

public class CloneTaskController
{
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private JiraRestClientFactory factory ;
	
	JiraRestClient restClient;
	private MultiValueMap<String, Object> headers;
	
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public ModelAndView sample(@RequestParam String username) {
	    ModelAndView model = new ModelAndView();
	    model.setViewName("test");
	    model.addObject("userName", username);
	   
	    return model;
	}
	
	@RequestMapping(value = "/clone", method = RequestMethod.GET)
	public ModelAndView cloneIssue(@AuthenticationPrincipal AtlassianHostUser hostUser) throws URISyntaxException {
		factory = new JiraRestClientFactoryImpl();
		AtlassianHost host = hostUser.getHost();
		restClient = factory.createJiraRestClient(host, restTemplate);
		Optional<String> userKey = hostUser.getUserKey();
		String string = userKey.get();
		log.info("BaseUrl:"+host.getBaseUrl());
		log.info("ClientKey:"+host.getClientKey());
		log.info("CreatedBy:"+host.getCreatedBy());
		log.info("Description:"+host.getDescription());
		log.info("LastModifiedBy:"+host.getLastModifiedBy());
		log.info("ProductType:"+host.getProductType());
		log.info("PublicKey:"+host.getPublicKey());
		log.info("ServiceEntitlementNumber:"+host.getServiceEntitlementNumber());
		log.info("SharedSecret:"+host.getSharedSecret());
		log.info(string);
		log.info("=======================");
	    ModelAndView model = new ModelAndView();
	    String s=null;
	    List<BasicProject> projectList = null;
	    List<Issue> issueTypeList = null;
	    Iterator<BasicProject> iterator = restClient.getProjectClient().getAllProjects().claim().iterator();
        
        projectList = new ArrayList<BasicProject>();
        //IssueTypeSchemeManager
        for(Iterator<BasicProject> i = iterator; i.hasNext(); ) {
        	BasicProject item = i.next();
        	projectList.add(item);
        }
	    model.setViewName("copyIssue");
	    //model.addObject("commonIssueTypes",commonIssueTypes);
	   // model.addObject("customIssueTypes",customIssueTypes);
	    
	    model.addObject("projectList", projectList);
	    model.addObject("baseUrl", host.getBaseUrl());
	   // model.addObject("issueTypeList",issueTypeList);
	    return model;
	}
	
	
	@IgnoreJwt
	@RequestMapping(value="/copyissues" , method=RequestMethod.POST)
	public @ResponseBody String submitIssues(@RequestBody CopyIssueDTO copyIssueDTO ){
		List<IssueCopyResponse> resultList = null;
		List<IssueCreateResponse> responseList = null;
		IssueCreateResponse issueCreateresponse=null;
		IssueCreateResponse customIssueCreateresponse=null;
		AtlassianHost host=new AtlassianHost();
		host.setBaseUrl(copyIssueDTO.getBaseUrl());
		List<SearchIssue> searchIssueList = new ArrayList<SearchIssue>();
		List<String> issueKeyList = new ArrayList<String>();
		log.info("Base Url : "+copyIssueDTO.getBaseUrl());
		String projectFrom = copyIssueDTO.getProjectA();
		SearchPostReq request = new SearchPostReq();
		request.setJql("project="+projectFrom);
		request.setStartAt(0);
		request.setMaxResults(100);
		ResponseEntity<SearchPostRes> searchPostRspEntity = restTemplate.postForEntity(copyIssueDTO.getBaseUrl()+"/rest/api/latest/search/", request, SearchPostRes.class);
		SearchPostRes response = searchPostRspEntity.getBody();
		//Search search = restTemplate.getForObject(copyIssueDTO.getBaseUrl()+"/rest/api/latest/search/", SearchPostReq.class,Search.class);
		
		Long projectId = (Long)restClient.getProjectClient().getProject(copyIssueDTO.getProjectB()).claim().getId();
		log.info("Destination project id: "+projectId);
		for (com.jira.plugin.clone.schema.search.post.res.Issue issue : response.getIssues()) {
			if(issue != null 
					&& issue.getKey()!=null 
					&& issue.getKey().contains(projectFrom)){
				issueKeyList.add(issue.getKey());
			}
		}
		responseList = new ArrayList<IssueCreateResponse>();
		resultList = new ArrayList<IssueCopyResponse>();
		for (String issueKey : issueKeyList) {
			String dest = null;
			SearchIssue issueSearch = restTemplate.getForObject(copyIssueDTO.getBaseUrl()+"/rest/api/latest/issue/"+issueKey, SearchIssue.class);
			log.info("Issue Retrieve : "+issueSearch.getId());
			log.info("Issue Retrieve Type: "+issueSearch.getFields().getIssuetype().getName());
			issueCreateresponse = processAndCreateIssues(copyIssueDTO, issueCreateresponse, searchIssueList, projectId, issueSearch);
			if(issueCreateresponse != null){
				responseList.add(issueCreateresponse);
				dest = issueCreateresponse.getKey();
			}
			customIssueCreateresponse = processAndCreateCustomIssues(copyIssueDTO, customIssueCreateresponse, searchIssueList, projectId, issueSearch);
			if(customIssueCreateresponse != null){
				responseList.add(customIssueCreateresponse);
				dest = customIssueCreateresponse.getKey();
			}
			if(issueCreateresponse!=null || customIssueCreateresponse != null){
				final IssueCopyResponse result = new IssueCopyResponse();
				result.setSource(issueKey);
				result.setUrl(copyIssueDTO.getBaseUrl()+"/browse/"+issueKey);
				result.setDestination(dest);
				result.setDestUrl(copyIssueDTO.getBaseUrl()+"/browse/"+dest);
				resultList.add(result);
				issueCreateresponse = null;dest = null;
				customIssueCreateresponse = null;
			}
		}
		Gson responseJson = new Gson();
		log.info(responseJson.toJson(resultList));
		return responseJson.toJson(resultList);
		//return issueCreateresponse!=null || customIssueCreateresponse!=null ?  "{"+"\"message\":\"success\""+"}" : "{"+"\"message\":\"error\""+"}";
	}

	private IssueCreateResponse processAndCreateCustomIssues(CopyIssueDTO copyIssueDTO, IssueCreateResponse response,
			List<SearchIssue> searchIssueList, Long projectId, SearchIssue issueSearch) {
		for(String issueType : copyIssueDTO.getCustomIssues()){
			log.info("Issue Type : "+issueType);
			response = createIssueToProject(copyIssueDTO, response, searchIssueList, projectId, issueSearch, issueType);
		}
		return response;
	}

	private IssueCreateResponse processAndCreateIssues(CopyIssueDTO copyIssueDTO, IssueCreateResponse response,
			List<SearchIssue> searchIssueList, Long projectId, SearchIssue issueSearch) {
		for(String issueType : copyIssueDTO.getIssues()){
			log.info("Issue Type : "+issueType);
			response = createIssueToProject(copyIssueDTO, response, searchIssueList, projectId, issueSearch, issueType);
		}
		return response;
	}

	private IssueCreateResponse createIssueToProject(CopyIssueDTO copyIssueDTO, IssueCreateResponse response,
			List<SearchIssue> searchIssueList, Long projectId, SearchIssue issueSearch, String issueType) {
		ResponseEntity<IssueCreateResponse> responseEntity;
		if(issueType !=null && issueType.equalsIgnoreCase(issueSearch.getFields().getIssuetype().getName())){
			log.info("Issue type :"+issueSearch.getFields().getIssuetype().getId());
			searchIssueList.add(issueSearch);
			
			CreateIssue request = new CreateIssue();
			processRequest(request, issueSearch);
			//Setting Project ID
			populateProject(projectId, request);
			// Parsing json and add header
			Gson grequest = new Gson();
			log.info(grequest.toJson(request).toString());
			headers = new LinkedMultiValueMap<String, Object>();
		        headers.add("Accept", "application/json");
		        headers.add("Content-Type", "application/json");
		        HttpEntity httprequest = new HttpEntity(grequest.toJson(request).toString(), headers);
		        try{
		        	 responseEntity = restTemplate.postForEntity(copyIssueDTO.getBaseUrl()+"/rest/api/latest/issue", httprequest, IssueCreateResponse.class);
		        	 response = responseEntity.getBody();
		        	 log.info(issueSearch.getId()+" :::: Issue Created  :"+response);
		        }catch(Exception e){
		        	response = null;
		        	log.info("Issue Not Created");
		        	e.printStackTrace();
		        }
		}
		return response;
	}

	private void populateProject(Long projectId, CreateIssue request) {
		Project project = new Project();
		project.setId(projectId.toString());
		request.getFields().setProject(project);
	}
	
	private void processRequest(CreateIssue request, SearchIssue issueSearch) {
		
		Fields fields = populateFields(issueSearch);
		request.setFields(fields);
	}

	private Fields populateFields(SearchIssue issueSearch) {
		
		Fields fields =new  Fields();
		populateAssignee(issueSearch, fields);
		List<Component> components = populateComponent(issueSearch);
		fields.setComponents(components);
		populateDescription(issueSearch, fields);
		//populateFixVersions(issueSearch, fields);
		populateIssueType(issueSearch, fields);
		populateLabels(issueSearch, fields);
		populatePriority(issueSearch, fields);
		populateProjectReporter(issueSearch, fields);
		
		fields.setSummary(issueSearch.getFields().getSummary());
		return fields;
	}

	private List<Component> populateComponent(SearchIssue issueSearch) {
		List<Object> componentsSearch = issueSearch.getFields().getComponents();
		List<Component> components = new ArrayList<Component>();
		Component component = null;
		for (Object comp : componentsSearch) {
			if(comp instanceof String){
				component = new Component();
				component.setId((String)comp);
				components.add(component);
			}
		}
		return components;
	}

	private void populateDescription(SearchIssue issueSearch, Fields fields) {
		Object description = issueSearch.getFields().getDescription();
		if(description instanceof String){
			String desc = (String) description;
			fields.setDescription(desc);
		}
	}

	private void populateAssignee(SearchIssue issueSearch, Fields fields) {
		com.jira.plugin.clone.issuesearch.schema.Assignee assigneeSearch = issueSearch.getFields().getAssignee();
		Assignee assignee =new Assignee();
		String name="";	
		if(assigneeSearch !=null && assigneeSearch.getName()!=null){
			name = assigneeSearch.getName();
		}
		assignee.setName(name);
		fields.setAssignee(assignee );
	}

	private void populateIssueType(SearchIssue issueSearch, Fields fields) {
		com.jira.plugin.clone.issuesearch.schema.Issuetype issuetypeSearch = issueSearch.getFields().getIssuetype();
		Issuetype issuetype= new Issuetype();
		issuetype.setId(issuetypeSearch.getId());
		fields.setIssuetype(issuetype);
	}

	private void populateProjectReporter(SearchIssue issueSearch, Fields fields) {
		final String reporterName = issueSearch.getFields().getReporter().getName();
		Reporter reporter=new Reporter();
		reporter.setName(reporterName);
		fields.setReporter(reporter);
	}

	private void populatePriority(SearchIssue issueSearch, Fields fields) {
		com.jira.plugin.clone.issuesearch.schema.Priority proioritySearch = issueSearch.getFields().getPriority();
		Priority priority= new Priority();
		priority.setId(proioritySearch.getId());// Ranges from 1 to 5
		fields.setPriority(priority);
	}

	private void populateLabels(SearchIssue issueSearch, Fields fields) {
		final List<String> labelSearch = issueSearch.getFields().getLabels();
		final List<String> labels = new ArrayList<String>();
		for (String label : labelSearch) {
			labels.add(label);
		}
		fields.setLabels(labels );
	}

	//Not Required
	private void populateFixVersions(SearchIssue issueSearch, Fields fields) {
		List<FixVersion> fixVersions = new ArrayList<FixVersion>();
		FixVersion fixVersionCreate;
		List<com.jira.plugin.clone.issuesearch.schema.FixVersion> fixVersionsSearch 
		= issueSearch.getFields().getFixVersions();
		for (com.jira.plugin.clone.issuesearch.schema.FixVersion fixVersion : fixVersionsSearch) {
			if(fixVersion !=null){
				fixVersionCreate = new FixVersion();
				fixVersionCreate.setId(fixVersion.getId());
				fixVersions.add(fixVersionCreate);
			}
		}
		fields.setFixVersions(fixVersions);
	}

	@IgnoreJwt
	@RequestMapping(value="/issuetype" , method=RequestMethod.GET)
	 
	public @ResponseBody List<IssueDetail> fetchIssueFromType(@RequestParam String issueType,@RequestParam String projectID ){
	
		log.info("Inside fetchIssueFromType method ----");
		List<Issue> issueTypeList =null;
		List<IssueDetail> issueDataList = null;
		
		String jql = "project="+projectID+" AND type="+issueType;
		log.info("JQL : "+jql);
		Promise<SearchResult> issues = restClient.getSearchClient().searchJql(jql, 50000, 0, null);
		log.info("issues found : "+issues);
		IssueDetail issueDetail = null;
		issueDataList = new ArrayList<IssueDetail>();
        try {
			SearchResult searchResult = issues.get();
			issueTypeList = (List<Issue>) searchResult.getIssues();
			for(Issue issue : issueTypeList){
				
				issueDetail = new IssueDetail();
				issueDetail.setKey(issue.getKey());
				issueDetail.setName(issue.getProject().getName());
				issueDetail.setType(issue.getIssueType().getName());
				issueDataList.add(issueDetail);
			}
			log.info("Issues count : "+issueDataList.size());
			
		} catch (InterruptedException e) {
			log.info("Exception occured : "+e);
			e.printStackTrace();
		} catch (ExecutionException e) {
			log.info("Exceution Exception occured : "+e);
			e.printStackTrace();
		}
		return issueDataList;
	}
	
	@IgnoreJwt
	@RequestMapping(value="/getcustomissue" , method=RequestMethod.POST)
	public @ResponseBody String getCustomIssue(@RequestBody CopyIssueDTO copyIssueDTO ){
		
		log.info("inside fetch custom issue ");
		List<String> issueList = new ArrayList<String>();
		String projectA = copyIssueDTO.getProjectA();
		if(projectA != null){
			log.info(projectA);
			Iterator<IssueType> iterator = restClient.getProjectClient().getProject(projectA).claim().getIssueTypes().iterator();
			while(iterator.hasNext()) {
				String name = iterator.next().getName();
				if(!("Task".equals(name) 
						|| "Story".equals(name) 
						|| "Bug".equals(name) 
						|| "Epic".equals(name) 
						|| "Sub-task".equals(name)))
					issueList.add(name);
			}
		}
		return new Gson().toJson(issueList);
	}
}
