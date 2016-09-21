package com.jira.plugin.clone.schema;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Opsbar
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Operations {

    @SerializedName("linkGroups")
    @Expose
    private List<LinkGroup> linkGroups = new ArrayList<LinkGroup>();

    /**
     * 
     * @return
     *     The linkGroups
     */
    public List<LinkGroup> getLinkGroups() {
        return linkGroups;
    }

    /**
     * 
     * @param linkGroups
     *     The linkGroups
     */
    public void setLinkGroups(List<LinkGroup> linkGroups) {
        this.linkGroups = linkGroups;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(linkGroups).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Operations) == false) {
            return false;
        }
        Operations rhs = ((Operations) other);
        return new EqualsBuilder().append(linkGroups, rhs.linkGroups).isEquals();
    }

}
