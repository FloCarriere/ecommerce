package com.flo.ecommerce.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Catalogue {
    @Id
    @GeneratedValue
    private Long id;
    private String nomCatalogue;
    private String descriptionCatalogue;

    @OneToMany(mappedBy="catalog", cascade={CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private List<Article> articles;
}
