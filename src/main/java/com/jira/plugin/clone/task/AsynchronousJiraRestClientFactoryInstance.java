package com.jira.plugin.clone.task;

import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;

public class AsynchronousJiraRestClientFactoryInstance {
	
	private static AsynchronousJiraRestClientFactory INSTANCE;
	
	private AsynchronousJiraRestClientFactoryInstance(){
		
	}

	public static synchronized AsynchronousJiraRestClientFactory getInstance(){
		
		if(INSTANCE==null){
			INSTANCE = new AsynchronousJiraRestClientFactory();
		}
		return INSTANCE;
		
	}
	
}
