package com.jira.plugin.clone.create.schema.request;

public class Update
{
    private Worklog[] worklog;

    public Worklog[] getWorklog ()
    {
        return worklog;
    }

    public void setWorklog (Worklog[] worklog)
    {
        this.worklog = worklog;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [worklog = "+worklog+"]";
    }
}
