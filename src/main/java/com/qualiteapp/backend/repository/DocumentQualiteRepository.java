package com.qualiteapp.backend.repository;

import com.qualiteapp.backend.model.DocumentQualite;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface qui gère l’accès à la base de données pour les documents qualité
public interface DocumentQualiteRepository extends JpaRepository<DocumentQualite, Long> {
}
