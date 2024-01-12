package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MonNavigationController {

    public String goToPage1() {
        return "sitepage1?faces-redirect=false";
    }

    public String goToPage2() {
        return "sitepage2?faces-redirect=false";
    }
}
