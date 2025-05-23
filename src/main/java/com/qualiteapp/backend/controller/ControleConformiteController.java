package com.qualiteapp.backend.controller;
import jakarta.validation.Valid;
import com.qualiteapp.backend.model.ControleConformite;
import com.qualiteapp.backend.repository.ControleConformiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/controle-conformites")
public class ControleConformiteController {

    @Autowired
    private ControleConformiteRepository repository;

    // GET : Récupérer tous les contrôles de conformité
    @GetMapping
    public List<ControleConformite> getAll() {
        return repository.findAll();
    }

    // POST : Créer un nouveau contrôle de conformité
    @PostMapping
    public ControleConformite create(@RequestBody @Valid ControleConformite controleConformite) {
        return repository.save(controleConformite);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ControleConformite> getById(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ControleConformite> update(@PathVariable Long id, @RequestBody @Valid ControleConformite controleConformite) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        controleConformite.setId(id);
        return ResponseEntity.ok(repository.save(controleConformite));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}