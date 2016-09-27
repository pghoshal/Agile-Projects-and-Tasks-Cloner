
package com.jira.plugin.clone.schema.search.post.req;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class SearchPostReq {

    @SerializedName("jql")
    @Expose
    private String jql;
    @SerializedName("startAt")
    @Expose
    private Integer startAt;
    @SerializedName("maxResults")
    @Expose
    private Integer maxResults;
    @SerializedName("fields")
    @Expose
    private List<String> fields = new ArrayList<String>();
    @SerializedName("fieldsByKeys")
    @Expose
    private Boolean fieldsByKeys;

    /**
     * 
     * @return
     *     The jql
     */
    public String getJql() {
        return jql;
    }

    /**
     * 
     * @param jql
     *     The jql
     */
    public void setJql(String jql) {
        this.jql = jql;
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
     *     The fields
     */
    public List<String> getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    public void setFields(List<String> fields) {
        this.fields = fields;
    }

    /**
     * 
     * @return
     *     The fieldsByKeys
     */
    public Boolean getFieldsByKeys() {
        return fieldsByKeys;
    }

    /**
     * 
     * @param fieldsByKeys
     *     The fieldsByKeys
     */
    public void setFieldsByKeys(Boolean fieldsByKeys) {
        this.fieldsByKeys = fieldsByKeys;
    }

}
