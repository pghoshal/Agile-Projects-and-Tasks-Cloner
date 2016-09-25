package com.jira.plugin.clone.create.schema.request;

public class Fields
{
    private String summary;

    private String customfield_20000;

    private Timetracking timetracking;

    private Issuetype issuetype;

    private String[] labels;

    private String[] customfield_30000;

    private Assignee assignee;

    private FixVersions[] fixVersions;

    private Security security;

    private String[] customfield_70000;

    private String customfield_60000;

    private Reporter reporter;

    private Project project;

    private Versions[] versions;

    private Customfield_80000 customfield_80000;

    private String customfield_40000;

    private String environment;

    private Priority priority;

    private String description;

    private String duedate;

    private Components[] components;

    private String customfield_50000;

    private String customfield_10000;

    public String getSummary ()
    {
        return summary;
    }

    public void setSummary (String summary)
    {
        this.summary = summary;
    }

    public String getCustomfield_20000 ()
    {
        return customfield_20000;
    }

    public void setCustomfield_20000 (String customfield_20000)
    {
        this.customfield_20000 = customfield_20000;
    }

    public Timetracking getTimetracking ()
    {
        return timetracking;
    }

    public void setTimetracking (Timetracking timetracking)
    {
        this.timetracking = timetracking;
    }

    public Issuetype getIssuetype ()
    {
        return issuetype;
    }

    public void setIssuetype (Issuetype issuetype)
    {
        this.issuetype = issuetype;
    }

    public String[] getLabels ()
    {
        return labels;
    }

    public void setLabels (String[] labels)
    {
        this.labels = labels;
    }

    public String[] getCustomfield_30000 ()
    {
        return customfield_30000;
    }

    public void setCustomfield_30000 (String[] customfield_30000)
    {
        this.customfield_30000 = customfield_30000;
    }

    public Assignee getAssignee ()
    {
        return assignee;
    }

    public void setAssignee (Assignee assignee)
    {
        this.assignee = assignee;
    }

    public FixVersions[] getFixVersions ()
    {
        return fixVersions;
    }

    public void setFixVersions (FixVersions[] fixVersions)
    {
        this.fixVersions = fixVersions;
    }

    public Security getSecurity ()
    {
        return security;
    }

    public void setSecurity (Security security)
    {
        this.security = security;
    }

    public String[] getCustomfield_70000 ()
    {
        return customfield_70000;
    }

    public void setCustomfield_70000 (String[] customfield_70000)
    {
        this.customfield_70000 = customfield_70000;
    }

    public String getCustomfield_60000 ()
    {
        return customfield_60000;
    }

    public void setCustomfield_60000 (String customfield_60000)
    {
        this.customfield_60000 = customfield_60000;
    }

    public Reporter getReporter ()
    {
        return reporter;
    }

    public void setReporter (Reporter reporter)
    {
        this.reporter = reporter;
    }

    public Project getProject ()
    {
        return project;
    }

    public void setProject (Project project)
    {
        this.project = project;
    }

    public Versions[] getVersions ()
    {
        return versions;
    }

    public void setVersions (Versions[] versions)
    {
        this.versions = versions;
    }

    public Customfield_80000 getCustomfield_80000 ()
    {
        return customfield_80000;
    }

    public void setCustomfield_80000 (Customfield_80000 customfield_80000)
    {
        this.customfield_80000 = customfield_80000;
    }

    public String getCustomfield_40000 ()
    {
        return customfield_40000;
    }

    public void setCustomfield_40000 (String customfield_40000)
    {
        this.customfield_40000 = customfield_40000;
    }

    public String getEnvironment ()
    {
        return environment;
    }

    public void setEnvironment (String environment)
    {
        this.environment = environment;
    }

    public Priority getPriority ()
    {
        return priority;
    }

    public void setPriority (Priority priority)
    {
        this.priority = priority;
    }

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getDuedate ()
    {
        return duedate;
    }

    public void setDuedate (String duedate)
    {
        this.duedate = duedate;
    }

    public Components[] getComponents ()
    {
        return components;
    }

    public void setComponents (Components[] components)
    {
        this.components = components;
    }

    public String getCustomfield_50000 ()
    {
        return customfield_50000;
    }

    public void setCustomfield_50000 (String customfield_50000)
    {
        this.customfield_50000 = customfield_50000;
    }

    public String getCustomfield_10000 ()
    {
        return customfield_10000;
    }

    public void setCustomfield_10000 (String customfield_10000)
    {
        this.customfield_10000 = customfield_10000;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [summary = "+summary+", customfield_20000 = "+customfield_20000+", timetracking = "+timetracking+", issuetype = "+issuetype+", labels = "+labels+", customfield_30000 = "+customfield_30000+", assignee = "+assignee+", fixVersions = "+fixVersions+", security = "+security+", customfield_70000 = "+customfield_70000+", customfield_60000 = "+customfield_60000+", reporter = "+reporter+", project = "+project+", versions = "+versions+", customfield_80000 = "+customfield_80000+", customfield_40000 = "+customfield_40000+", environment = "+environment+", priority = "+priority+", description = "+description+", duedate = "+duedate+", components = "+components+", customfield_50000 = "+customfield_50000+", customfield_10000 = "+customfield_10000+"]";
    }
}
