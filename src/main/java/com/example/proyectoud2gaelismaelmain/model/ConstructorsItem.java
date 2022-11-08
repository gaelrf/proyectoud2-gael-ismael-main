package com.example.proyectoud2gaelismaelmain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

//Implementamos Serializable para exportar el archivo bin
public class ConstructorsItem implements Serializable {

	@JsonProperty("nationality")
	private String nationality;

	@JsonProperty("name")
	private String name;

	@JsonProperty("constructorId")
	private int constructorId;

	@JsonProperty("url")
	private String url;

	public String getNationality(){
		return nationality;
	}

	public String getName(){
		return name;
	}

	public int getConstructorId(){
		return constructorId;
	}

	public String getUrl(){
		return url;
	}

	public ConstructorsItem(String nationality, String name, int constructorId, String url) {
		this.nationality = nationality;
		this.name = name;
		this.constructorId = constructorId;
		this.url = url;
	}

	//toString que utilizamos para exportar el fichero txt
	@Override
	public String toString() {
		return name;
	}
}