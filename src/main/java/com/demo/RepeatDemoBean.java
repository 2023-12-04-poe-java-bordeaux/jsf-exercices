package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.Arrays;
import java.util.List;

@Named("personBean")
@RequestScoped
public class RepeatDemoBean {

    private List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

    public List<String> getNames() {
        return names;
    }
    public void setNames(List<String> names) {
        this.names = names;
    }
}