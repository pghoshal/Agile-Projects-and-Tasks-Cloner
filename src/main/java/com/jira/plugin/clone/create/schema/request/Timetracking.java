
package com.jira.plugin.clone.create.schema.request;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Timetracking {

    @SerializedName("originalEstimate")
    @Expose
    private String originalEstimate;
    @SerializedName("remainingEstimate")
    @Expose
    private String remainingEstimate;

    /**
     * 
     * @return
     *     The originalEstimate
     */
    public String getOriginalEstimate() {
        return originalEstimate;
    }

    /**
     * 
     * @param originalEstimate
     *     The originalEstimate
     */
    public void setOriginalEstimate(String originalEstimate) {
        this.originalEstimate = originalEstimate;
    }

    /**
     * 
     * @return
     *     The remainingEstimate
     */
    public String getRemainingEstimate() {
        return remainingEstimate;
    }

    /**
     * 
     * @param remainingEstimate
     *     The remainingEstimate
     */
    public void setRemainingEstimate(String remainingEstimate) {
        this.remainingEstimate = remainingEstimate;
    }

}
