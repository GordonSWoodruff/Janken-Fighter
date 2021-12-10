package com.jankenfighteralpha.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="avatar")
public class Avatar {
	// Class Variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="avatar_id")
	private int avatarId;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="head_part")
	private Head headPart;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="torso_part")
	private Torso torsoPart;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="arms_part")
	private Arms armsPart;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="waist_part")
	private Waist waistPart;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="legs_part")
	private Legs legsPart;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="accessory")
	private Accessory accessory;
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="pet")
//	private Pets pet;
	// Basic Constructor
	public Avatar() {
		
	}
	// Getters and Setters
	public int getAvatarId() {
		return avatarId;
	}
	public void setAvatarId(int avatarId) {
		this.avatarId = avatarId;
	}
	public Head getHeadPart() {
		return headPart;
	}
	public void setHeadPart(Head headPart) {
		this.headPart = headPart;
	}
	public Torso getTorsoPart() {
		return torsoPart;
	}
	public void setTorsoPart(Torso torsoPart) {
		this.torsoPart = torsoPart;
	}
	public Arms getArmsPart() {
		return armsPart;
	}
	public void setArmsPart(Arms armsPart) {
		this.armsPart = armsPart;
	}
	public Waist getWaistPart() {
		return waistPart;
	}
	public void setWaistPart(Waist waistPart) {
		this.waistPart = waistPart;
	}
	public Legs getLegsPart() {
		return legsPart;
	}
	public void setLegsPart(Legs legsPart) {
		this.legsPart = legsPart;
	}
	public Accessory getAccessory() {
		return accessory;
	}
	public void setAccesory(Accessory accessory) {
		this.accessory = accessory;
	}
//	public Pets getPet() {
//		return pet;
//	}
//	public void setPet(Pets pet) {
//		this.pet = pet;
//	}
	@Override
	public String toString() {
		return "Avatar " + avatarId + ": " + "\nHead: " + headPart.toString() + "\nTorso: " + torsoPart.toString()
			+ "\nArms: " +  armsPart.toString() + "\nWaist: " + waistPart.toString() + "\nLegs: " + legsPart.toString()
			+ "\nAccessory: " + accessory.toString();
	}
}
