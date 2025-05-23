package com.qualiteapp.backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity // Cette annotation rend la classe persistante (entité JPA)
public class ControleConformite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation
    private Long id;

    @Column(nullable = false) // Champ obligatoire
    private String libelle;

    private String responsable;

    private LocalDate dateControle;

    private String observations;

    // Constructeur vide (obligatoire pour JPA)
    public ControleConformite() {}

    // Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public LocalDate getDateControle() {
        return dateControle;
    }

    public void setDateControle(LocalDate dateControle) {
        this.dateControle = dateControle;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}