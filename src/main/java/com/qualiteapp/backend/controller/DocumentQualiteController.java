package com.qualiteapp.backend.controller;

import com.qualiteapp.backend.model.DocumentQualite;
import com.qualiteapp.backend.repository.DocumentQualiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentQualiteController {

    @Autowired
    private DocumentQualiteRepository repository;

    // GET : Affiche tous les documents
    @GetMapping
    public List<DocumentQualite> getAll() {
        return repository.findAll();
    }

    // POST : Ajoute un nouveau document
    @PostMapping
    public DocumentQualite create(@RequestBody DocumentQualite doc) {
        return repository.save(doc);
    }
}