package com.api.myrest.models;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ResponseModel {
	@JsonProperty("message")
	protected String message;
	
	@JsonProperty("content")
	protected Map<String, Object> content = new HashMap<>();
	
	@JsonProperty("success")
	protected boolean success;
}
