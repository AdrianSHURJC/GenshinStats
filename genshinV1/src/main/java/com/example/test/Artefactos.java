package com.example.test;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Artefactos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String rareza;
	private String nombre;
	private String buff1;
	private String buff2;
	private int bufo1;
	private int bufo2;
	
	public Artefactos() { }
	public Artefactos(String rareza, String nombre, String buff1) {
		this.rareza = rareza;
		this.nombre = nombre;
		this.buff1 = buff1;
	}
	public Artefactos(String rareza, String nombre, String buff1, String buff2, int bufo1, int bufo2) {
		this.rareza = rareza;
		this.nombre = nombre;
		this.buff1 = buff1;
		this.buff2 = buff2;
		this.bufo1=bufo1;
		this.bufo2=bufo2;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRareza() {
		return rareza;
	}
	
	public String getBuff1() {
		return buff1;
	}
	
	public String getBuff2() {
		return buff2;
	}
	
	public int getBufo1() {
		return bufo1;
	}
	public void setBufo1(int bufo1) {
		this.bufo1 = bufo1;
	}
	public int getBufo2() {
		return bufo2;
	}
	public void setBufo2(int bufo2) {
		this.bufo2 = bufo2;
	}
	public String SingleSet(String rareza, String nombre, String buff1) {
		System.out.println(nombre + " de rareza: " + rareza + " 1-set: " + buff1);
		return nombre + rareza + buff1;
	}
	
	public String toString() {
        return nombre + " de rareza: " + rareza + " 2-set: " + buff1 + " 4-set:" + buff2;
    }
}
