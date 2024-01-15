package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class CheckBoxBean {

    private List<String> options; // les différentes cases à cocher
    private List<String> selectedOptions; // cases sélectionnées par l'utilisateur

    public CheckBoxBean() {
        options = new ArrayList<>();

        options.add("lundi");
        options.add("mardi");
        options.add("mercredi");

    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public List<String> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(List<String> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public void submit(){
        System.out.println("selectedOption: "+selectedOptions);
    }
}
