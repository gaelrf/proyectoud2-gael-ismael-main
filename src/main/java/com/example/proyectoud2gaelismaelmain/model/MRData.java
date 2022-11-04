package com.example.proyectoud2gaelismaelmain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MRData{

	@JsonProperty("xmlns")
	private String xmlns;

	@JsonProperty("total")
	private String total;

	@JsonProperty("offset")
	private String offset;

	@JsonProperty("series")
	private String series;

	@JsonProperty("limit")
	private String limit;

	@JsonProperty("StandingsTable")
	private StandingsTable standingsTable;

	@JsonProperty("url")
	private String url;

	public String getXmlns(){
		return xmlns;
	}

	public String getTotal(){
		return total;
	}

	public String getOffset(){
		return offset;
	}

	public String getSeries(){
		return series;
	}

	public String getLimit(){
		return limit;
	}

	public StandingsTable getStandingsTable(){
		return standingsTable;
	}

	public String getUrl(){
		return url;
	}
}