package com.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.time.LocalDate;
import java.util.Date;

@Named
@RequestScoped
public class DemoDateFormBean {

    private LocalDate date = LocalDate.now();
    /*
    public LocalDate getDate() {
        return date;
    }
*/
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Date getDate() {
        return new Date(date.getYear(), date.getMonthValue(), date.getDayOfMonth());
    }

    public String formSubmit()
    {
        System.out.println(date);
        return "dateFormat2.xhtml";
    }
}
