
package com.jira.plugin.clone.task;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CopyIssueDTO {

	@SerializedName("project-a")
	@Expose
	private String projectA;
	@SerializedName("project-b")
	@Expose
	private String projectB;
	@SerializedName("baseUrl")
	@Expose
	private String baseUrl ;
	
	@SerializedName("issues")
	@Expose
	private List<String> issues = new ArrayList<String>();

	public String getBaseUrl()
	{
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl)
	{
		this.baseUrl = baseUrl;
	}

	/**
	 * 
	 * @return The projectA
	 */
	public String getProjectA() {
		return projectA;
	}

	/**
	 * 
	 * @param projectA
	 *            The project-a
	 */
	public void setProjectA(String projectA) {
		this.projectA = projectA;
	}

	/**
	 * 
	 * @return The projectB
	 */
	public String getProjectB() {
		return projectB;
	}

	/**
	 * 
	 * @param projectB
	 *            The project-b
	 */
	public void setProjectB(String projectB) {
		this.projectB = projectB;
	}

	/**
	 * 
	 * @return The issues
	 */
	public List<String> getIssues() {
		return issues;
	}

	/**
	 * 
	 * @param issues
	 *            The issues
	 */
	public void setIssues(List<String> issues) {
		this.issues = issues;
	}

}