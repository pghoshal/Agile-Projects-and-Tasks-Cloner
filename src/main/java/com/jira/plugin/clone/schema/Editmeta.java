package com.jira.plugin.clone.schema;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Edit Meta
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Editmeta {

    @SerializedName("fields")
    @Expose
    private Fields_ fields;

    /**
     * 
     * @return
     *     The fields
     */
    public Fields_ getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    public void setFields(Fields_ fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fields).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Editmeta) == false) {
            return false;
        }
        Editmeta rhs = ((Editmeta) other);
        return new EqualsBuilder().append(fields, rhs.fields).isEquals();
    }

}
