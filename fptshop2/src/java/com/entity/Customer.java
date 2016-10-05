/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author tan
 */
public class Customer {
    private String name,phone,email,country,glosbe,date;

    public Customer() {
    }

    public Customer(String name, String phone, String email, String country, String glosbe, String date) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.country = country;
        this.glosbe = glosbe;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGlosbe() {
        return glosbe;
    }

    public void setGlosbe(String glosbe) {
        this.glosbe = glosbe;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
