
package com.jira.plugin.clone.create.schema.request;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Fields {

    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("issuetype")
    @Expose
    private Issuetype issuetype;
    @SerializedName("assignee")
    @Expose
    private Assignee assignee;
    @SerializedName("reporter")
    @Expose
    private Reporter reporter;
    @SerializedName("priority")
    @Expose
    private Priority priority;
    @SerializedName("labels")
    @Expose
    private List<String> labels = new ArrayList<String>();
    @SerializedName("timetracking")
    @Expose
    private Timetracking timetracking;
    @SerializedName("security")
    @Expose
    private Security security;
    @SerializedName("versions")
    @Expose
    private List<Version> versions;
    @SerializedName("environment")
    @Expose
    private String environment;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("duedate")
    @Expose
    private String duedate;
    @SerializedName("fixVersions")
    @Expose
    private List<FixVersion> fixVersions = new ArrayList<FixVersion>();
    @SerializedName("components")
    @Expose
    private List<Component> components = new ArrayList<Component>();
    @SerializedName("customfield_30000")
    @Expose
    private List<String> customfield30000;
    @SerializedName("customfield_80000")
    @Expose
    private Customfield80000 customfield80000;
    @SerializedName("customfield_20000")
    @Expose
    private String customfield20000;
    @SerializedName("customfield_40000")
    @Expose
    private String customfield40000;
    @SerializedName("customfield_70000")
    @Expose
    private List<String> customfield70000;
    @SerializedName("customfield_60000")
    @Expose
    private String customfield60000;
    @SerializedName("customfield_50000")
    @Expose
    private String customfield50000;
    @SerializedName("customfield_10000")
    @Expose
    private String customfield10000;

    /**
     * 
     * @return
     *     The project
     */
    public Project getProject() {
        return project;
    }

    /**
     * 
     * @param project
     *     The project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * 
     * @return
     *     The summary
     */
    public String getSummary() {
        return summary;
    }

    /**
     * 
     * @param summary
     *     The summary
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * 
     * @return
     *     The issuetype
     */
    public Issuetype getIssuetype() {
        return issuetype;
    }

    /**
     * 
     * @param issuetype
     *     The issuetype
     */
    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    /**
     * 
     * @return
     *     The assignee
     */
    public Assignee getAssignee() {
        return assignee;
    }

    /**
     * 
     * @param assignee
     *     The assignee
     */
    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    /**
     * 
     * @return
     *     The reporter
     */
    public Reporter getReporter() {
        return reporter;
    }

    /**
     * 
     * @param reporter
     *     The reporter
     */
    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    /**
     * 
     * @return
     *     The priority
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * 
     * @param priority
     *     The priority
     */
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    /**
     * 
     * @return
     *     The labels
     */
    public List<String> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The timetracking
     */
    public Timetracking getTimetracking() {
        return timetracking;
    }

    /**
     * 
     * @param timetracking
     *     The timetracking
     */
    public void setTimetracking(Timetracking timetracking) {
        this.timetracking = timetracking;
    }

    /**
     * 
     * @return
     *     The security
     */
    public Security getSecurity() {
        return security;
    }

    /**
     * 
     * @param security
     *     The security
     */
    public void setSecurity(Security security) {
        this.security = security;
    }

    /**
     * 
     * @return
     *     The versions
     */
    public List<Version> getVersions() {
        return versions;
    }

    /**
     * 
     * @param versions
     *     The versions
     */
    public void setVersions(List<Version> versions) {
        this.versions = versions;
    }

    /**
     * 
     * @return
     *     The environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * 
     * @param environment
     *     The environment
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
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
     *     The duedate
     */
    public String getDuedate() {
        return duedate;
    }

    /**
     * 
     * @param duedate
     *     The duedate
     */
    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    /**
     * 
     * @return
     *     The fixVersions
     */
    public List<FixVersion> getFixVersions() {
        return fixVersions;
    }

    /**
     * 
     * @param fixVersions
     *     The fixVersions
     */
    public void setFixVersions(List<FixVersion> fixVersions) {
        this.fixVersions = fixVersions;
    }

    /**
     * 
     * @return
     *     The components
     */
    public List<Component> getComponents() {
        return components;
    }

    /**
     * 
     * @param components
     *     The components
     */
    public void setComponents(List<Component> components) {
        this.components = components;
    }

    /**
     * 
     * @return
     *     The customfield30000
     */
    public List<String> getCustomfield30000() {
        return customfield30000;
    }

    /**
     * 
     * @param customfield30000
     *     The customfield_30000
     */
    public void setCustomfield30000(List<String> customfield30000) {
        this.customfield30000 = customfield30000;
    }

    /**
     * 
     * @return
     *     The customfield80000
     */
    public Customfield80000 getCustomfield80000() {
        return customfield80000;
    }

    /**
     * 
     * @param customfield80000
     *     The customfield_80000
     */
    public void setCustomfield80000(Customfield80000 customfield80000) {
        this.customfield80000 = customfield80000;
    }

    /**
     * 
     * @return
     *     The customfield20000
     */
    public String getCustomfield20000() {
        return customfield20000;
    }

    /**
     * 
     * @param customfield20000
     *     The customfield_20000
     */
    public void setCustomfield20000(String customfield20000) {
        this.customfield20000 = customfield20000;
    }

    /**
     * 
     * @return
     *     The customfield40000
     */
    public String getCustomfield40000() {
        return customfield40000;
    }

    /**
     * 
     * @param customfield40000
     *     The customfield_40000
     */
    public void setCustomfield40000(String customfield40000) {
        this.customfield40000 = customfield40000;
    }

    /**
     * 
     * @return
     *     The customfield70000
     */
    public List<String> getCustomfield70000() {
        return customfield70000;
    }

    /**
     * 
     * @param customfield70000
     *     The customfield_70000
     */
    public void setCustomfield70000(List<String> customfield70000) {
        this.customfield70000 = customfield70000;
    }

    /**
     * 
     * @return
     *     The customfield60000
     */
    public String getCustomfield60000() {
        return customfield60000;
    }

    /**
     * 
     * @param customfield60000
     *     The customfield_60000
     */
    public void setCustomfield60000(String customfield60000) {
        this.customfield60000 = customfield60000;
    }

    /**
     * 
     * @return
     *     The customfield50000
     */
    public String getCustomfield50000() {
        return customfield50000;
    }

    /**
     * 
     * @param customfield50000
     *     The customfield_50000
     */
    public void setCustomfield50000(String customfield50000) {
        this.customfield50000 = customfield50000;
    }

    /**
     * 
     * @return
     *     The customfield10000
     */
    public String getCustomfield10000() {
        return customfield10000;
    }

    /**
     * 
     * @param customfield10000
     *     The customfield_10000
     */
    public void setCustomfield10000(String customfield10000) {
        this.customfield10000 = customfield10000;
    }

}
