package com.jira.plugin.clone.create.schema.response;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
* Issue Create Response
* <p>
* 
* 
*/
@Generated("org.jsonschema2pojo")
public class IssueCreateResponse {

@SerializedName("id")
@Expose
private String id;
@SerializedName("key")
@Expose
private String key;
@SerializedName("self")
@Expose
private String self;

/**
* 
* @return
* The id
*/
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The key
*/
public String getKey() {
return key;
}

/**
* 
* @param key
* The key
*/
public void setKey(String key) {
this.key = key;
}

/**
* 
* @return
* The self
*/
public String getSelf() {
return self;
}

/**
* 
* @param self
* The self
*/
public void setSelf(String self) {
this.self = self;
}

}