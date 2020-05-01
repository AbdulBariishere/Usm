package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "userdata")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "designation")
	private String  designation;

	public Tutorial() {

	}

	public Tutorial(String name, String description, String  designation) {
		this.name = name;
		this.description = description;
		this.designation = designation;
	}

	public long getId() {
		return id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDesignation() {
		return designation;
	}

	public void setdesignation(String isdesignation) {
		this.designation = isdesignation;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", name=" + name + ", desc=" + description + ", designation=" + designation + "]";
	}

}
