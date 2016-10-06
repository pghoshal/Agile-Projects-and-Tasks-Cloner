package com.jira.plugin.clone.task;


import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@Generated("org.jsonschema2pojo")
public class IssueCopyResponse {

	@SerializedName("source")
	@Expose
	private String source;
	@SerializedName("destination")
	@Expose
	private String destination;
	@SerializedName("sourceUrl")
	@Expose
	private String sourceUrl;
	@SerializedName("destUrl")
	@Expose
	private String destUrl;

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getUrl() {
		return sourceUrl;
	}

	public void setUrl(String url) {
		this.sourceUrl = url;
	}

	public String getDestUrl() {
		return destUrl;
	}

	public void setDestUrl(String destUrl) {
		this.destUrl = destUrl;
	}

}
