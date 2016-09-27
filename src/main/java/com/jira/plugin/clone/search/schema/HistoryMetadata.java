package com.jira.plugin.clone.search.schema;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jira.plugin.clone.schema.Actor;


/**
 * History Metadata
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class HistoryMetadata {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("descriptionKey")
    @Expose
    private String descriptionKey;
    @SerializedName("activityDescription")
    @Expose
    private String activityDescription;
    @SerializedName("activityDescriptionKey")
    @Expose
    private String activityDescriptionKey;
    @SerializedName("emailDescription")
    @Expose
    private String emailDescription;
    @SerializedName("emailDescriptionKey")
    @Expose
    private String emailDescriptionKey;
    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     */
    @SerializedName("actor")
    @Expose
    private Actor actor;
    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     */
    @SerializedName("generator")
    @Expose
    private Actor generator;
    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     */
    @SerializedName("cause")
    @Expose
    private Actor cause;
    @SerializedName("extraData")
    @Expose
    private ExtraData extraData;

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
     *     The descriptionKey
     */
    public String getDescriptionKey() {
        return descriptionKey;
    }

    /**
     * 
     * @param descriptionKey
     *     The descriptionKey
     */
    public void setDescriptionKey(String descriptionKey) {
        this.descriptionKey = descriptionKey;
    }

    /**
     * 
     * @return
     *     The activityDescription
     */
    public String getActivityDescription() {
        return activityDescription;
    }

    /**
     * 
     * @param activityDescription
     *     The activityDescription
     */
    public void setActivityDescription(String activityDescription) {
        this.activityDescription = activityDescription;
    }

    /**
     * 
     * @return
     *     The activityDescriptionKey
     */
    public String getActivityDescriptionKey() {
        return activityDescriptionKey;
    }

    /**
     * 
     * @param activityDescriptionKey
     *     The activityDescriptionKey
     */
    public void setActivityDescriptionKey(String activityDescriptionKey) {
        this.activityDescriptionKey = activityDescriptionKey;
    }

    /**
     * 
     * @return
     *     The emailDescription
     */
    public String getEmailDescription() {
        return emailDescription;
    }

    /**
     * 
     * @param emailDescription
     *     The emailDescription
     */
    public void setEmailDescription(String emailDescription) {
        this.emailDescription = emailDescription;
    }

    /**
     * 
     * @return
     *     The emailDescriptionKey
     */
    public String getEmailDescriptionKey() {
        return emailDescriptionKey;
    }

    /**
     * 
     * @param emailDescriptionKey
     *     The emailDescriptionKey
     */
    public void setEmailDescriptionKey(String emailDescriptionKey) {
        this.emailDescriptionKey = emailDescriptionKey;
    }

    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     * @return
     *     The actor
     */
    public Actor getActor() {
        return actor;
    }

    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     * @param actor
     *     The actor
     */
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     * @return
     *     The generator
     */
    public Actor getGenerator() {
        return generator;
    }

    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     * @param generator
     *     The generator
     */
    public void setGenerator(Actor generator) {
        this.generator = generator;
    }

    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     * @return
     *     The cause
     */
    public Actor getCause() {
        return cause;
    }

    /**
     * History Metadata Participant
     * <p>
     * 
     * 
     * @param cause
     *     The cause
     */
    public void setCause(Actor cause) {
        this.cause = cause;
    }

    /**
     * 
     * @return
     *     The extraData
     */
    public ExtraData getExtraData() {
        return extraData;
    }

    /**
     * 
     * @param extraData
     *     The extraData
     */
    public void setExtraData(ExtraData extraData) {
        this.extraData = extraData;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(description).append(descriptionKey).append(activityDescription).append(activityDescriptionKey).append(emailDescription).append(emailDescriptionKey).append(actor).append(generator).append(cause).append(extraData).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HistoryMetadata) == false) {
            return false;
        }
        HistoryMetadata rhs = ((HistoryMetadata) other);
        return new EqualsBuilder().append(type, rhs.type).append(description, rhs.description).append(descriptionKey, rhs.descriptionKey).append(activityDescription, rhs.activityDescription).append(activityDescriptionKey, rhs.activityDescriptionKey).append(emailDescription, rhs.emailDescription).append(emailDescriptionKey, rhs.emailDescriptionKey).append(actor, rhs.actor).append(generator, rhs.generator).append(cause, rhs.cause).append(extraData, rhs.extraData).isEquals();
    }

}
