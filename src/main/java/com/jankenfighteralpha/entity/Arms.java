package com.jankenfighteralpha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="arms")
public class Arms {
	// Class Variables
	@Id
	@Column(name="arms_id")
	private String armsId;
	@Column(name="arms_name")
	private String armsName;
	@Column(name="arms_desc")
	private String armsDesc;
	// Basic Constructor
	public Arms() {
		
	}
	public String getArmsId() {
		return armsId;
	}
	public void setArmsId(String armsId) {
		this.armsId = armsId;
	}
	public String getArmsName() {
		return armsName;
	}
	public void setArmsName(String armsName) {
		this.armsName = armsName;
	}
	public String getArmsDesc() {
		return armsDesc;
	}
	public void setArmsDesc(String armsDesc) {
		this.armsDesc = armsDesc;
	}
	@Override
	public String toString() {
		return "Arms " + armsId + ": " + armsName + ", " + armsDesc;
	}
}
