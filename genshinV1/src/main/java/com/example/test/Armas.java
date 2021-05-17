package com.example.test;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Armas implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String rareza;
	private String nombre;
	private String tipoDeArma;
	private String estadistica2;
	private int ATKB;
	private int secNumStat;
	private int condicion;
	@Column(length = 2048)
	private String descripcion;

	protected Armas() {
	}

	public Armas(String Rareza, String Nombre, String TipoDeArma,int ATKB, int secNumStat, int condicion, String estadistica2,
			String Descripcion) {
		this.ATKB = ATKB;
		this.condicion = condicion; 
		this.secNumStat = secNumStat;
		
		this.rareza = Rareza;
		this.nombre = Nombre;
		this.tipoDeArma = TipoDeArma;
		this.estadistica2 = estadistica2;
		this.descripcion = Descripcion;
	}

	public String toString() {
		return nombre + " es un " + tipoDeArma + " de rareza: " + rareza + "con STATS: " + "y "
				+ estadistica2 + "\n Descripción: " + descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRareza() {
		return rareza;
	}

	public void setRareza(String rareza) {
		this.rareza = rareza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoDeArma() {
		return tipoDeArma;
	}

	public void setTipoDeArma(String tipoDeArma) {
		this.tipoDeArma = tipoDeArma;
	}



	public String getEstadistica2() {
		return estadistica2;
	}

	public void setEstadistica2(String estadistica2) {
		this.estadistica2 = estadistica2;
	}

	public int getATKB() {
		return ATKB;
	}

	public void setATKB(int aTKB) {
		ATKB = aTKB;
	}

	public int getSecNumStat() {
		return secNumStat;
	}

	public void setSecNumStat(int secNumStat) {
		this.secNumStat = secNumStat;
	}

	public int getCondicion() {
		return condicion;
	}

	public void setCondicion(int condicion) {
		this.condicion = condicion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	



}
	



