
package com.jira.plugin.clone.create.schema.request;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Add {

    @SerializedName("timeSpent")
    @Expose
    private String timeSpent;
    @SerializedName("started")
    @Expose
    private String started;

    /**
     * 
     * @return
     *     The timeSpent
     */
    public String getTimeSpent() {
        return timeSpent;
    }

    /**
     * 
     * @param timeSpent
     *     The timeSpent
     */
    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    /**
     * 
     * @return
     *     The started
     */
    public String getStarted() {
        return started;
    }

    /**
     * 
     * @param started
     *     The started
     */
    public void setStarted(String started) {
        this.started = started;
    }

}
