package com.demo;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;

@Named("todolistBean")
@SessionScoped
public class TpTodolistBean implements Serializable {

    private ArrayList<String> taches = new ArrayList<>();

    @Inject
    private TpTodolistFormTaskBean formTaskBean;

    // methode exécutée lorsque le remplissage du formulaire est correct
    public String formSubmit(String nouvelleTache){
        // sauvegarde nouvelle tache dans la liste
        taches.add(nouvelleTache);

        // vider le input du Form HTML
        formTaskBean.setTache("");

        return "tpTodolist";
    }

    public ArrayList<String> getTaches() {
        return taches;
    }

    public void setTaches(ArrayList<String> taches) {
        this.taches = taches;
    }
}
