/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Banner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombreBanner;
    private String imgBanner;
    private String descripcionBanner;
    
    //Constructor

    public Banner() {
    }

    public Banner(String nombreBanner, String imgBanner, String descripcionBanner) {
        this.nombreBanner = nombreBanner;
        this.imgBanner = imgBanner;
        this.descripcionBanner = descripcionBanner;
    }

    public Banner(String nombreBanner, String descripcionBanner) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //G y S

     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreBanner() {
        return nombreBanner;
    }

    public void setNombreBanner(String nombreBanner) {
        this.nombreBanner = nombreBanner;
    }
    
    public String getImgBanner() {
        return imgBanner;
    }

    public void setImgBanner(String imgBanner) {
        this.imgBanner = imgBanner;
    }

    public String getDescripcionBanner() {
        return descripcionBanner;
    }

    public void setDescripccionBanner(String descripcionBanner) {
        this.descripcionBanner = descripcionBanner;
    }


    public void setDescripcionBanner(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
