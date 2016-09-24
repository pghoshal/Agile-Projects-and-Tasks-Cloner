package com.jira.plugin.clone.search.schema;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Issue
 * <p>
 * 
 * 
 */
@Generated("org.jsonschema2pojo")
public class Issue {

    @SerializedName("expand")
    @Expose
    private String expand;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("self")
    @Expose
    private URI self;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("renderedFields")
    @Expose
    private RenderedFields renderedFields;
    /**
     * Properties
     * <p>
     * 
     * 
     */
    @SerializedName("properties")
    @Expose
    private Properties properties;
    @SerializedName("names")
    @Expose
    private Names names;
    @SerializedName("schema")
    @Expose
    private Schema schema;
    @SerializedName("transitions")
    @Expose
    private List<Transition> transitions = new ArrayList<Transition>();
    /**
     * Opsbar
     * <p>
     * 
     * 
     */
    @SerializedName("operations")
    @Expose
    private Operations operations;
    /**
     * Edit Meta
     * <p>
     * 
     * 
     */
    @SerializedName("editmeta")
    @Expose
    private Editmeta editmeta;
    /**
     * Changelog
     * <p>
     * 
     * 
     */
    @SerializedName("changelog")
    @Expose
    private Changelog changelog;
    @SerializedName("versionedRepresentations")
    @Expose
    private VersionedRepresentations versionedRepresentations;
    /**
     * Included Fields
     * <p>
     * 
     * 
     */
    @SerializedName("fieldsToInclude")
    @Expose
    private FieldsToInclude fieldsToInclude;
    @SerializedName("fields")
    @Expose
    private Fields__ fields;

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
     *     The self
     */
    public URI getSelf() {
        return self;
    }

    /**
     * 
     * @param self
     *     The self
     */
    public void setSelf(URI self) {
        this.self = self;
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
     *     The renderedFields
     */
    public RenderedFields getRenderedFields() {
        return renderedFields;
    }

    /**
     * 
     * @param renderedFields
     *     The renderedFields
     */
    public void setRenderedFields(RenderedFields renderedFields) {
        this.renderedFields = renderedFields;
    }

    /**
     * Properties
     * <p>
     * 
     * 
     * @return
     *     The properties
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * Properties
     * <p>
     * 
     * 
     * @param properties
     *     The properties
     */
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * 
     * @return
     *     The names
     */
    public Names getNames() {
        return names;
    }

    /**
     * 
     * @param names
     *     The names
     */
    public void setNames(Names names) {
        this.names = names;
    }

    /**
     * 
     * @return
     *     The schema
     */
    public Schema getSchema() {
        return schema;
    }

    /**
     * 
     * @param schema
     *     The schema
     */
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * 
     * @return
     *     The transitions
     */
    public List<Transition> getTransitions() {
        return transitions;
    }

    /**
     * 
     * @param transitions
     *     The transitions
     */
    public void setTransitions(List<Transition> transitions) {
        this.transitions = transitions;
    }

    /**
     * Opsbar
     * <p>
     * 
     * 
     * @return
     *     The operations
     */
    public Operations getOperations() {
        return operations;
    }

    /**
     * Opsbar
     * <p>
     * 
     * 
     * @param operations
     *     The operations
     */
    public void setOperations(Operations operations) {
        this.operations = operations;
    }

    /**
     * Edit Meta
     * <p>
     * 
     * 
     * @return
     *     The editmeta
     */
    public Editmeta getEditmeta() {
        return editmeta;
    }

    /**
     * Edit Meta
     * <p>
     * 
     * 
     * @param editmeta
     *     The editmeta
     */
    public void setEditmeta(Editmeta editmeta) {
        this.editmeta = editmeta;
    }

    /**
     * Changelog
     * <p>
     * 
     * 
     * @return
     *     The changelog
     */
    public Changelog getChangelog() {
        return changelog;
    }

    /**
     * Changelog
     * <p>
     * 
     * 
     * @param changelog
     *     The changelog
     */
    public void setChangelog(Changelog changelog) {
        this.changelog = changelog;
    }

    /**
     * 
     * @return
     *     The versionedRepresentations
     */
    public VersionedRepresentations getVersionedRepresentations() {
        return versionedRepresentations;
    }

    /**
     * 
     * @param versionedRepresentations
     *     The versionedRepresentations
     */
    public void setVersionedRepresentations(VersionedRepresentations versionedRepresentations) {
        this.versionedRepresentations = versionedRepresentations;
    }

    /**
     * Included Fields
     * <p>
     * 
     * 
     * @return
     *     The fieldsToInclude
     */
    public FieldsToInclude getFieldsToInclude() {
        return fieldsToInclude;
    }

    /**
     * Included Fields
     * <p>
     * 
     * 
     * @param fieldsToInclude
     *     The fieldsToInclude
     */
    public void setFieldsToInclude(FieldsToInclude fieldsToInclude) {
        this.fieldsToInclude = fieldsToInclude;
    }

    /**
     * 
     * @return
     *     The fields
     */
    public Fields__ getFields() {
        return fields;
    }

    /**
     * 
     * @param fields
     *     The fields
     */
    public void setFields(Fields__ fields) {
        this.fields = fields;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(expand).append(id).append(self).append(key).append(renderedFields).append(properties).append(names).append(schema).append(transitions).append(operations).append(editmeta).append(changelog).append(versionedRepresentations).append(fieldsToInclude).append(fields).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Issue) == false) {
            return false;
        }
        Issue rhs = ((Issue) other);
        return new EqualsBuilder().append(expand, rhs.expand).append(id, rhs.id).append(self, rhs.self).append(key, rhs.key).append(renderedFields, rhs.renderedFields).append(properties, rhs.properties).append(names, rhs.names).append(schema, rhs.schema).append(transitions, rhs.transitions).append(operations, rhs.operations).append(editmeta, rhs.editmeta).append(changelog, rhs.changelog).append(versionedRepresentations, rhs.versionedRepresentations).append(fieldsToInclude, rhs.fieldsToInclude).append(fields, rhs.fields).isEquals();
    }

}
