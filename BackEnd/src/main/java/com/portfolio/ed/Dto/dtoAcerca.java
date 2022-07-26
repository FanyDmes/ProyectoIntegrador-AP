/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Dto;

import javax.validation.constraints.NotBlank;

public class dtoAcerca {

    @NotBlank
    private String nombreA;
    @NotBlank
    private String descripcionA;
    @NotBlank
    private String tituloA;
    @NotBlank
    private String imgA;

    //Constructores

    public dtoAcerca() {
    }

    public dtoAcerca(String nombreA, String descripcionA, String tituloA, String imgA) {
        this.nombreA = nombreA;
        this.descripcionA = descripcionA;
        this.tituloA = tituloA;
        this.imgA = imgA;
    }
    //GyS

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getDescripcionA() {
        return descripcionA;
    }

    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }

    public String getTituloA() {
        return tituloA;
    }

    public void setTituloA(String tituloA) {
        this.tituloA = tituloA;
    }

    public String getImgA() {
        return imgA;
    }

    public void setImgA(String imgA) {
        this.imgA = imgA;
    }
    
}
