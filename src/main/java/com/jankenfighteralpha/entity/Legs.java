package com.jankenfighteralpha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="legs")
public class Legs {
	// Class Variables
	@Id
	@Column(name="legs_id")
	private String legsId;
	@Column(name="legs_name")
	private String legsName;
	@Column(name="legs_desc")
	private String legsDesc;
	// Basic Constructor
	public Legs() {
		
	}
	// Getters and Setters
	public String getLegsId() {
		return legsId;
	}
	public void setLegsId(String legsId) {
		this.legsId = legsId;
	}
	public String getLegsName() {
		return legsName;
	}
	public void setLegsName(String legsName) {
		this.legsName = legsName;
	}
	public String getLegsDesc() {
		return legsDesc;
	}
	public void setLegsDesc(String legsDesc) {
		this.legsDesc = legsDesc;
	}
	@Override
	public String toString() {
		return "Legs " + legsId + ": " + legsName + ", " + legsDesc;
	}
}
