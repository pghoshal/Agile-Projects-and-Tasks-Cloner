package com.jira.plugin.clone.search.schema;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Status Category
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class StatusCategory {

    @SerializedName("self")
    @Expose
    private String self;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("colorName")
    @Expose
    private String colorName;
    @SerializedName("name")
    @Expose
    private String name;

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
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The key
     */
    public String getKey() {
        return key;
    }

    /**
     * 
     * @param key
     *     The key
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 
     * @return
     *     The colorName
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * 
     * @param colorName
     *     The colorName
     */
    public void setColorName(String colorName) {
        this.colorName = colorName;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(self).append(id).append(key).append(colorName).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StatusCategory) == false) {
            return false;
        }
        StatusCategory rhs = ((StatusCategory) other);
        return new EqualsBuilder().append(self, rhs.self).append(id, rhs.id).append(key, rhs.key).append(colorName, rhs.colorName).append(name, rhs.name).isEquals();
    }

}
