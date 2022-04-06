package model;

import java.util.List;

import enums.SexTypeEnum;

public class Actor extends Person {
	private String id;
	List<Movie> movie;
	
	public Actor(String name, int age, String nationality, SexTypeEnum sex, String id, List<Movie> movie) {
		super(name, age, nationality, sex);
		this.id = id;
		this.movie = movie;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Actor [id=" + id + ", movie=" + movie + "]";
	}
	
	
}

