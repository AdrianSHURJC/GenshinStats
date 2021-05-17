package com.example.test;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Personaje implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(unique = true)
	private String name;
	private String atribute;
	private int level;
	private int MaxHP;
	private int ATK;
	private int PATK;
	private int DEF;
	private int mastery;
	private int ProbCrit;
	private int DanyoCrit;
	private int ElementalBonus;
	private int EnergyRecharge;
	private String img;

	protected Personaje() {}
	public Personaje(String name, String atribute, int level, int MaxHP, int ATK, int PATK, int DEF, int mastery, int ProbCrit, int DanyoCrit, int ElementalBonus, int EnergyRecharge, String img) {
		this.name=name;
		this.atribute=atribute;
		this.level=level;
		this.MaxHP=MaxHP;
		this.ATK=ATK;
		this.PATK=PATK;
		this.DEF=DEF;
		this.mastery=mastery;
		this.ProbCrit=ProbCrit;
		this.DanyoCrit=DanyoCrit;
		this.ElementalBonus=ElementalBonus;
		this.EnergyRecharge=EnergyRecharge;	
		this.img = img;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String toString() {
		return name + " atribute: "+atribute+ " lv: " + level + "\n" + " ATK: "+ ATK + " DEF: "+DEF+ "mastery: " + mastery + " Prob Crit: "+ ProbCrit
				+ " Crit Dmg: "+ DanyoCrit+ " ElementalBonus: "+ ElementalBonus + " EnergyRecharge: "+ EnergyRecharge;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAtribute() {
		return atribute;
	}
	public void setAtribute(String atribute) {
		this.atribute = atribute;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxHP() {
		return MaxHP;
	}
	public void setMaxHP(int maxHP) {
		MaxHP = maxHP;
	}
	public int getATK() {
		return ATK;
	}
	public void setATK(int aTK) {
		ATK = aTK;
	}
	public int getPATK() {
		return PATK;
	}
	public void setPATK(int pATK) {
		PATK = pATK;
	}
	public int getDEF() {
		return DEF;
	}
	public void setDEF(int dEF) {
		DEF = dEF;
	}
	public int getMastery() {
		return mastery;
	}
	public void setMastery(int mastery) {
		this.mastery = mastery;
	}
	public int getProbCrit() {
		return ProbCrit;
	}
	public void setProbCrit(int probCrit) {
		ProbCrit = probCrit;
	}
	public int getDanyoCrit() {
		return DanyoCrit;
	}
	public void setDanyoCrit(int danyoCrit) {
		DanyoCrit = danyoCrit;
	}
	public int getElementalBonus() {
		return ElementalBonus;
	}
	public void setElementalBonus(int elementalBonus) {
		ElementalBonus = elementalBonus;
	}
	public int getEnergyRecharge() {
		return EnergyRecharge;
	}
	public void setEnergyRecharge(int energyRecharge) {
		EnergyRecharge = energyRecharge;
	}
	
}
