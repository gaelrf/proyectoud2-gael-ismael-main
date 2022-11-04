package com.example.proyectoud2gaelismaelmain.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class StandingsListsItem{

	@JsonProperty("round")
	private String round;

	@JsonProperty("DriverStandings")
	private List<DriverStandingsItem> driverStandings;

	@JsonProperty("season")
	private String season;

	public String getRound(){
		return round;
	}

	public List<DriverStandingsItem> getDriverStandings(){
		return driverStandings;
	}

	public String getSeason(){
		return season;
	}
}