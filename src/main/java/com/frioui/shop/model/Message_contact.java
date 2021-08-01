package com.frioui.shop.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "message_contact")
public class Message_contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_msg;
    private String sujet;
    private String message;
    private Date date_envoi;
    private Boolean etat_msg;

    public Message_contact() {
    }

    public void setId_msg(Long id_msg) {
        this.id_msg = id_msg;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate_envoi(Date date_envoi) {
        this.date_envoi = date_envoi;
    }

    public void setEtat_msg(Boolean etat_msg) {
        this.etat_msg = etat_msg;
    }

    public Long getId_msg() {
        return id_msg;
    }

    public String getSujet() {
        return sujet;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate_envoi() {
        return date_envoi;
    }

    public Boolean getEtat_msg() {
        return etat_msg;
    }


    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "id_client")
    private Client client;

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
