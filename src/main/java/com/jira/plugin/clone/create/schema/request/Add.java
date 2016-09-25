package com.jira.plugin.clone.create.schema.request;

public class Add
{
    private String started;

    private String timeSpent;

    public String getStarted ()
    {
        return started;
    }

    public void setStarted (String started)
    {
        this.started = started;
    }

    public String getTimeSpent ()
    {
        return timeSpent;
    }

    public void setTimeSpent (String timeSpent)
    {
        this.timeSpent = timeSpent;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [started = "+started+", timeSpent = "+timeSpent+"]";
    }
}