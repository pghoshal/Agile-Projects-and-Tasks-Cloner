package com.jira.plugin.clone.create.schema.request;

public class Customfield_80000
{
    private String value;

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [value = "+value+"]";
    }
}