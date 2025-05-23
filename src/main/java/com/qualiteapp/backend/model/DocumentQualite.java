package com.qualiteapp.backend.model;

// Import des annotations JPA
import jakarta.persistence.*;
import java.time.LocalDate;

// Cette annotation indique que cette classe représente une entité (table) dans la base de données
@Entity
public class DocumentQualite {

    // Indique que ce champ est la clé primaire
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incrémentation de l'ID (géré par PostgreSQL)
    private Long id;

    @Column(nullable = false) // Champ obligatoire pour le titre
    private String titre;

    private String type; // Type du document : procédure, enregistrement, etc.

    private String cheminFichier; // Chemin où est stocké le fichier dans le système ou le serveur

    private LocalDate dateAjout; // Date d’ajout du document qualité

    // Constructeur vide requis par JPA
    public DocumentQualite() {}

    // ======= Getters et Setters =======

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCheminFichier() {
        return cheminFichier;
    }

    public void setCheminFichier(String cheminFichier) {
        this.cheminFichier = cheminFichier;
    }

    public LocalDate getDateAjout() {
        return dateAjout;
    }

    public void setDateAjout(LocalDate dateAjout) {
        this.dateAjout = dateAjout;
    }
}