
package com.jira.plugin.clone.issuesearch.schema;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Votes {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("votes")
    @Expose
    private Integer votes;
    @SerializedName("hasVoted")
    @Expose
    private Boolean hasVoted;

    /**
     * 
     * @return
     *     The self
     */
    public String getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(String self) {
        this.self = self;
    }

    /**
     * 
     * @return
     *     The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     * 
     * @param votes
     *     The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    /**
     * 
     * @return
     *     The hasVoted
     */
    public Boolean getHasVoted() {
        return hasVoted;
    }

    /**
     * 
     * @param hasVoted
     *     The hasVoted
     */
    public void setHasVoted(Boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

}
