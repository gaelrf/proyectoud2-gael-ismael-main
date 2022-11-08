package com.example.proyectoud2gaelismaelmain.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StandingsTable{

	@JsonProperty("StandingsLists")
	private List<StandingsListsItem> standingsLists;

	@JsonProperty("season")
	private String season;

	//Creamos un get para cojer los datos de la tabla
	public List<StandingsListsItem> getStandingsLists(){
		return standingsLists;
	}

	public String getSeason(){
		return season;
	}
}