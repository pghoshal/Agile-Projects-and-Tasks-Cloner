
package com.jira.plugin.clone.issuesearch.schema;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Timetracking {

	private String originalEstimate;

    private String remainingEstimate;

	public String getOriginalEstimate() {
		return originalEstimate;
	}

	public void setOriginalEstimate(String originalEstimate) {
		this.originalEstimate = originalEstimate;
	}

	public String getRemainingEstimate() {
		return remainingEstimate;
	}

	public void setRemainingEstimate(String remainingEstimate) {
		this.remainingEstimate = remainingEstimate;
	}

}
