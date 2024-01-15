package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("formTaskBean")
@RequestScoped
public class TpTodolistFormTaskBean {

    private String tache;

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }

   }
