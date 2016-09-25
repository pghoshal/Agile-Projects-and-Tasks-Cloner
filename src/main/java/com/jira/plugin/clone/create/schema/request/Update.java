
package com.jira.plugin.clone.create.schema.request;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Update {

    @SerializedName("worklog")
    @Expose
    private List<Worklog> worklog = new ArrayList<Worklog>();

    /**
     * 
     * @return
     *     The worklogs
     */
    public List<Worklog> getWorklog() {
        return worklog;
    }

    /**
     * 
     * @param worklogs
     *     The worklogs
     */
    public void setWorklog(List<Worklog> worklog) {
        this.worklog = worklog;
    }
    
    public void addWorklog(Worklog worklog){
    	this.worklog.add(worklog);
    }

}
