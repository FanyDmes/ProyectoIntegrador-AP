/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHyS {

    @NotBlank
    private String nombreHyS;
    @NotBlank
    private String descripcionHyS;
    @NotBlank
    private String imgHyS;
    @NotBlank
    private String porcentaje;

    //Constructor
    
   
    public dtoHyS() {
    }

    public dtoHyS(String nombreHyS, String descripcionHyS, String imgHyS, String porcentaje) {
        this.nombreHyS = nombreHyS;
        this.descripcionHyS = descripcionHyS;
        this.imgHyS = imgHyS;
        this.porcentaje = porcentaje;
    }

    // G y S
    public String getNombreHyS() {
        return nombreHyS;
    }

    public void setNombreHyS(String nombreHyS) {
        this.nombreHyS = nombreHyS;
    }

    public String getDescripcionHyS() {
        return descripcionHyS;
    }

    public void setDescripcionHyS(String descripcionHyS) {
        this.descripcionHyS = descripcionHyS;
    }

    public String getImgHyS() {
        return imgHyS;
    }

    public void setImgHyS(String imgHyS) {
        this.imgHyS = imgHyS;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }


}
