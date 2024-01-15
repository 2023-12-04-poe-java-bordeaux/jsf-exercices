package com.demo.tpBlog;

import java.time.LocalDate;

public class Billet {

    private int id;
    private String titre;
    private String contenu;
    private LocalDate date;

    public Billet(String titre, String contenu) {
        this.titre = titre;
        this.contenu = contenu;
        date = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
