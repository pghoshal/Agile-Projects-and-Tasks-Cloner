package com.jira.plugin.clone.schema;
import javax.annotation.Generated;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.atlassian.jira.rest.client.api.domain.IssueType;

@Generated("org.jsonschema2pojo")
public class Fields__ {


	private IssueType issuetype;
	
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

	public IssueType getIssuetype() {
		return issuetype;
	}

	public void setIssuetype(IssueType issuetype) {
		this.issuetype = issuetype;
	}

}
