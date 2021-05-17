package com.example.test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.io.Serializable;

import javax.persistence.CascadeType;
@Entity
public class Equipo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Personaje pj;
	@ManyToOne(cascade=CascadeType.ALL)
	private Armas arm;
	@ManyToOne(cascade=CascadeType.ALL)
	private Artefactos artefact1;

	
	public Equipo() {}
	public Equipo(Personaje pj, Armas arm, Artefactos artefact1) {
		this.pj=pj;
		this.arm=arm;
		this.artefact1= artefact1;


	}



	public void calculadora() {
		pj.setATK(pj.getATK()+arm.getATKB());
		if (arm.getEstadistica2()=="PATK") {
			pj.setPATK(pj.getPATK()+arm.getSecNumStat());
		}
		if (arm.getEstadistica2()=="PER") {
			pj.setEnergyRecharge(pj.getEnergyRecharge()+arm.getSecNumStat());
		}
		if (arm.getEstadistica2()=="PDEF") {
			pj.setDEF(pj.getDEF()+arm.getSecNumStat());
		}
		if (arm.getEstadistica2()=="EM") {
			pj.setMastery(pj.getMastery()+arm.getSecNumStat());
		}
		if (arm.getEstadistica2()=="PHP") {
			pj.setMaxHP(pj.getMaxHP()+arm.getSecNumStat());
		}
		if (arm.getEstadistica2()=="PEB") {
			pj.setElementalBonus(pj.getElementalBonus()+arm.getSecNumStat());
		}
		if (arm.getEstadistica2()=="PCR") {
			pj.setProbCrit(pj.getProbCrit()+arm.getSecNumStat());
		}
		if (arm.getEstadistica2()=="PCRD") {
			pj.setDanyoCrit(pj.getDanyoCrit()+arm.getSecNumStat());
		}
		if (artefact1.getNombre()== "Noblesse Oblige") {
			pj.setElementalBonus(pj.getElementalBonus()+artefact1.getBufo1());
		}
		if (artefact1.getNombre()== "Gladiator's Finale") {
			pj.setPATK(pj.getPATK()+artefact1.getBufo1());
		}
		if (artefact1.getNombre()== "Maiden Beloved") {
			pj.setElementalBonus(pj.getElementalBonus()+artefact1.getBufo1());
		}
		if (artefact1.getNombre()== "Instructor") {
			pj.setMastery(pj.getMastery()+artefact1.getBufo1());
		}
		if (artefact1.getNombre()== "Berserker") {
			pj.setProbCrit(pj.getProbCrit()+artefact1.getBufo1());
		}
		if (artefact1.getNombre()== "Prayers for Wisdom") {
			pj.setElementalBonus(pj.getElementalBonus()+artefact1.getBufo2());
		}
		if (artefact1.getNombre()== "Adventurer") {
			pj.setMaxHP(pj.getMaxHP()+artefact1.getBufo1());
		}
		if (artefact1.getNombre()== "Traveling Doctor") {
			pj.setElementalBonus(pj.getElementalBonus()+artefact1.getBufo1());
		}
		if (artefact1.getNombre()== "Lucky Dog") {
			pj.setDEF(pj.getDEF()+artefact1.getBufo1());
		}
	}
	
	public void setId(long id) {
		this.id=id;
	}
	public long getId() {
		return this.id;
	}
	public Personaje getPj() {
		return pj;
	}
	public void setPj(Personaje pj) {
		this.pj = pj;
	}
	public Armas getArm() {
		return arm;
	}
	public void setArm(Armas arm) {
		this.arm = arm;
	}
	public Artefactos getArtefact1() {
		return artefact1;
	}
	public void setArtefact1(Artefactos artefact1) {
		this.artefact1 = artefact1;
	}

	@Override
	public String toString() {
		return "Equipo [pj=" + pj + ", arm=" + arm + ", artefact1=" + artefact1 + "]";
	}
	
	
}