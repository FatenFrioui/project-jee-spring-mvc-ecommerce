package com.frioui.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "ligne_commande")
public class Contient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long quantite;

    @JoinColumn(name="id_produit", referencedColumnName ="id_produit")
    @ManyToOne(optional=false)
    private Produit produit;

    @JoinColumn(name="id_panier", referencedColumnName ="id_panier")
    @ManyToOne(optional=false)
    private Ligne_panier ligne_panier;


    public Contient() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public void setLigne_panier(Ligne_panier ligne_panier) {
        this.ligne_panier = ligne_panier;
    }

    public Long getId() {
        return id;
    }

    public Long getQuantite() {
        return quantite;
    }

    public Produit getProduit() {
        return produit;
    }

    public Ligne_panier getLigne_panier() {
        return ligne_panier;
    }
}
