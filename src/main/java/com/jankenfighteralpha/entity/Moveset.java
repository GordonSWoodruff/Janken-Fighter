package com.jankenfighteralpha.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="moveset")
public class Moveset {
	// Class Variables
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JoinColumn(name="moveset_id")
	private int movesetId;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="c_move_id")
	private ChiMove chiMove;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="k_move_id")
	private KenMove kenMove;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="s_move_id")
	private SeiMove seiMove;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="p_move_id")
	private SurpriseMove surpriseMove;
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="super_move")
//	private SuperMove superMove;
	// Basic Constructor
	public Moveset() {
		
	}
	// Getters and Setters
	public int getMovesetId() {
		return movesetId;
	}
	public void setMovesetId(int movesetId) {
		this.movesetId = movesetId;
	}
	public ChiMove getChiMove() {
		return chiMove;
	}
	public void setChiMove(ChiMove chiMove) {
		this.chiMove = chiMove;
	}
	public KenMove getKenMove() {
		return kenMove;
	}
	public void setKenMove(KenMove kenMove) {
		this.kenMove = kenMove;
	}
	public SeiMove getSeiMove() {
		return seiMove;
	}
	public void setSeiMove(SeiMove seiMove) {
		this.seiMove = seiMove;
	}
	public SurpriseMove getSurpriseMove() {
		return surpriseMove;
	}
	public void setSurpriseMove(SurpriseMove surpriseMove) {
		this.surpriseMove = surpriseMove;
	}
//	public SuperMove getSuperMove() {
//		return superMove;
//	}
//	public void setSuperMove(SuperMove superMove) {
//		this.superMove = superMove;
//	}
	@Override
	public String toString() {
		return "";
	}
}
