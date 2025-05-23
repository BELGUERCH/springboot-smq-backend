package com.qualiteapp.backend.repository;

import com.qualiteapp.backend.model.ControleConformite;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface qui permet d’effectuer automatiquement les opérations CRUD
public interface ControleConformiteRepository extends JpaRepository<ControleConformite, Long> {
}