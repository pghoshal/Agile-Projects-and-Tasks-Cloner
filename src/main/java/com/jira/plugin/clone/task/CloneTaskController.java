package com.jira.plugin.clone.task;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.atlassian.connect.spring.IgnoreJwt;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.BasicProject;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.SearchResult;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;
import com.google.gson.Gson;

@Controller
@IgnoreJwt
public class CloneTaskController
{
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RestTemplate restTemplate;

	private AsynchronousJiraRestClientFactory factory = AsynchronousJiraRestClientFactoryInstance.getInstance();
	
	private URI jiraServerUri = URIInstance.getInstance();
	final JiraRestClient restClient = factory.createWithBasicHttpAuthentication(jiraServerUri, "admin", "123456789");
	
	@RequestMapping(value = "/sample", method = RequestMethod.GET)
	public ModelAndView sample(@RequestParam String username) {
	    ModelAndView model = new ModelAndView();
	    model.setViewName("test");
	    model.addObject("userName", username);
	   
	    return model;
	}
	
	@RequestMapping(value = "/clone", method = RequestMethod.GET)
	public ModelAndView cloneIssue() throws URISyntaxException {
	    ModelAndView model = new ModelAndView();
	    String s=null;
	    List<BasicProject> projectList = null;
	    List<Issue> issueTypeList = null;
        Iterator<BasicProject> iterator = restClient.getProjectClient().getAllProjects().claim().iterator();
        Promise<SearchResult> issues = restClient.getSearchClient().searchJql("project=TD", 50000, 0, null);
        Set<String> commonIssueTypes=new HashSet<String>();
        Set<String> customIssueTypes=new HashSet<String>();
        try {
			SearchResult searchResult = issues.get();
			issueTypeList = (List<Issue>) searchResult.getIssues();
			for (Issue issue : issueTypeList)
			{
				if(issue.getIssueType().getName().equalsIgnoreCase("Story")||issue.getIssueType().getName().equalsIgnoreCase("Bug")||issue.getIssueType().getName().equalsIgnoreCase("Sub-task"))
					{
					commonIssueTypes.add(issue.getIssueType().getName());
					
					}else{
						customIssueTypes.add(issue.getIssueType().getName());
					}
					log.info(issue.getIssueType().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
        projectList = new ArrayList<BasicProject>();
        //IssueTypeSchemeManager
        for(Iterator<BasicProject> i = iterator; i.hasNext(); ) {
        	BasicProject item = i.next();
        	
        	projectList.add(item);
        }
	    model.setViewName("copyIssue");
	    model.addObject("commonIssueTypes",commonIssueTypes);
	    model.addObject("customIssueTypes",customIssueTypes);
	    
	    model.addObject("projectList", projectList);
	    model.addObject("issueTypeList",issueTypeList);
	    return model;
	}

	@RequestMapping(value="/copyissues" , method=RequestMethod.POST)
	public ModelAndView submitIssues(@RequestBody String json ){
		
		return null;
	}
	
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
        /*Gson gson = new Gson();
        String json = gson.toJson(issueDataList);
        log.info("JSON Array : "+json);*/
		
		return issueDataList;
	}
}
