package com.demo.tpBlog;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.ArrayList;

@Named("blog")
@ApplicationScoped
public class BlogBean {

    private int idCount = 0;

    private ArrayList<Billet> billets = new ArrayList<>();

    @Inject
    private BilletFormBean formBean;

    public ArrayList<Billet> getBillets() {
        return billets;
    }

    public void addBillet(Billet billet){
        billet.setId(idCount++);
        billets.add(billet);
    }

    public String submitForm(){
        Billet billet = new Billet(formBean.getTitre(), formBean.getContenu());
        addBillet(billet);
        return "tpBlogAccueil";
    }
}
