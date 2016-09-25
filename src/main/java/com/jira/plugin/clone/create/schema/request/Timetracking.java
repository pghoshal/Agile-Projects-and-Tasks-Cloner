package com.jira.plugin.clone.create.schema.request;

public class Timetracking
{
    private String originalEstimate;

    private String remainingEstimate;

    public String getOriginalEstimate ()
    {
        return originalEstimate;
    }

    public void setOriginalEstimate (String originalEstimate)
    {
        this.originalEstimate = originalEstimate;
    }

    public String getRemainingEstimate ()
    {
        return remainingEstimate;
    }

    public void setRemainingEstimate (String remainingEstimate)
    {
        this.remainingEstimate = remainingEstimate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [originalEstimate = "+originalEstimate+", remainingEstimate = "+remainingEstimate+"]";
    }
}