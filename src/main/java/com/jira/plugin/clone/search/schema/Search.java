package com.jira.plugin.clone.search.schema;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Search Results
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Search {

    @SerializedName("expand")
    @Expose
    private String expand;
    @SerializedName("startAt")
    @Expose
    private Integer startAt;
    @SerializedName("maxResults")
    @Expose
    private Integer maxResults;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("issues")
    @Expose
    private List<Issue> issues = new ArrayList<Issue>();
    @SerializedName("warningMessages")
    @Expose
    private List<String> warningMessages = new ArrayList<String>();
    @SerializedName("names")
    @Expose
    private Names_ names;
    @SerializedName("schema")
    @Expose
    private Schema_ schema;

    /**
     * 
     * @return
     *     The expand
     */
    public String getExpand() {
        return expand;
    }

    /**
     * 
     * @param expand
     *     The expand
     */
    public void setExpand(String expand) {
        this.expand = expand;
    }

    /**
     * 
     * @return
     *     The startAt
     */
    public Integer getStartAt() {
        return startAt;
    }

    /**
     * 
     * @param startAt
     *     The startAt
     */
    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    /**
     * 
     * @return
     *     The maxResults
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * 
     * @param maxResults
     *     The maxResults
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * 
     * @return
     *     The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * 
     * @param total
     *     The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * 
     * @return
     *     The issues
     */
    public List<Issue> getIssues() {
        return issues;
    }

    /**
     * 
     * @param issues
     *     The issues
     */
    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    /**
     * 
     * @return
     *     The warningMessages
     */
    public List<String> getWarningMessages() {
        return warningMessages;
    }

    /**
     * 
     * @param warningMessages
     *     The warningMessages
     */
    public void setWarningMessages(List<String> warningMessages) {
        this.warningMessages = warningMessages;
    }

    /**
     * 
     * @return
     *     The names
     */
    public Names_ getNames() {
        return names;
    }

    /**
     * 
     * @param names
     *     The names
     */
    public void setNames(Names_ names) {
        this.names = names;
    }

    /**
     * 
     * @return
     *     The schema
     */
    public Schema_ getSchema() {
        return schema;
    }

    /**
     * 
     * @param schema
     *     The schema
     */
    public void setSchema(Schema_ schema) {
        this.schema = schema;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(expand).append(startAt).append(maxResults).append(total).append(issues).append(warningMessages).append(names).append(schema).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Search) == false) {
            return false;
        }
        Search rhs = ((Search) other);
        return new EqualsBuilder().append(expand, rhs.expand).append(startAt, rhs.startAt).append(maxResults, rhs.maxResults).append(total, rhs.total).append(issues, rhs.issues).append(warningMessages, rhs.warningMessages).append(names, rhs.names).append(schema, rhs.schema).isEquals();
    }

}
