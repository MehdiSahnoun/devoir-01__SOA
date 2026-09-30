package com.example.musee_proj.controllers;

import com.example.musee_proj.entities.Oeuvre;
import com.example.musee_proj.repositories.OeuvreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/oeuvres")
@CrossOrigin("*")
public class OeuvreController {

    @Autowired
    private OeuvreRepository oeuvreRepository;

    @GetMapping
    public List<Oeuvre> getAllOeuvres() {
        return oeuvreRepository.findAll();
    }

    @GetMapping("/{id}")
    public Oeuvre getOeuvreById(@PathVariable Long id) {
        return oeuvreRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Oeuvre createOeuvre(@RequestBody Oeuvre oeuvre) {
        return oeuvreRepository.save(oeuvre);
    }

    @PutMapping("/{id}")
    public Oeuvre updateOeuvre(@PathVariable Long id, @RequestBody Oeuvre oeuvre) {
        oeuvre.setIdOeuvre(id);
        return oeuvreRepository.save(oeuvre);
    }

    @DeleteMapping("/{id}")
    public void deleteOeuvre(@PathVariable Long id) {
        oeuvreRepository.deleteById(id);
    }
}