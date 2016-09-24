package com.jira.plugin.clone.search.schema;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Change Item
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("field")
    @Expose
    private String field;
    @SerializedName("fieldtype")
    @Expose
    private String fieldtype;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("fromString")
    @Expose
    private String fromString;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("toString")
    @Expose
    private String toString;

    /**
     * 
     * @return
     *     The field
     */
    public String getField() {
        return field;
    }

    /**
     * 
     * @param field
     *     The field
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * 
     * @return
     *     The fieldtype
     */
    public String getFieldtype() {
        return fieldtype;
    }

    /**
     * 
     * @param fieldtype
     *     The fieldtype
     */
    public void setFieldtype(String fieldtype) {
        this.fieldtype = fieldtype;
    }

    /**
     * 
     * @return
     *     The from
     */
    public String getFrom() {
        return from;
    }

    /**
     * 
     * @param from
     *     The from
     */
    public void setFrom(String from) {
        this.from = from;
    }

    /**
     * 
     * @return
     *     The fromString
     */
    public String getFromString() {
        return fromString;
    }

    /**
     * 
     * @param fromString
     *     The fromString
     */
    public void setFromString(String fromString) {
        this.fromString = fromString;
    }

    /**
     * 
     * @return
     *     The to
     */
    public String getTo() {
        return to;
    }

    /**
     * 
     * @param to
     *     The to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * 
     * @return
     *     The toString
     */
    public String getToString() {
        return toString;
    }

    /**
     * 
     * @param toString
     *     The toString
     */
    public void setToString(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(field).append(fieldtype).append(from).append(fromString).append(to).append(toString).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(field, rhs.field).append(fieldtype, rhs.fieldtype).append(from, rhs.from).append(fromString, rhs.fromString).append(to, rhs.to).append(toString, rhs.toString).isEquals();
    }

}
