package com.frioui.shop.model;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_commande;
    private LocalDateTime date_commande;
    private Boolean etat_commande;
    private double montant_total;
    private double frais_livraison;

    public Commande() {
    }

    public void setId_commande(Long id_commande) {
        this.id_commande = id_commande;
    }

    public void setDate_commade(LocalDateTime date_commade) {
        this.date_commande = date_commade;
    }

    public void setEtat_commande(Boolean etat_commande) {
        this.etat_commande = etat_commande;
    }

    public void setMontant_total(double montant_total) {
        this.montant_total = montant_total;
    }

    public void setFrais_livraison(double frais_livraison) {
        this.frais_livraison = frais_livraison;
    }

    public Long getId_commande() {
        return id_commande;
    }

    public LocalDateTime getDate_commade() {
        return date_commande;
    }

    public Boolean getEtat_commande() {
        return etat_commande;
    }

    public double getMontant_total() {
        return montant_total;
    }

    public double getFrais_livraison() {
        return frais_livraison;
    }
}
