/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Dto;

import javax.validation.constraints.NotBlank;


public class dtoFooter {
     @NotBlank
    private String nombreF;
    @NotBlank
    private String descripcionF;
     @NotBlank
    private String ubicacion;
 
    //Constructores

    public dtoFooter() {
    }

    public dtoFooter(String nombreF, String descripcionF, String ubicacion) {
        this.nombreF = nombreF;
        this.descripcionF = descripcionF;
        this.ubicacion = ubicacion;
    }
     // G y S

    public String getNombreF() {
        return nombreF;
    }

    public void setNombreF(String nombreF) {
        this.nombreF = nombreF;
    }

    public String getDescripcionF() {
        return descripcionF;
    }

    public void setDescripcionF(String descripcionF) {
        this.descripcionF = descripcionF;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
