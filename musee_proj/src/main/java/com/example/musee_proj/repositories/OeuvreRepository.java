package com.example.musee_proj.repositories;

import com.example.musee_proj.entities.Oeuvre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OeuvreRepository extends JpaRepository<Oeuvre, Long> {
}