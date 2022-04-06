package model;
import enums.SexTypeEnum;

public class Person {
	private String name;
	private int age;
	private String nationality;
	private SexTypeEnum sex;

    public Person(){

    }
	
	public Person(String name, int age, String nationality, SexTypeEnum sex) {
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public SexTypeEnum getSex() {
        return sex;
    }

    public void setSex(SexTypeEnum sex) {
        this.sex = sex;
    }
	
	@Override
	public String toString() {
		return "Personne [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
}
