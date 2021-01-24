package com.candidjava.spring.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(
        name = "UserInfo",
        uniqueConstraints = {@UniqueConstraint(columnNames = "number"),
                             @UniqueConstraint(columnNames = "userName")
        })
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	@Column(name="company")
	private String company;
	@Column(name="name")
	private String first_name;
	@Column(name="lastname")
	private String last_name;
	private String number;
	private String userName;
	private String subject;
	private String area_code;
	
	 //@Temporal(TemporalType.TIMESTAMP)
	  @Column(name = "created_at", nullable = false, updatable = false)
	//  @CreatedDate
	//  private Date createdAt;
	   private Date dateOfBirth;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
