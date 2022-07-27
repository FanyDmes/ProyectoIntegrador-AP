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
import javax.validation.constraints.Size;

@Entity
public class HyS {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   
    private int id;
    private String nombreHyS;
    private String descripcionHyS;
    @Size(min = 1, max = 50, message = "no cumple con la longitud")
    private String imgHyS;
    private String porcentaje;
    //Constructor

    public HyS() {
    }

    public HyS(String nombreHyS, String descripcionHyS, String imgHyS, String porcentaje) {
        this.nombreHyS = nombreHyS;
        this.descripcionHyS = descripcionHyS;
        this.imgHyS = imgHyS;
        this.porcentaje = porcentaje;
    }
    
    //G y S

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
