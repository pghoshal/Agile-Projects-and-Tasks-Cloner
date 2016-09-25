package com.jira.plugin.clone.search.schema;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * History Metadata Participant
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Actor {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("displayName")
    @Expose
    private String displayName;
    @SerializedName("displayNameKey")
    @Expose
    private String displayNameKey;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("avatarUrl")
    @Expose
    private String avatarUrl;
    @SerializedName("url")
    @Expose
    private String url;

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
     *     The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The displayNameKey
     */
    public String getDisplayNameKey() {
        return displayNameKey;
    }

    /**
     * 
     * @param displayNameKey
     *     The displayNameKey
     */
    public void setDisplayNameKey(String displayNameKey) {
        this.displayNameKey = displayNameKey;
    }

    /**
     * 
     * @return
     *     The type
     */
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * @return
     *     The avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * 
     * @param avatarUrl
     *     The avatarUrl
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(displayName).append(displayNameKey).append(type).append(avatarUrl).append(url).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Actor) == false) {
            return false;
        }
        Actor rhs = ((Actor) other);
        return new EqualsBuilder().append(id, rhs.id).append(displayName, rhs.displayName).append(displayNameKey, rhs.displayNameKey).append(type, rhs.type).append(avatarUrl, rhs.avatarUrl).append(url, rhs.url).isEquals();
    }

}
