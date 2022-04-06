package model;

import enums.SkillTypeEnum;

public class Skill {
	private String id;
	private SkillTypeEnum name;
	private String description;
	
	public Skill(String id, SkillTypeEnum name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public SkillTypeEnum getName() {
		return name;
	}
	
	public void setName(SkillTypeEnum name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}
