package com.flo.ecommerce.model;



import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Vendeur extends User {
    @Id
    @GeneratedValue
    private Long id;
    private String profession;
    @OneToMany(mappedBy="vendeur", cascade={CascadeType.PERSIST, CascadeType.REMOVE}, fetch = FetchType.EAGER)
    private List<Article> articlesListe;

    public Vendeur(String nom, String prenom, Date dateNaissance, String username, String email, String password, Long id, String profession, List<Article> articlesListe) {
        super(nom, prenom, dateNaissance, username, email, password);
        this.id = id;
        this.profession = profession;
        this.articlesListe = articlesListe;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Article> getArticleListe() {
        return articlesListe;
    }

    public void setArticleListe(List<Article> articleListe) {
        this.articlesListe = articleListe;
    }
}
