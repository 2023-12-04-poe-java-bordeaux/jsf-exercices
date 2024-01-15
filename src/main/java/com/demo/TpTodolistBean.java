package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;

@Named("todolistBean")
@SessionScoped
public class TpTodolistBean implements Serializable {

    private ArrayList<String> taches = new ArrayList<>();

    // methode exécutée lorsque le remplissage du formulaire est correct
    public String formSubmit(String nouvelleTache){

        taches.add(nouvelleTache);

        return "tpTodolist";
    }

    public ArrayList<String> getTaches() {
        return taches;
    }

    public void setTaches(ArrayList<String> taches) {
        this.taches = taches;
    }
}
