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
 * Link Group
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class LinkGroup {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("styleClass")
    @Expose
    private String styleClass;
    /**
     * Simple Link
     * <p>
     * 
     * 
     */
    @SerializedName("header")
    @Expose
    private Header header;
    @SerializedName("weight")
    @Expose
    private Integer weight;
    @SerializedName("links")
    @Expose
    private List<Header> links = new ArrayList<Header>();
    @SerializedName("groups")
    @Expose
    private List<LinkGroup> groups = new ArrayList<LinkGroup>();

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
     * 
     * @return
     *     The styleClass
     */
    public String getStyleClass() {
        return styleClass;
    }

    /**
     * 
     * @param styleClass
     *     The styleClass
     */
    public void setStyleClass(String styleClass) {
        this.styleClass = styleClass;
    }

    /**
     * Simple Link
     * <p>
     * 
     * 
     * @return
     *     The header
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Simple Link
     * <p>
     * 
     * 
     * @param header
     *     The header
     */
    public void setHeader(Header header) {
        this.header = header;
    }

    /**
     * 
     * @return
     *     The weight
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * 
     * @param weight
     *     The weight
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * 
     * @return
     *     The links
     */
    public List<Header> getLinks() {
        return links;
    }

    /**
     * 
     * @param links
     *     The links
     */
    public void setLinks(List<Header> links) {
        this.links = links;
    }

    /**
     * 
     * @return
     *     The groups
     */
    public List<LinkGroup> getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    public void setGroups(List<LinkGroup> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(styleClass).append(header).append(weight).append(links).append(groups).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LinkGroup) == false) {
            return false;
        }
        LinkGroup rhs = ((LinkGroup) other);
        return new EqualsBuilder().append(id, rhs.id).append(styleClass, rhs.styleClass).append(header, rhs.header).append(weight, rhs.weight).append(links, rhs.links).append(groups, rhs.groups).isEquals();
    }

}
