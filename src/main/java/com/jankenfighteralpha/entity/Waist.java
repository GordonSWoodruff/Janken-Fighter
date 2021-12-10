package com.jankenfighteralpha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="waist")
public class Waist {
	// Class Variables
	@Id
	@Column(name="waist_id")
	private String waistId;
	@Column(name="waist_name")
	private String waistName;
	@Column(name="waist_desc")
	private String waistDesc;
	// Basic Constructor
	public Waist() {
		
	}
	// Getters and Setters
	public String getWaistId() {
		return waistId;
	}
	public void setWaistId(String waistId) {
		this.waistId = waistId;
	}
	public String getWaistName() {
		return waistName;
	}
	public void setWaistName(String waistName) {
		this.waistName = waistName;
	}
	public String getWaistDesc() {
		return waistDesc;
	}
	public void setWaistDesc(String waistDesc) {
		this.waistDesc = waistDesc;
	}
	public String toString() {
		return "Waist " + waistId + ": " + waistName + ", " + waistDesc;
	}
}
