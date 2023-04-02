package com.flo.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.Date;

@Entity
public class Client extends User{
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Panier panier;

    public Client(String nom, String prenom, Date dateNaissance, String username, String email, String password, Long id, Panier panier) {
        super(nom, prenom, dateNaissance, username, email, password);
        this.id = id;
        this.panier = panier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Panier getPanier() {
        return panier;
    }

    public void setPanier(Panier panier) {
        this.panier = panier;
    }
}
