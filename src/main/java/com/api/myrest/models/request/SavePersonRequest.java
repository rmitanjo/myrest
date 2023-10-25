package com.api.myrest.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SavePersonRequest {
	@JsonProperty("nom")
	private String nom;
	
	@JsonProperty("prenoms")
	private String prenoms;
}
