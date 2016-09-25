package com.jira.plugin.clone.create.schema.response;

public class CreateIssueResponse
{
    private String id;

    private String title;

    private String additionalProperties;

    private Properties properties;

    private String type;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getAdditionalProperties ()
    {
        return additionalProperties;
    }

    public void setAdditionalProperties (String additionalProperties)
    {
        this.additionalProperties = additionalProperties;
    }

    public Properties getProperties ()
    {
        return properties;
    }

    public void setProperties (Properties properties)
    {
        this.properties = properties;
    }

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
        return "ClassPojo [id = "+id+", title = "+title+", additionalProperties = "+additionalProperties+", properties = "+properties+", type = "+type+"]";
    }
}

