package com.jira.plugin.clone.schema;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Transition
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Transition {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    /**
     * Status
     * <p>
     * 
     * 
     */
    @SerializedName("to")
    @Expose
    private To to;
    @SerializedName("hasScreen")
    @Expose
    private Boolean hasScreen;
    @SerializedName("fields")
    @Expose
    private Fields fields;
    @SerializedName("expand")
    @Expose
    private String expand;

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
     * Status
     * <p>
     * 
     * 
     * @return
     *     The to
     */
    public To getTo() {
        return to;
    }

    /**
     * Status
     * <p>
     * 
     * 
     * @param to
     *     The to
     */
    public void setTo(To to) {
        this.to = to;
    }

    /**
     * 
     * @return
     *     The hasScreen
     */
    public Boolean getHasScreen() {
        return hasScreen;
    }

    /**
     * 
     * @param hasScreen
     *     The hasScreen
     */
    public void setHasScreen(Boolean hasScreen) {
        this.hasScreen = hasScreen;
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

    /**
     * 
     * @return
     *     The expand
     */
    public String getExpand() {
        return expand;
    }

    /**
     * 
     * @param expand
     *     The expand
     */
    public void setExpand(String expand) {
        this.expand = expand;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(name).append(to).append(hasScreen).append(fields).append(expand).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Transition) == false) {
            return false;
        }
        Transition rhs = ((Transition) other);
        return new EqualsBuilder().append(id, rhs.id).append(name, rhs.name).append(to, rhs.to).append(hasScreen, rhs.hasScreen).append(fields, rhs.fields).append(expand, rhs.expand).isEquals();
    }

}
