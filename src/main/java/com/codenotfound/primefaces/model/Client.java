package com.codenotfound.primefaces.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Columns;

@Entity(name="Client")
public class Client {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
 private int id ;
 private String numPiece;
 private String nom;
 private String prenom;
 private String tel ;
 private String adresse ;
 private String email ;
 @Temporal(TemporalType.DATE)
 private Date dateNais;
 @OneToMany(mappedBy="client",cascade=CascadeType.ALL)

 private List<Location> locations;
	public Client(int id, String numPiece, String nom, String prenom, String tel, String adresse, String email,
				  Date dateNais, List<Location> locations) {
		super();
		this.id = id;
		this.numPiece = numPiece;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.email = email;
		this.dateNais = dateNais;
		this.locations = locations;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumPiece() {
	return numPiece;
}
public void setNumPiece(String numPiece) {
	this.numPiece = numPiece;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Date getDateNais() {
	return dateNais;
}
public void setDateNais(Date dateNais) {
	this.dateNais = dateNais;
}

public List<Location> getLocations() {
	return locations;
}
public void setLocations(List<Location> locations) {
	this.locations = locations;
}
 
 
}
