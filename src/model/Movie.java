package model;

import enums.MovieTypeEnum;

public class Movie {
	private String id;
	private String name;
	private int yearPublished;
	private MovieTypeEnum type;
	
	public Movie(String id, String name, int yearPublished, MovieTypeEnum type) {
		this.id = id;
		this.name = name;
		this.yearPublished = yearPublished;
		this.type = type;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public MovieTypeEnum getType() {
		return type;
	}

	public void setType(MovieTypeEnum type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", datePublished=" + yearPublished + ", type=" + type + "]";
	}
	

}
