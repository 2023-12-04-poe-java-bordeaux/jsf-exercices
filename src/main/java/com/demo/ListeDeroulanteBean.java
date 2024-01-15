package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.LinkedHashMap;
import java.util.Map;

@Named
@RequestScoped
public class ListeDeroulanteBean {

    private Map<String, String> options; // les options HTML pour le menu déroulant
    private String selectedOption; // élément de la liste déroulante sélectionné par l'utilisateur

    public ListeDeroulanteBean() {
        options = new LinkedHashMap<>();
        options.put("Lundi", "1");
        options.put("Mardi", "2");
        options.put("Mercredi", "3");
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    public String getSelectedOption() {
        return selectedOption;
    }

    public void setSelectedOption(String selectedOption) {
        this.selectedOption = selectedOption;
    }

    public void submit(){
        System.out.println("selectedOption: "+selectedOption);
    }
}
