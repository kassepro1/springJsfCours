package com.codenotfound.primefaces.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Vehicule {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	private String matricule ;
	private String marque;
	private String modele;
	private String couleur ;
	private int prixJour ;
	 @OneToMany(mappedBy="vehicule")
	 private List<Location> locations;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getPrixJour() {
		return prixJour;
	}
	public void setPrixJour(int prixJour) {
		this.prixJour = prixJour;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public Vehicule(int id, String matricule, String marque, String modele, String couleur, int prixJour,
			List<Location> locations) {
		super();
		this.id = id;
		this.matricule = matricule;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.prixJour = prixJour;
		this.locations = locations;
	}
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
