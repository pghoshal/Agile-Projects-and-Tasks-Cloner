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
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
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
import com.jira.plugin.clone.create.schema.request.Add;
import com.jira.plugin.clone.create.schema.request.Assignee;
import com.jira.plugin.clone.create.schema.request.Component;
import com.jira.plugin.clone.create.schema.request.CreateIssue;
import com.jira.plugin.clone.create.schema.request.Fields;
import com.jira.plugin.clone.create.schema.request.FixVersion;
import com.jira.plugin.clone.create.schema.request.Issuetype;
import com.jira.plugin.clone.create.schema.request.Priority;
import com.jira.plugin.clone.create.schema.request.Project;
import com.jira.plugin.clone.create.schema.request.Reporter;
import com.jira.plugin.clone.create.schema.request.Security;
import com.jira.plugin.clone.create.schema.request.Timetracking;
import com.jira.plugin.clone.create.schema.request.Update;
import com.jira.plugin.clone.create.schema.request.Version;
import com.jira.plugin.clone.create.schema.request.Worklog;
import com.jira.plugin.clone.create.schema.response.CreateIssueResponse;
import com.jira.plugin.clone.issuesearch.schema.SearchIssue;
import com.jira.plugin.clone.search.schema.Search;

@Controller

public class CloneTaskController
{
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private JiraRestClientFactory factory ;
	
	JiraRestClient restClient;
	
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
        
       // Promise<SearchResult> issues = restClient.getSearchClient().searchJql("project=TD", 50000, 0, null);
//        Set<String> commonIssueTypes=new HashSet<String>();
//        Set<String> customIssueTypes=new HashSet<String>();
//        try {
//			SearchResult searchResult = issues.get();
//			issueTypeList = (List<Issue>) searchResult.getIssues();
//			for (Issue issue : issueTypeList)
//			{
//				if(issue.getIssueType().getName().equalsIgnoreCase("Story")||issue.getIssueType().getName().equalsIgnoreCase("Bug")||issue.getIssueType().getName().equalsIgnoreCase("Sub-task"))
//					{
//					commonIssueTypes.add(issue.getIssueType().getName());
//					
//					}else{
//						customIssueTypes.add(issue.getIssueType().getName());
//					}
//					log.info(issue.getIssueType().getName());
//			}
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		} catch (ExecutionException e) {
//			e.printStackTrace();
//		}
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
		CreateIssueResponse response=null;
		AtlassianHost host=new AtlassianHost();
		host.setBaseUrl(copyIssueDTO.getBaseUrl());
		List<SearchIssue> searchIssueList = new ArrayList<SearchIssue>();
		restClient = factory.createJiraRestClient(host, restTemplate);
		List<String> issueKeyList = new ArrayList<String>();
		
		Search search = restTemplate.getForObject("https://annexchettri.atlassian.net/rest/api/latest/search/", Search.class);
		
		String p1 = copyIssueDTO.getProjectA();
		String p2 = copyIssueDTO.getProjectB();
		int size = copyIssueDTO.getIssues().size();
		log.info(" P1:"+p1 + " P2:"+p2+" size : "+size);
		log.info(copyIssueDTO.getBaseUrl());
		for (com.jira.plugin.clone.search.schema.Issue issue : search.getIssues()) {
			if(issue != null 
					&& issue.getKey()!=null 
					&& issue.getKey().contains(copyIssueDTO.getProjectA())){
				issueKeyList.add(issue.getKey());
				//log.info(issue.getKey());
			}
		}
		//Map<String, FieldInput> map = new HashMap<String, FieldInput>();
		for (String issueKey : issueKeyList) {
			SearchIssue issueSearch = restTemplate.getForObject("https://annexchettri.atlassian.net/rest/api/latest/issue/"+issueKey, SearchIssue.class);
			log.info("Issue Retrieve : "+issueSearch.getId());
			log.info("Issue Retrieve Type: "+issueSearch.getFields().getIssuetype().getName());
			for(String issueType : copyIssueDTO.getIssues()){
				if(issueType !=null && issueType.equalsIgnoreCase(issueSearch.getFields().getIssuetype().getName())){
					searchIssueList.add(issueSearch);
					com.jira.plugin.clone.issuesearch.schema.Fields fields = issueSearch.getFields();
					fields.getProject().setId(copyIssueDTO.getProjectB());
					
					CreateIssue request = new CreateIssue();
					processRequest(request, issueSearch);
					Update update = new Update();
					request.setUpdate(update );
					Gson grequest = new Gson();
					log.info(grequest.toJson(request).toString());
					response = restTemplate.postForObject("https://annexchettri.atlassian.net/rest/api/2/issue", request, CreateIssueResponse.class);
					//ResponseEntity<CreateIssueResponse> responseEntity = restTemplate.postForEntity("https://annexchettri.atlassian.net/rest/api/2/issue", request, CreateIssueResponse.class);
					//response = responseEntity.getBody();
					log.info(issueSearch.getId()+" :::: Issue Created"+response.getId());
				}
			}
		}
		
		return response!=null ?  "{"+"\"message\":\"success\""+"}" : "{"+"\"message\":\"error\""+"}";
	}
	
	private void processRequest(CreateIssue request, SearchIssue issueSearch) {
		/*Update update = new Update();
		
		Add add= new Add();
		add.setTimeSpent("60m");
		add.setStarted("2016-09-03T12:39:10.923+0530");
		Worklog worklog= new Worklog();
		worklog.setAdd(add);
		List<Worklog> worklogs = new ArrayList<Worklog>();
		worklogs.add(worklog);
		update.setWorklog(worklogs);*/
		//update.addWorklog(worklog1);
		
		
		Fields fields =new  Fields();
		Assignee assignee =new Assignee();
		assignee.setName("admin");
		fields.setAssignee(assignee );
		Component components1 = new Component();
		components1.setId("10000");
		List<Component> components = new ArrayList<Component>();
		components.add(components1);
		
		fields.setComponents(components);
		
		fields.setDescription("Test data desc");
		fields.setDuedate("2016-09-17");
		fields.setEnvironment("environment");
		
		List<FixVersion> fixVersions = new ArrayList<FixVersion>();
		FixVersion fixVersions1 = new FixVersion();
		
		fixVersions1.setId("10000");
		fixVersions.add(fixVersions1);
		fields.setFixVersions(fixVersions);
		
		Issuetype issuetype= new Issuetype();
		issuetype.setId("10022");
		fields.setIssuetype(issuetype);
		
		List<String> labels = new ArrayList<String>();
		labels.add("bugfix");
		labels.add("blitz_test");
		fields.setLabels(labels );
		Priority priority= new Priority();
		priority.setId("20000");
		fields.setPriority(priority);
		
		Project project= new Project();
		project.setId("10000");
		fields.setProject(project);
		
		Reporter reporter=new Reporter();
		reporter.setName("Medium");
		fields.setReporter(reporter);
		
		Security security=new Security();
		security.setId("10000");
		fields.setSecurity(security);
		
		fields.setSummary("New project creation");
		
		Timetracking timetracking =new Timetracking();
		timetracking.setOriginalEstimate("10");
		timetracking.setRemainingEstimate("5");
		fields.setTimetracking(timetracking );
		
		List<Version> versions = new ArrayList<Version>();
		Version versions1 = new Version();
		versions1.setId("10000");
		versions.add(versions1);
		fields.setVersions(versions );
		
		//request.setUpdate(update);
		request.setFields(fields);
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
