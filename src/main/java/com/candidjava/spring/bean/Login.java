package com.candidjava.spring.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
 
@Table(name="login")
/*@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})*/
public class Login {

	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	  private long id;
	  private String email;
	  private String pass;
	  
      public String getEmail() {
	  return email;
	}
	public void setEmail(String email) {
	this.email = email;
	}
	public String getPass() {
	return pass;
	}
	public void setPass(String pass) {
	this.pass = pass;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	  
   
}
 