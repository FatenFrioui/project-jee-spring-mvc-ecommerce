package com.frioui.shop.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "contient")
public class Ligne_panier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_panier;
    private Date date_insert;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_commande", referencedColumnName = "id_commande")
    private Commande commande;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_client", referencedColumnName = "id_client")
    private Client client;


    public Ligne_panier() {
    }

    public void setId_panier(Long id_panier) {
        this.id_panier = id_panier;
    }

    public void setDate_insert(Date date_insert) {
        this.date_insert = date_insert;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId_panier() {
        return id_panier;
    }

    public Date getDate_insert() {
        return date_insert;
    }

    public Commande getCommande() {
        return commande;
    }

    public Client getClient() {
        return client;
    }


}
