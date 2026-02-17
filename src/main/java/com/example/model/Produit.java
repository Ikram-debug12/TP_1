package com.example.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private BigDecimal prix;
    private int quantite;  // ✅ 1 seul champ ajouté

    // Constructeurs
    public Produit() {}

    public Produit(String nom, BigDecimal prix, int quantite) {  // ✅ modifié
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    // Getters et Setters (existants + nouveau)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public BigDecimal getPrix() { return prix; }
    public void setPrix(BigDecimal prix) { this.prix = prix; }

    public int getQuantite() { return quantite; }  // ✅ nouveau getter
    public void setQuantite(int quantite) { this.quantite = quantite; }  // ✅ nouveau setter

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", quantite=" + quantite +  // ✅ ajouté
                '}';
    }
}