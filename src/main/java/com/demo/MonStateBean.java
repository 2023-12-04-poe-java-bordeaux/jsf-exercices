package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class MonStateBean {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void changeValue(){
        count++;
    }
}
