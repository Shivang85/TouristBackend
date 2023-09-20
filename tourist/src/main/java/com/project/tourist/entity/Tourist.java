package com.project.tourist.entity;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tourist {
	@Id
	private int id;
	private String fname;
	private String lname;
	private String gender;
	private int age;
	private String fPlace;
	private int visits;
	public Tourist() {
		super();
		
	}
	public Tourist(int id, String fname, String lname, String gender, int age, String fPlace, int visits) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.fPlace = fPlace;
		this.visits = visits;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getfPlace() {
		return fPlace;
	}
	public void setfPlace(String fPlace) {
		this.fPlace = fPlace;
	}
	public int getVisits() {
		return visits;
	}
	public void setVisits(int visits) {
		this.visits = visits;
	}
	
}