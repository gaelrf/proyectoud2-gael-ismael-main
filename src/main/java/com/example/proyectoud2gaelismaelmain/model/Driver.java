package com.example.proyectoud2gaelismaelmain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Driver implements Serializable {

	@JsonProperty("code")
	private String code;

	@JsonProperty("driverId")
	private String driverId;

	@JsonProperty("permanentNumber")
	private String permanentNumber;

	@JsonProperty("nationality")
	private String nationality;

	@JsonProperty("givenName")
	private String givenName;

	@JsonProperty("familyName")
	private String familyName;

	@JsonProperty("dateOfBirth")
	private String dateOfBirth;

	@JsonProperty("url")
	private String url;

	public String getCode(){
		return code;
	}

	public String getDriverId(){
		return driverId;
	}

	public String getPermanentNumber(){
		return permanentNumber;
	}

	public String getNationality(){
		return nationality;
	}

	public String getGivenName(){
		return givenName;
	}

	public String getFamilyName(){
		return familyName;
	}

	public String getDateOfBirth(){
		return dateOfBirth;
	}

	public String getUrl(){
		return url;
	}

	@Override
	public String toString() {
		return givenName + " " + familyName;
	}
}