package com.jira.plugin.clone.task;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.atlassian.connect.spring.IgnoreJwt;
import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.domain.BasicProject;
import com.atlassian.jira.rest.client.api.domain.Issue;
import com.atlassian.jira.rest.client.api.domain.SearchResult;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;

@Controller
@IgnoreJwt
public class CloneTaskController
{
	@Autowired
	private RestTemplate restTemplate;

	private AsynchronousJiraRestClientFactory factory = AsynchronousJiraRestClientFactoryInstance.getInstance();
	
	private URI jiraServerUri = URIInstance.getInstance();
	
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
	    
        final JiraRestClient restClient = factory.createWithBasicHttpAuthentication(jiraServerUri, "admin", "123456789");
        Iterator<BasicProject> iterator = restClient.getProjectClient().getAllProjects().claim().iterator();
        Promise<SearchResult> issues = restClient.getSearchClient().searchJql("project=TD");
        try {
			SearchResult searchResult = issues.get();
			issueTypeList = (List<Issue>) searchResult.getIssues();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
        projectList = new ArrayList<BasicProject>();
        for(Iterator<BasicProject> i = iterator; i.hasNext(); ) {
        	BasicProject item = i.next();
        	
        	projectList.add(item);
        }
	    model.setViewName("copyIssue");
	    model.addObject("projectList", projectList);
	    model.addObject("issueTypeList",issueTypeList);
	    return model;
	}

	@RequestMapping(value="/copyissues" , method=RequestMethod.POST)
	public ModelAndView submitIssues(@RequestBody String json ){
		
		return null;
	}
}
