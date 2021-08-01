package com.frioui.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_categorie;
    private String libelle_categorie;

    public Categorie() {
    }

    public void setId_categ(Long id_categ) {
        this.id_categorie = id_categ;
    }

    public void setLibelle_categorie(String libelle_categorie) {
        this.libelle_categorie = libelle_categorie;
    }

    public Long getId_categ() {
        return id_categorie;
    }

    public String getLibelle_categorie() {
        return libelle_categorie;
    }


}
