package com.jira.plugin.clone.create.schema.request;

public class Worklog
{
    private Add add;

    public Add getAdd ()
    {
        return add;
    }

    public void setAdd (Add add)
    {
        this.add = add;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [add = "+add+"]";
    }
}
	
