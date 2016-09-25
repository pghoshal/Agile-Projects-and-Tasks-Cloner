package com.jira.plugin.clone.create.schema.response;

public class Self
{
    private String type;

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [type = "+type+"]";
    }
}
