package model;

import java.util.List;

public class Hero {
	private String id;
	private String name;
	Actor actor;
	private String town;
	Movie movie;
	Actor enemy;
	List<Skill> skill;
	
	public String getId() {
		return id;
	}
	
	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
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
	public Actor getEnemy() {
		return enemy;
	}
	public void setEnemy(Actor enemy) {
		this.enemy = enemy;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public List<Skill> getSkill() {
		return skill;
	}
	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}
	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", enemy=" + enemy + ", town=" + town + ", skill=" + skill + "]";
	}
	

}
