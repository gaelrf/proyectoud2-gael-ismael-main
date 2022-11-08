package com.example.proyectoud2gaelismaelmain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.time.LocalDate;

//Implementamos Serializable para exportar el archivo bin
public class Conductor implements Serializable {

	@JsonProperty("code")
	private String code;

	@JsonProperty("driverId")
	private int driverId;

	@JsonProperty("permanentNumber")
	private int permanentNumber;

	@JsonProperty("nationality")
	private String nationality;

	@JsonProperty("givenName")
	private String givenName;

	@JsonProperty("familyName")
	private String familyName;

	@JsonProperty("dateOfBirth")
	private LocalDate dateOfBirth;

	@JsonProperty("url")
	private String url;

	public String getCode(){
		return code;
	}

	public int getDriverId(){
		return driverId;
	}

	public int getPermanentNumber(){
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

	public LocalDate getDateOfBirth(){
		return dateOfBirth;
	}

	public String getUrl(){
		return url;
	}

	public Conductor(String code, int driverId, int permanentNumber, String nationality, String givenName, String familyName, LocalDate dateOfBirth, String url) {
		this.code = code;
		this.driverId = driverId;
		this.permanentNumber = permanentNumber;
		this.nationality = nationality;
		this.givenName = givenName;
		this.familyName = familyName;
		this.dateOfBirth = dateOfBirth;
		this.url = url;
	}

	//toString que utilizamos para exportar el fichero txt
	@Override
	public String toString() {
		return givenName + " " + familyName;
	}
}