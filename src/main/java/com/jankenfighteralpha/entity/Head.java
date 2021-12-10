package com.jankenfighteralpha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="head")
public class Head {
	// Class Variables
	@Id
	@Column(name="head_id")
	public String headId;
	@Column(name="head_name")
	public String headName;
	@Column(name="head_desc")
	public String headDesc;
	// Basic Constructor
	public Head() {
		
	}
	// Getters and Setters
	public String getHeadId() {
		return headId;
	}
	public void setHeadId(String headId) {
		this.headId = headId;
	}
	public String getHeadName() {
		return headName;
	}
	public void setHeadName(String headName) {
		this.headName = headName;
	}
	public String getHeadDesc() {
		return headDesc;
	}
	public void setHeadDesc(String headDesc) {
		this.headDesc = headDesc;
	}
	@Override
	public String toString() {
		return "Head " + headId + ": " + headName + ", " + headDesc;
	}
}
