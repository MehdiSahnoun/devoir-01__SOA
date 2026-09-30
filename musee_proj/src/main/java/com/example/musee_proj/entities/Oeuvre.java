package com.example.musee_proj.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Oeuvre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOeuvre;

    private String titreOeuvre;
    private String auteurOeuvre;
    private Date dateCreationOeuvre;

    @ManyToOne
    @JoinColumn(name = "musee_id")
    private Musee musee;

    public Oeuvre() {}

    public Oeuvre(String titreOeuvre, String auteurOeuvre, Date dateCreationOeuvre) {
        this.titreOeuvre = titreOeuvre;
        this.auteurOeuvre = auteurOeuvre;
        this.dateCreationOeuvre = dateCreationOeuvre;
    }

    // Getters and setters
    public Long getIdOeuvre() { return idOeuvre; }
    public void setIdOeuvre(Long idOeuvre) { this.idOeuvre = idOeuvre; }

    public String getTitreOeuvre() { return titreOeuvre; }
    public void setTitreOeuvre(String titreOeuvre) { this.titreOeuvre = titreOeuvre; }

    public String getAuteurOeuvre() { return auteurOeuvre; }
    public void setAuteurOeuvre(String auteurOeuvre) { this.auteurOeuvre = auteurOeuvre; }

    public Date getDateCreationOeuvre() { return dateCreationOeuvre; }
    public void setDateCreationOeuvre(Date dateCreationOeuvre) { this.dateCreationOeuvre = dateCreationOeuvre; }

    public Musee getMusee() { return musee; }
    public void setMusee(Musee musee) { this.musee = musee; }
}