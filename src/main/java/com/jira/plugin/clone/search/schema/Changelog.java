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
 * Changelog
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Changelog {

    @SerializedName("startAt")
    @Expose
    private Integer startAt;
    @SerializedName("maxResults")
    @Expose
    private Integer maxResults;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("histories")
    @Expose
    private List<History> histories = new ArrayList<History>();

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
     *     The histories
     */
    public List<History> getHistories() {
        return histories;
    }

    /**
     * 
     * @param histories
     *     The histories
     */
    public void setHistories(List<History> histories) {
        this.histories = histories;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(startAt).append(maxResults).append(total).append(histories).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Changelog) == false) {
            return false;
        }
        Changelog rhs = ((Changelog) other);
        return new EqualsBuilder().append(startAt, rhs.startAt).append(maxResults, rhs.maxResults).append(total, rhs.total).append(histories, rhs.histories).isEquals();
    }

}
