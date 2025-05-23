package com.qualiteapp.backend.model;

// Importation des annotations nécessaires

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity  // Cette annotation indique que cette classe est une entité JPA (table dans la base de données)
public class NonConformite {

    @Id // Clé primaire
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentée par PostgreSQL
    private Long id;

    @NotBlank
    @Column(nullable = false) // Champ obligatoire
    private String reference;

    private String description;

    @NotNull
    private LocalDate dateDeclaration;

    @NotBlank
    private String statut;

    // Constructeur vide requis par JPA
    public NonConformite() {}

    // Getters et Setters (accès aux attributs privés)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(LocalDate dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}

