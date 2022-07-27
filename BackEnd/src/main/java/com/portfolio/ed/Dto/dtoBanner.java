/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Dto;

import javax.validation.constraints.NotBlank;

public class dtoBanner {

    @NotBlank
    private String nombreBanner;
    @NotBlank
    private String imgBanner;
    @NotBlank
    private String descripcionBanner;
    
    //Constructores

    public dtoBanner() {
    }

    public dtoBanner(String nombreBanner, String imgBanner, String descripcionBanner) {
        this.nombreBanner = nombreBanner;
        this.imgBanner = imgBanner;
        this.descripcionBanner = descripcionBanner;
    }
     
    //G y S

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

    public void setDescripcionBanner(String descripcionBanner) {
        this.descripcionBanner = descripcionBanner;
    }
    
}
