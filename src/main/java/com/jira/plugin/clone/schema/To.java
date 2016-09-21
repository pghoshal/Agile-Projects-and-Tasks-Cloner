package com.jira.plugin.clone.schema;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Status
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class To {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("statusColor")
    @Expose
    private String statusColor;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("iconUrl")
    @Expose
    private String iconUrl;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * Status Category
     * <p>
     * 
     * 
     */
    @SerializedName("statusCategory")
    @Expose
    private StatusCategory statusCategory;

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
     *     The statusColor
     */
    public String getStatusColor() {
        return statusColor;
    }

    /**
     * 
     * @param statusColor
     *     The statusColor
     */
    public void setStatusColor(String statusColor) {
        this.statusColor = statusColor;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    /**
     * 
     * @param iconUrl
     *     The iconUrl
     */
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Status Category
     * <p>
     * 
     * 
     * @return
     *     The statusCategory
     */
    public StatusCategory getStatusCategory() {
        return statusCategory;
    }

    /**
     * Status Category
     * <p>
     * 
     * 
     * @param statusCategory
     *     The statusCategory
     */
    public void setStatusCategory(StatusCategory statusCategory) {
        this.statusCategory = statusCategory;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(self).append(statusColor).append(description).append(iconUrl).append(name).append(id).append(statusCategory).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof To) == false) {
            return false;
        }
        To rhs = ((To) other);
        return new EqualsBuilder().append(self, rhs.self).append(statusColor, rhs.statusColor).append(description, rhs.description).append(iconUrl, rhs.iconUrl).append(name, rhs.name).append(id, rhs.id).append(statusCategory, rhs.statusCategory).isEquals();
    }

}
