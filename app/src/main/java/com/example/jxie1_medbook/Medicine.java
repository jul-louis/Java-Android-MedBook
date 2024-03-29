package com.example.jxie1_medbook;

import java.io.Serializable;
import java.util.Date;

/*
    Class: Medicine
    @author Louie Xie
    Medicine class contains all required information for a medicine:
     the date start to take, the name of the medicine
     the dose and unit of dose, the daily frequency
 */
public class Medicine implements Serializable {
    // Class members:
    private Date dateStart;
    private String name;
    private Float doseAmount;
    private String doseUnit;
    private Integer dailyFrequency;

    /*
        Constructor of Medicine:
        @param Date start
        @param String name
        @param Float amount
        @param String unit
        @param Integer freq
     */
    public Medicine(Date start, String name, Float amount, String unit, Integer freq) {
        this.dateStart = start;
        this.setName(name);
        this.doseAmount = amount;
        this.doseUnit = unit;
        this.dailyFrequency = freq;
    }

    // Setters and Getters:
    public void setDateStart(Date start) {
        this.dateStart = start;
    }

    public Date getDateStart() {
        return this.dateStart;
    }

    public void setName(String name) {
        // To restrict the limit of the name length.
        if (name.length() > 40) {
            this.name = name.substring(0, 40);
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setDoseAmount(Float amount) {
        this.doseAmount = amount;
    }

    public Float getDoseAmount() {
        return this.doseAmount;
    }

    public void setDoseUnit(String unit) {
        this.doseUnit = unit;
    }

    public String getDoseUnit() {
        return this.doseUnit;
    }

    public void setDailyFrequency(Integer freq) {
        this.dailyFrequency = freq;
    }

    public Integer getDailyFrequency() {
        return this.dailyFrequency;
    }

}
