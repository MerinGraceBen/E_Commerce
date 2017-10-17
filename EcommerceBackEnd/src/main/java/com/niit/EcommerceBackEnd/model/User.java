package com.niit.EcommerceBackEnd.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="USER")
public class User implements Serializable 
{

	private static final long serialVersionUID = 1L;
		

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	 @Column(name = "NAME", nullable = false)
	 private String name;
	 
	 @Column(name ="Email", nullable = false)
	 private String email;
	 
	
	@Column(name ="Password", nullable = false)
	 private String password;
	 
	 @Column(name = "MOB", nullable = false)
	    private int mob;
	 
	 @Column(name = "ADDRESS", nullable = false)
	    private String address;
	 	 
	 @Column(name="ROLE", nullable=false)
	 	private String role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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

	public int getMob() {
		return mob;
	}

	public void setMob(int mob) {
		this.mob = mob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	 
}
