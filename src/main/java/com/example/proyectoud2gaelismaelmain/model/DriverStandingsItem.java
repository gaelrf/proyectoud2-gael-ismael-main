package com.example.proyectoud2gaelismaelmain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

//Implementamos Serializable para exportar el archivo bin
public class DriverStandingsItem implements Serializable {

	@JsonProperty("wins")
	private int wins;

	@JsonProperty("positionText")
	private String positionText;

	@JsonProperty("Driver")
	private Conductor driver;

	@JsonProperty("Constructors")
	private List<ConstructorsItem> constructors;

	@JsonProperty("position")
	private int position;

	@JsonProperty("points")
	private float points;

	public int getWins(){
		return wins;
	}

	public String getPositionText(){
		return positionText;
	}

	public Conductor getDriver(){
		return driver;
	}

	public List<ConstructorsItem> getConstructors(){
		return constructors;
	}

	public int getPosition(){
		return position;
	}

	public float getPoints(){
		return points;
	}

	public DriverStandingsItem(int wins, String positionText, Conductor driver, List<ConstructorsItem> constructors, int position, float points) {
		this.wins = wins;
		this.positionText = positionText;
		this.driver = driver;
		this.constructors = constructors;
		this.position = position;
		this.points = points;
	}

	//toString que utilizamos para exportar el fichero txt
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