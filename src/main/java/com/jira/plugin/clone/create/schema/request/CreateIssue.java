
package com.jira.plugin.clone.create.schema.request;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class CreateIssue {

    @SerializedName("update")
    @Expose
    private Update update;
    @SerializedName("fields")
    @Expose
    private Fields fields;

    /**
     * 
     * @return
     *     The update
     */
    public Update getUpdate() {
        return update;
    }

    /**
     * 
     * @param update
     *     The update
     */
    public void setUpdate(Update update) {
        this.update = update;
    }

    /**
     * 
     * @return
     *     The fields
     */
    public Fields getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    public void setFields(Fields fields) {
        this.fields = fields;
    }

}
