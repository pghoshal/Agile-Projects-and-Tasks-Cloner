
package com.jira.plugin.clone.create.schema.request;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Worklog {

    @SerializedName("add")
    @Expose
    private Add add;

    /**
     * 
     * @return
     *     The add
     */
    public Add getAdd() {
        return add;
    }

    /**
     * 
     * @param add
     *     The add
     */
    public void setAdd(Add add) {
        this.add = add;
    }

}
