package com.frioui.shop.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "produit")
public class Produit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id_produit;
    private String reference;
    private String nom_produit;
    private double prix;
    private double prix_promo;
    private String image;
    private String couleur;
    private String  description;
    private Boolean  etat_produit; //disponible ou non par defaut disponible
    private Date date_ajout; //date NOW


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_marque", referencedColumnName = "id_marque")
    private Marque marque;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_scategorie", referencedColumnName = "id_scategorie")
    private Sous_categorie sous_categorie;


    public Produit() {
    }

    public void setId_produit(Long id_produit) {
        this.id_produit = id_produit;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setPrix_promo(double prix_promo) {
        this.prix_promo = prix_promo;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEtat_produit(Boolean etat_produit) {
        this.etat_produit = etat_produit;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public void setSous_categorie(Sous_categorie sous_categorie) {
        this.sous_categorie = sous_categorie;
    }

    public Long getId_produit() {
        return id_produit;
    }

    public String getReference() {
        return reference;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public double getPrix() {
        return prix;
    }

    public double getPrix_promo() {
        return prix_promo;
    }

    public String getImage() {
        return image;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getEtat_produit() {
        return etat_produit;
    }

    public Date getDate_ajout() {
        return date_ajout;
    }

    public Marque getMarque() {
        return marque;
    }

    public Sous_categorie getSous_categorie() {
        return sous_categorie;
    }

    @OneToMany(mappedBy = "produit", fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
    //fetch=FetchType.LAZY  optimiser la chargement des données  de table clients au meme temps alors il charge seulement en cas de besoin
    //CascadeType.REMOVE  lorsque un client est supprimé la liste des rdv seront supprimés
    private List<Contient> lcontient;

    public void setLcontient(List<Contient> lcontient) {
        this.lcontient = lcontient;
    }

    public List<Contient> getLcontient() {
        return lcontient;
    }
}
