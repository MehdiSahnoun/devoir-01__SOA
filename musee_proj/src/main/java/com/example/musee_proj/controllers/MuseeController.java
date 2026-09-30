package com.example.musee_proj.controllers;

import com.example.musee_proj.entities.Musee;
import com.example.musee_proj.repositories.MuseeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/musees")
@CrossOrigin("*")
public class MuseeController {

    @Autowired
    private MuseeRepository museeRepository;

    @GetMapping
    public List<Musee> getAllMusees() {
        return museeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Musee getMuseeById(@PathVariable Long id) {
        return museeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Musee createMusee(@RequestBody Musee musee) {
        return museeRepository.save(musee);
    }

    @PutMapping("/{id}")
    public Musee updateMusee(@PathVariable Long id, @RequestBody Musee musee) {
        musee.setIdMusee(id);
        return museeRepository.save(musee);
    }

    @DeleteMapping("/{id}")
    public void deleteMusee(@PathVariable Long id) {
        museeRepository.deleteById(id);
    }
}