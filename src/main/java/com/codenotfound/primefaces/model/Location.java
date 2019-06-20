package com.codenotfound.primefaces.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Location {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) 
	 private int id ;
	 @Temporal(TemporalType.DATE)
	 private Date date;
	 private int montant ;
	 private int nbJour ;
	 private String commentaire ;
	 @ManyToOne
	 @JoinColumn(name="vehicule_id")
	 private Vehicule vehicule;
	 @ManyToOne
	 @JoinColumn(name="client_id")
	 private Client client;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public int getNbJour() {
		return nbJour;
	}
	public void setNbJour(int nbJour) {
		this.nbJour = nbJour;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
