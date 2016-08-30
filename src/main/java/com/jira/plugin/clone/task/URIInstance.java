package com.jira.plugin.clone.task;

import java.net.URI;
import java.net.URISyntaxException;

public class URIInstance {
	
private static URI INSTANCE;
	
	private URIInstance(){
		
	}

	public static synchronized URI getInstance(){
		
		if(INSTANCE==null){
			try{
			INSTANCE = new URI("https://prasenjitghoshal.atlassian.net/");
			}catch(URISyntaxException ex){
				ex.printStackTrace();
			}
		}
		return INSTANCE;
		
	}

}
