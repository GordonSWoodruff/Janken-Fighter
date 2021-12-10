package com.jankenfighteralpha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sei_move")
public class SeiMove {
	// Class Variables
	@Id
	@Column(name="s_move_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String sMoveId;
	@Column(name="s_move_key")
	private String sMoveKey;
	@Column(name="move_name")
	private String moveName;
	@Column(name="move_desc")
	private String moveDesc;
	@Column(name="move_stat")
	private int moveStat;
	@Column(name="move_buff")
	private float moveBuff;
	// Basic Constructor
	public SeiMove() {
		
	}
	// Getters and Setters
	public String getMoveId() {
		return sMoveId;
	}
	public void setMoveId(String sMoveId) {
		this.sMoveId = sMoveId;
	}
	public String getMoveKey() {
		return sMoveKey;
	}
	public void setMoveKey(String sMoveKey) {
		this.sMoveKey = sMoveKey;
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
