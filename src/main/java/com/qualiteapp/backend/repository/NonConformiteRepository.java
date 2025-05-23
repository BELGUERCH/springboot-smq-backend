package com.qualiteapp.backend.repository;

import com.qualiteapp.backend.model.NonConformite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NonConformiteRepository extends JpaRepository<NonConformite, Long> {
}
