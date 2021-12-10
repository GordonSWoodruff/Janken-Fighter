package com.jankenfighteralpha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="torso")
public class Torso {
	// Class Variables
	@Id
	@Column(name="torso_id")
	private String torsoId;
	@Column(name="torso_name")
	private String torsoName;
	@Column(name="torso_desc")
	private String torsoDesc;
	// Basic Constructor
	public Torso() {
		
	}
	// Getters and Setters
	public String getTorsoId() {
		return torsoId;
	}
	public void setTorsoId(String torsoId) {
		this.torsoId = torsoId;
	}
	public String getTorsoName() {
		return torsoName;
	}
	public void setTorsoName(String torsoName) {
		this.torsoName = torsoName;
	}
	public String getTorsoDesc() {
		return torsoDesc;
	}
	public void setTorsoDesc(String torsoDesc) {
		this.torsoDesc = torsoDesc;
	}
	@Override
	public String toString() {
		return "Torso " + torsoId + ": " + torsoName + ", " + torsoDesc;
	}
}
