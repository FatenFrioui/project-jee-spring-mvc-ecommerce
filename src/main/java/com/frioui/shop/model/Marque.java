package com.frioui.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "marque")
public class Marque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_marque;
    private String libelle_marque;


    public Marque() {
    }

    public void setId_marque(Long id_marque) {
        this.id_marque = id_marque;
    }

    public void setLibelle_marque(String libelle_marque) {
        this.libelle_marque = libelle_marque;
    }

    public Long getId_marque() {
        return id_marque;
    }

    public String getLibelle_marque() {
        return libelle_marque;
    }
}
