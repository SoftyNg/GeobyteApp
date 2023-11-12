/**
 * 
 */
package com.app.geobyte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * 
 */

@Entity //uses our class as database table to inside field values into database
public class UserModel {
	//require parameters/fields as below:
	
	
	@Id
	private int id;
	private int name;
	private String email;
	private String password;
	
	
	//Default constructor
	public UserModel() {
		
	}
	
	//Constructor using fields
	public UserModel(int id, int name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	/*Getters and setters for each required fields */
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getName() {
		return name;
	}
	
	public void setName(int name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	

}
