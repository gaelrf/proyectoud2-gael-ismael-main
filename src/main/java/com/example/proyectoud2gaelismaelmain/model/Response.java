package com.example.proyectoud2gaelismaelmain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("MRData")
	private MRData mRData;

	//Creamos un get para cojer los datos de la tabla
	public MRData getMRData(){
		return mRData;
	}
}