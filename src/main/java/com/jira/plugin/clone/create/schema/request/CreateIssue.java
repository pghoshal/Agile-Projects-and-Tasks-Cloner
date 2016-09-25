package com.jira.plugin.clone.create.schema.request;

import com.jira.plugin.clone.issuesearch.schema.Fields;

public class CreateIssue
{
    private Update update;

    private Fields fields;

    public Update getUpdate ()
    {
        return update;
    }

    public void setUpdate (Update update)
    {
        this.update = update;
    }

    public Fields getFields ()
    {
        return fields;
    }

    public void setFields (Fields fields)
    {
        this.fields = fields;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [update = "+update+", fields = "+fields+"]";
    }
}
