package com.ayyappa.dto;

public class MovieDTO {
	private String name;
	private String director;
	private String actor;
	private Integer ratings;
	private String producer;
	
	
	public MovieDTO() {
		
	}


	public MovieDTO(String name, String director, String actor, Integer ratings, String producer) {
		super();
		this.name = name;
		this.director = director;
		this.actor = actor;
		this.ratings = ratings;
		this.producer = producer;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getActor() {
		return actor;
	}


	public void setActor(String actor) {
		this.actor = actor;
	}


	public Integer getRatings() {
		return ratings;
	}


	public void setRatings(Integer ratings) {
		this.ratings = ratings;
	}


	public String getProducer() {
		return producer;
	}


	public void setProducer(String producer) {
		this.producer = producer;
	}

}
