package com.example.musee_proj.entities;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Musee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMusee;

    private String nomMusee;
    private String villeMusee;
    private Date dateFondationMusee;

    @OneToMany(mappedBy = "musee", cascade = CascadeType.ALL)
    private List<Oeuvre> oeuvres;

    public Musee() {}

    public Musee(String nomMusee, String villeMusee, Date dateFondationMusee) {
        this.nomMusee = nomMusee;
        this.villeMusee = villeMusee;
        this.dateFondationMusee = dateFondationMusee;
    }

    // Getters and setters
    public Long getIdMusee() { return idMusee; }
    public void setIdMusee(Long idMusee) { this.idMusee = idMusee; }

    public String getNomMusee() { return nomMusee; }
    public void setNomMusee(String nomMusee) { this.nomMusee = nomMusee; }

    public String getVilleMusee() { return villeMusee; }
    public void setVilleMusee(String villeMusee) { this.villeMusee = villeMusee; }

    public Date getDateFondationMusee() { return dateFondationMusee; }
    public void setDateFondationMusee(Date dateFondationMusee) { this.dateFondationMusee = dateFondationMusee; }

    public List<Oeuvre> getOeuvres() { return oeuvres; }
    public void setOeuvres(List<Oeuvre> oeuvres) { this.oeuvres = oeuvres; }
}