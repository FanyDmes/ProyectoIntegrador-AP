/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Dto;

import javax.validation.constraints.NotBlank;


public class dtoLogo {
     @NotBlank
    private String nombreL;
    @NotBlank
    private String descripcionL;
    @NotBlank
    private String imgL;
    
    
    //Constructores

    public dtoLogo() {
    }

    public dtoLogo(String nombreL, String descripcionL, String imgL) {
        this.nombreL = nombreL;
        this.descripcionL = descripcionL;
        this.imgL = imgL;
    }
    
    //G y S

    public String getNombreL() {
        return nombreL;
    }

    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    public String getDescripcionL() {
        return descripcionL;
    }

    public void setDescripcionL(String descripcionL) {
        this.descripcionL = descripcionL;
    }

    public String getImgL() {
        return imgL;
    }

    public void setImgL(String imgL) {
        this.imgL = imgL;
    }
    
}
