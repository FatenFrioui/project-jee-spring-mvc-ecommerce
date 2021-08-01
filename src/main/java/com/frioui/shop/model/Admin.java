package com.frioui.shop.model;

import javax.persistence.*;

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom_admin;
    private String login;
    private String password;

    public Admin() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom_admin(String nom_admin) {
        this.nom_admin = nom_admin;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getNom_admin() {
        return nom_admin;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


}
