package com.demo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class MessageBean implements Serializable {

    private int compteur = 0;

    private String message = "Mon 1er Bean CDI";

    public String getMessage() {
        compteur++;
        return message + " "+compteur;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }
}
