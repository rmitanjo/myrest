package com.api.myrest.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class PersonEntity {
	protected int id;

	protected String nom;
	
	protected String prenoms;
}
