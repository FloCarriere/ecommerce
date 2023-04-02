package com.flo.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Admin extends User{
    @Id
    @GeneratedValue
    private Long id;

    public Admin(String nom, String prenom, Date dateNaissance, String username, String email, String password, Long id) {
        super(nom, prenom, dateNaissance, username, email, password);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
