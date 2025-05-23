package com.qualiteapp.backend.controller;

import com.qualiteapp.backend.model.NonConformite;
import com.qualiteapp.backend.repository.NonConformiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nonconformites")
public class NonConformiteController {

    private final NonConformiteRepository repository;

    public NonConformiteController(NonConformiteRepository repository) {
        this.repository = repository;
    }

    // GET : afficher toutes les non-conformités
    @GetMapping
    public List<NonConformite> getAll() {
        return repository.findAll();
    }

    // POST : ajouter une nouvelle non-conformité
    @PostMapping
    public NonConformite create(@RequestBody NonConformite nc) {
        return repository.save(nc);
    }
}
