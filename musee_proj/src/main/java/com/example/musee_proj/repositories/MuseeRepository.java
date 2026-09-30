package com.example.musee_proj.repositories;

import com.example.musee_proj.entities.Musee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MuseeRepository extends JpaRepository<Musee, Long> {
}