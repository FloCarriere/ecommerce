package com.flo.ecommerce.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Panier {

    @Id
    @GeneratedValue
    private Long id;

    private Integer nbArticle;

    private Double prixTotal;
    @OneToOne
    private Client client;
}
