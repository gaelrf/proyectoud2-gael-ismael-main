package com.example.proyectoud2gaelismaelmain.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DriverStandingsItem implements Serializable {

	@JsonProperty("wins")
	private String wins;

	@JsonProperty("positionText")
	private String positionText;

	@JsonProperty("Driver")
	private Driver driver;

	@JsonProperty("Constructors")
	private List<ConstructorsItem> constructors;

	@JsonProperty("position")
	private String position;

	@JsonProperty("points")
	private String points;

	public String getWins(){
		return wins;
	}

	public String getPositionText(){
		return positionText;
	}

	public Driver getDriver(){
		return driver;
	}

	public List<ConstructorsItem> getConstructors(){
		return constructors;
	}

	public String getPosition(){
		return position;
	}

	public String getPoints(){
		return points;
	}

	@Override
	public String toString() {
		return "DriverStandingsItem{" +
				"wins='" + wins + '\'' +
				", positionText='" + positionText + '\'' +
				", driver=" + driver +
				", constructors=" + constructors +
				", position='" + position + '\'' +
				", points='" + points + '\'' +
				'}';
	}
}