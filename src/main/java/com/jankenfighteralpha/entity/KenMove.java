package com.jankenfighteralpha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ken_move")
public class KenMove {
	// Class Variables
	@Id
	@Column(name="k_move_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String kMoveId;
	@Column(name="k_move_key")
	private String kMoveKey;
	@Column(name="move_name")
	private String moveName;
	@Column(name="move_desc")
	private String moveDesc;
	@Column(name="move_stat")
	private int moveStat;
	@Column(name="move_buff")
	private float moveBuff;
	// Basic Constructor
	public KenMove() {
		
	}
	// Getters and Setters
	public String getMoveId() {
		return kMoveId;
	}
	public void setMoveId(String kMoveId) {
		this.kMoveId = kMoveId;
	}
	public String getMoveKey() {
		return kMoveKey;
	}
	public void setMoveKey(String kMoveKey) {
		this.kMoveKey = kMoveKey;
	}
	public String getMoveName() {
		return moveName;
	}
	public void setMoveName(String moveName) {
		this.moveName = moveName;
	}
	public String getMoveDesc() {
		return moveDesc;
	}
	public void setMoveDesc(String moveDesc) {
		this.moveDesc = moveDesc;
	}
	public int getMoveStat() {
		return moveStat;
	}
	public void setMoveStat(int moveStat) {
		this.moveStat = moveStat;
	}
	public float getMoveBuff() {
		return moveBuff;
	}
	public void setMoveBuff(float moveBuff) {
		this.moveBuff = moveBuff;
	}
	public String toString() {
		return "";
	}
}
