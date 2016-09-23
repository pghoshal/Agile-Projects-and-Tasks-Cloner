
package com.jira.plugin.clone.issuesearch.schema;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Fields {

    @SerializedName("issuetype")
    @Expose
    private Issuetype issuetype;
    @SerializedName("timespent")
    @Expose
    private Object timespent;
    @SerializedName("project")
    @Expose
    private Project project;
    @SerializedName("fixVersions")
    @Expose
    private List<FixVersion> fixVersions = new ArrayList<FixVersion>();
    @SerializedName("aggregatetimespent")
    @Expose
    private Object aggregatetimespent;
    @SerializedName("resolution")
    @Expose
    private Resolution resolution;
    @SerializedName("customfield_10027")
    @Expose
    private Double customfield10027;
    @SerializedName("resolutiondate")
    @Expose
    private String resolutiondate;
    @SerializedName("workratio")
    @Expose
    private Integer workratio;
    @SerializedName("lastViewed")
    @Expose
    private Object lastViewed;
    @SerializedName("watches")
    @Expose
    private Watches watches;
    @SerializedName("created")
    @Expose
    private String created;
    @SerializedName("customfield_10023")
    @Expose
    private List<String> customfield10023 = new ArrayList<String>();
    @SerializedName("priority")
    @Expose
    private Priority priority;
    @SerializedName("customfield_10100")
    @Expose
    private String customfield10100;
    @SerializedName("customfield_10024")
    @Expose
    private String customfield10024;
    @SerializedName("customfield_10025")
    @Expose
    private Object customfield10025;
    @SerializedName("customfield_10026")
    @Expose
    private String customfield10026;
    @SerializedName("labels")
    @Expose
    private List<Object> labels = new ArrayList<Object>();
    @SerializedName("customfield_10016")
    @Expose
    private Object customfield10016;
    @SerializedName("customfield_10017")
    @Expose
    private String customfield10017;
    @SerializedName("customfield_10018")
    @Expose
    private Object customfield10018;
    @SerializedName("customfield_10019")
    @Expose
    private Object customfield10019;
    @SerializedName("timeestimate")
    @Expose
    private Object timeestimate;
    @SerializedName("aggregatetimeoriginalestimate")
    @Expose
    private Object aggregatetimeoriginalestimate;
    @SerializedName("versions")
    @Expose
    private List<Object> versions = new ArrayList<Object>();
    @SerializedName("issuelinks")
    @Expose
    private List<Object> issuelinks = new ArrayList<Object>();
    @SerializedName("assignee")
    @Expose
    private Assignee assignee;
    @SerializedName("updated")
    @Expose
    private String updated;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("components")
    @Expose
    private List<Object> components = new ArrayList<Object>();
    @SerializedName("timeoriginalestimate")
    @Expose
    private Object timeoriginalestimate;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("customfield_10010")
    @Expose
    private Object customfield10010;
    @SerializedName("customfield_10011")
    @Expose
    private Object customfield10011;
    @SerializedName("customfield_10012")
    @Expose
    private Object customfield10012;
    @SerializedName("customfield_10013")
    @Expose
    private Object customfield10013;
    @SerializedName("customfield_10014")
    @Expose
    private Object customfield10014;
    @SerializedName("timetracking")
    @Expose
    private Timetracking timetracking;
    @SerializedName("customfield_10015")
    @Expose
    private Object customfield10015;
    @SerializedName("customfield_10005")
    @Expose
    private Object customfield10005;
    @SerializedName("customfield_10006")
    @Expose
    private Object customfield10006;
    @SerializedName("customfield_10007")
    @Expose
    private Object customfield10007;
    @SerializedName("customfield_10008")
    @Expose
    private Object customfield10008;
    @SerializedName("attachment")
    @Expose
    private List<Object> attachment = new ArrayList<Object>();
    @SerializedName("customfield_10009")
    @Expose
    private Object customfield10009;
    @SerializedName("aggregatetimeestimate")
    @Expose
    private Object aggregatetimeestimate;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("creator")
    @Expose
    private Creator creator;
    @SerializedName("subtasks")
    @Expose
    private List<Object> subtasks = new ArrayList<Object>();
    @SerializedName("reporter")
    @Expose
    private Reporter reporter;
    @SerializedName("customfield_10000")
    @Expose
    private Object customfield10000;
    @SerializedName("aggregateprogress")
    @Expose
    private Aggregateprogress aggregateprogress;
    @SerializedName("customfield_10001")
    @Expose
    private String customfield10001;
    @SerializedName("customfield_10002")
    @Expose
    private Object customfield10002;
    @SerializedName("customfield_10003")
    @Expose
    private List<Object> customfield10003 = new ArrayList<Object>();
    @SerializedName("customfield_10004")
    @Expose
    private Object customfield10004;
    @SerializedName("environment")
    @Expose
    private Object environment;
    @SerializedName("duedate")
    @Expose
    private Object duedate;
    @SerializedName("progress")
    @Expose
    private Progress progress;
    @SerializedName("comment")
    @Expose
    private Comment comment;
    @SerializedName("votes")
    @Expose
    private Votes votes;
    @SerializedName("worklog")
    @Expose
    private Worklog worklog;

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
     *     The timespent
     */
    public Object getTimespent() {
        return timespent;
    }

    /**
     * 
     * @param timespent
     *     The timespent
     */
    public void setTimespent(Object timespent) {
        this.timespent = timespent;
    }

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
     *     The aggregatetimespent
     */
    public Object getAggregatetimespent() {
        return aggregatetimespent;
    }

    /**
     * 
     * @param aggregatetimespent
     *     The aggregatetimespent
     */
    public void setAggregatetimespent(Object aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
    }

    /**
     * 
     * @return
     *     The resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * 
     * @param resolution
     *     The resolution
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    /**
     * 
     * @return
     *     The customfield10027
     */
    public Double getCustomfield10027() {
        return customfield10027;
    }

    /**
     * 
     * @param customfield10027
     *     The customfield_10027
     */
    public void setCustomfield10027(Double customfield10027) {
        this.customfield10027 = customfield10027;
    }

    /**
     * 
     * @return
     *     The resolutiondate
     */
    public String getResolutiondate() {
        return resolutiondate;
    }

    /**
     * 
     * @param resolutiondate
     *     The resolutiondate
     */
    public void setResolutiondate(String resolutiondate) {
        this.resolutiondate = resolutiondate;
    }

    /**
     * 
     * @return
     *     The workratio
     */
    public Integer getWorkratio() {
        return workratio;
    }

    /**
     * 
     * @param workratio
     *     The workratio
     */
    public void setWorkratio(Integer workratio) {
        this.workratio = workratio;
    }

    /**
     * 
     * @return
     *     The lastViewed
     */
    public Object getLastViewed() {
        return lastViewed;
    }

    /**
     * 
     * @param lastViewed
     *     The lastViewed
     */
    public void setLastViewed(Object lastViewed) {
        this.lastViewed = lastViewed;
    }

    /**
     * 
     * @return
     *     The watches
     */
    public Watches getWatches() {
        return watches;
    }

    /**
     * 
     * @param watches
     *     The watches
     */
    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    /**
     * 
     * @return
     *     The created
     */
    public String getCreated() {
        return created;
    }

    /**
     * 
     * @param created
     *     The created
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * 
     * @return
     *     The customfield10023
     */
    public List<String> getCustomfield10023() {
        return customfield10023;
    }

    /**
     * 
     * @param customfield10023
     *     The customfield_10023
     */
    public void setCustomfield10023(List<String> customfield10023) {
        this.customfield10023 = customfield10023;
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
     *     The customfield10100
     */
    public String getCustomfield10100() {
        return customfield10100;
    }

    /**
     * 
     * @param customfield10100
     *     The customfield_10100
     */
    public void setCustomfield10100(String customfield10100) {
        this.customfield10100 = customfield10100;
    }

    /**
     * 
     * @return
     *     The customfield10024
     */
    public String getCustomfield10024() {
        return customfield10024;
    }

    /**
     * 
     * @param customfield10024
     *     The customfield_10024
     */
    public void setCustomfield10024(String customfield10024) {
        this.customfield10024 = customfield10024;
    }

    /**
     * 
     * @return
     *     The customfield10025
     */
    public Object getCustomfield10025() {
        return customfield10025;
    }

    /**
     * 
     * @param customfield10025
     *     The customfield_10025
     */
    public void setCustomfield10025(Object customfield10025) {
        this.customfield10025 = customfield10025;
    }

    /**
     * 
     * @return
     *     The customfield10026
     */
    public String getCustomfield10026() {
        return customfield10026;
    }

    /**
     * 
     * @param customfield10026
     *     The customfield_10026
     */
    public void setCustomfield10026(String customfield10026) {
        this.customfield10026 = customfield10026;
    }

    /**
     * 
     * @return
     *     The labels
     */
    public List<Object> getLabels() {
        return labels;
    }

    /**
     * 
     * @param labels
     *     The labels
     */
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    /**
     * 
     * @return
     *     The customfield10016
     */
    public Object getCustomfield10016() {
        return customfield10016;
    }

    /**
     * 
     * @param customfield10016
     *     The customfield_10016
     */
    public void setCustomfield10016(Object customfield10016) {
        this.customfield10016 = customfield10016;
    }

    /**
     * 
     * @return
     *     The customfield10017
     */
    public String getCustomfield10017() {
        return customfield10017;
    }

    /**
     * 
     * @param customfield10017
     *     The customfield_10017
     */
    public void setCustomfield10017(String customfield10017) {
        this.customfield10017 = customfield10017;
    }

    /**
     * 
     * @return
     *     The customfield10018
     */
    public Object getCustomfield10018() {
        return customfield10018;
    }

    /**
     * 
     * @param customfield10018
     *     The customfield_10018
     */
    public void setCustomfield10018(Object customfield10018) {
        this.customfield10018 = customfield10018;
    }

    /**
     * 
     * @return
     *     The customfield10019
     */
    public Object getCustomfield10019() {
        return customfield10019;
    }

    /**
     * 
     * @param customfield10019
     *     The customfield_10019
     */
    public void setCustomfield10019(Object customfield10019) {
        this.customfield10019 = customfield10019;
    }

    /**
     * 
     * @return
     *     The timeestimate
     */
    public Object getTimeestimate() {
        return timeestimate;
    }

    /**
     * 
     * @param timeestimate
     *     The timeestimate
     */
    public void setTimeestimate(Object timeestimate) {
        this.timeestimate = timeestimate;
    }

    /**
     * 
     * @return
     *     The aggregatetimeoriginalestimate
     */
    public Object getAggregatetimeoriginalestimate() {
        return aggregatetimeoriginalestimate;
    }

    /**
     * 
     * @param aggregatetimeoriginalestimate
     *     The aggregatetimeoriginalestimate
     */
    public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
    }

    /**
     * 
     * @return
     *     The versions
     */
    public List<Object> getVersions() {
        return versions;
    }

    /**
     * 
     * @param versions
     *     The versions
     */
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    /**
     * 
     * @return
     *     The issuelinks
     */
    public List<Object> getIssuelinks() {
        return issuelinks;
    }

    /**
     * 
     * @param issuelinks
     *     The issuelinks
     */
    public void setIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
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
     *     The updated
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * 
     * @param updated
     *     The updated
     */
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    /**
     * 
     * @return
     *     The status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The components
     */
    public List<Object> getComponents() {
        return components;
    }

    /**
     * 
     * @param components
     *     The components
     */
    public void setComponents(List<Object> components) {
        this.components = components;
    }

    /**
     * 
     * @return
     *     The timeoriginalestimate
     */
    public Object getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    /**
     * 
     * @param timeoriginalestimate
     *     The timeoriginalestimate
     */
    public void setTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
    }

    /**
     * 
     * @return
     *     The description
     */
    public Object getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The description
     */
    public void setDescription(Object description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The customfield10010
     */
    public Object getCustomfield10010() {
        return customfield10010;
    }

    /**
     * 
     * @param customfield10010
     *     The customfield_10010
     */
    public void setCustomfield10010(Object customfield10010) {
        this.customfield10010 = customfield10010;
    }

    /**
     * 
     * @return
     *     The customfield10011
     */
    public Object getCustomfield10011() {
        return customfield10011;
    }

    /**
     * 
     * @param customfield10011
     *     The customfield_10011
     */
    public void setCustomfield10011(Object customfield10011) {
        this.customfield10011 = customfield10011;
    }

    /**
     * 
     * @return
     *     The customfield10012
     */
    public Object getCustomfield10012() {
        return customfield10012;
    }

    /**
     * 
     * @param customfield10012
     *     The customfield_10012
     */
    public void setCustomfield10012(Object customfield10012) {
        this.customfield10012 = customfield10012;
    }

    /**
     * 
     * @return
     *     The customfield10013
     */
    public Object getCustomfield10013() {
        return customfield10013;
    }

    /**
     * 
     * @param customfield10013
     *     The customfield_10013
     */
    public void setCustomfield10013(Object customfield10013) {
        this.customfield10013 = customfield10013;
    }

    /**
     * 
     * @return
     *     The customfield10014
     */
    public Object getCustomfield10014() {
        return customfield10014;
    }

    /**
     * 
     * @param customfield10014
     *     The customfield_10014
     */
    public void setCustomfield10014(Object customfield10014) {
        this.customfield10014 = customfield10014;
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
     *     The customfield10015
     */
    public Object getCustomfield10015() {
        return customfield10015;
    }

    /**
     * 
     * @param customfield10015
     *     The customfield_10015
     */
    public void setCustomfield10015(Object customfield10015) {
        this.customfield10015 = customfield10015;
    }

    /**
     * 
     * @return
     *     The customfield10005
     */
    public Object getCustomfield10005() {
        return customfield10005;
    }

    /**
     * 
     * @param customfield10005
     *     The customfield_10005
     */
    public void setCustomfield10005(Object customfield10005) {
        this.customfield10005 = customfield10005;
    }

    /**
     * 
     * @return
     *     The customfield10006
     */
    public Object getCustomfield10006() {
        return customfield10006;
    }

    /**
     * 
     * @param customfield10006
     *     The customfield_10006
     */
    public void setCustomfield10006(Object customfield10006) {
        this.customfield10006 = customfield10006;
    }

    /**
     * 
     * @return
     *     The customfield10007
     */
    public Object getCustomfield10007() {
        return customfield10007;
    }

    /**
     * 
     * @param customfield10007
     *     The customfield_10007
     */
    public void setCustomfield10007(Object customfield10007) {
        this.customfield10007 = customfield10007;
    }

    /**
     * 
     * @return
     *     The customfield10008
     */
    public Object getCustomfield10008() {
        return customfield10008;
    }

    /**
     * 
     * @param customfield10008
     *     The customfield_10008
     */
    public void setCustomfield10008(Object customfield10008) {
        this.customfield10008 = customfield10008;
    }

    /**
     * 
     * @return
     *     The attachment
     */
    public List<Object> getAttachment() {
        return attachment;
    }

    /**
     * 
     * @param attachment
     *     The attachment
     */
    public void setAttachment(List<Object> attachment) {
        this.attachment = attachment;
    }

    /**
     * 
     * @return
     *     The customfield10009
     */
    public Object getCustomfield10009() {
        return customfield10009;
    }

    /**
     * 
     * @param customfield10009
     *     The customfield_10009
     */
    public void setCustomfield10009(Object customfield10009) {
        this.customfield10009 = customfield10009;
    }

    /**
     * 
     * @return
     *     The aggregatetimeestimate
     */
    public Object getAggregatetimeestimate() {
        return aggregatetimeestimate;
    }

    /**
     * 
     * @param aggregatetimeestimate
     *     The aggregatetimeestimate
     */
    public void setAggregatetimeestimate(Object aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
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
     *     The creator
     */
    public Creator getCreator() {
        return creator;
    }

    /**
     * 
     * @param creator
     *     The creator
     */
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    /**
     * 
     * @return
     *     The subtasks
     */
    public List<Object> getSubtasks() {
        return subtasks;
    }

    /**
     * 
     * @param subtasks
     *     The subtasks
     */
    public void setSubtasks(List<Object> subtasks) {
        this.subtasks = subtasks;
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
     *     The customfield10000
     */
    public Object getCustomfield10000() {
        return customfield10000;
    }

    /**
     * 
     * @param customfield10000
     *     The customfield_10000
     */
    public void setCustomfield10000(Object customfield10000) {
        this.customfield10000 = customfield10000;
    }

    /**
     * 
     * @return
     *     The aggregateprogress
     */
    public Aggregateprogress getAggregateprogress() {
        return aggregateprogress;
    }

    /**
     * 
     * @param aggregateprogress
     *     The aggregateprogress
     */
    public void setAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
    }

    /**
     * 
     * @return
     *     The customfield10001
     */
    public String getCustomfield10001() {
        return customfield10001;
    }

    /**
     * 
     * @param customfield10001
     *     The customfield_10001
     */
    public void setCustomfield10001(String customfield10001) {
        this.customfield10001 = customfield10001;
    }

    /**
     * 
     * @return
     *     The customfield10002
     */
    public Object getCustomfield10002() {
        return customfield10002;
    }

    /**
     * 
     * @param customfield10002
     *     The customfield_10002
     */
    public void setCustomfield10002(Object customfield10002) {
        this.customfield10002 = customfield10002;
    }

    /**
     * 
     * @return
     *     The customfield10003
     */
    public List<Object> getCustomfield10003() {
        return customfield10003;
    }

    /**
     * 
     * @param customfield10003
     *     The customfield_10003
     */
    public void setCustomfield10003(List<Object> customfield10003) {
        this.customfield10003 = customfield10003;
    }

    /**
     * 
     * @return
     *     The customfield10004
     */
    public Object getCustomfield10004() {
        return customfield10004;
    }

    /**
     * 
     * @param customfield10004
     *     The customfield_10004
     */
    public void setCustomfield10004(Object customfield10004) {
        this.customfield10004 = customfield10004;
    }

    /**
     * 
     * @return
     *     The environment
     */
    public Object getEnvironment() {
        return environment;
    }

    /**
     * 
     * @param environment
     *     The environment
     */
    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    /**
     * 
     * @return
     *     The duedate
     */
    public Object getDuedate() {
        return duedate;
    }

    /**
     * 
     * @param duedate
     *     The duedate
     */
    public void setDuedate(Object duedate) {
        this.duedate = duedate;
    }

    /**
     * 
     * @return
     *     The progress
     */
    public Progress getProgress() {
        return progress;
    }

    /**
     * 
     * @param progress
     *     The progress
     */
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    /**
     * 
     * @return
     *     The comment
     */
    public Comment getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *     The comment
     */
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    /**
     * 
     * @return
     *     The votes
     */
    public Votes getVotes() {
        return votes;
    }

    /**
     * 
     * @param votes
     *     The votes
     */
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    /**
     * 
     * @return
     *     The worklog
     */
    public Worklog getWorklog() {
        return worklog;
    }

    /**
     * 
     * @param worklog
     *     The worklog
     */
    public void setWorklog(Worklog worklog) {
        this.worklog = worklog;
    }

}
