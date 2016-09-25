package com.jira.plugin.clone.create.schema.response;

public class Properties
{
    private Id id;

    private Self self;

    private Key key;

    public Id getId ()
    {
        return id;
    }

    public void setId (Id id)
    {
        this.id = id;
    }

    public Self getSelf ()
    {
        return self;
    }

    public void setSelf (Self self)
    {
        this.self = self;
    }

    public Key getKey ()
    {
        return key;
    }

    public void setKey (Key key)
    {
        this.key = key;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", self = "+self+", key = "+key+"]";
    }
}
