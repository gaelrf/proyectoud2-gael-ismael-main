package com.example.proyectoud2gaelismaelmain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ConstructorsItem implements Serializable {

	@JsonProperty("nationality")
	private String nationality;

	@JsonProperty("name")
	private String name;

	@JsonProperty("constructorId")
	private String constructorId;

	@JsonProperty("url")
	private String url;

	public String getNationality(){
		return nationality;
	}

	public String getName(){
		return name;
	}

	public String getConstructorId(){
		return constructorId;
	}

	public String getUrl(){
		return url;
	}

	@Override
	public String toString() {
		return name;
	}
}