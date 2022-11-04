package com.example.proyectoud2gaelismaelmain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("MRData")
	private MRData mRData;

	public MRData getMRData(){
		return mRData;
	}
}