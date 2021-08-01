package com.frioui.shop.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_client;
    private Long cin;
    private String nom_client;
    private String prenom_client;
    private Long tel;
    private String adresse;
    private String email;
    private String password;
    private Boolean etat;

    public Client() {
    }

    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }

    public void setCin(Long cin) {
        this.cin = cin;
    }

    public void setNom_client(String nom_client) {
        this.nom_client = nom_client;
    }

    public void setPrenom_client(String prenom_client) {
        this.prenom_client = prenom_client;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    public Long getId_client() {
        return id_client;
    }

    public Long getCin() {
        return cin;
    }

    public String getNom_client() {
        return nom_client;
    }

    public String getPrenom_client() {
        return prenom_client;
    }

    public Long getTel() {
        return tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getEtat() {
        return etat;
    }

    @OneToMany(mappedBy = "client", fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List <Message_contact> lmsg;

    public void setLmsg(List<Message_contact> lmsg) {
        this.lmsg = lmsg;
    }

    public List<Message_contact> getLmsg() {
        return lmsg;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id_client=" + id_client +
                ", cin=" + cin +
                ", nom_client='" + nom_client + '\'' +
                ", prenom_client='" + prenom_client + '\'' +
                ", tel=" + tel +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", etat=" + etat +
                ", lmsg=" + lmsg +
                '}';
    }
}
