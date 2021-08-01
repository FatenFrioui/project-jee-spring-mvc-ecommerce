package com.frioui.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "sous_categorie")
public class Sous_categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_scategorie;
    private String libelle_scategorie;



    public Sous_categorie() {
    }



    public void setLibelle_scategorie(String libelle_scategorie) {
        this.libelle_scategorie = libelle_scategorie;
    }

    public void setId_scategorie(Long id_scategorie) {
        this.id_scategorie = id_scategorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Long getId_scategorie() {
        return id_scategorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public String getLibelle_scategorie() {
        return libelle_scategorie;
    }

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_categorie")
    private Categorie categorie;


}
