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
public class Logo {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreL;
    private String descripcionL;
    private String imgL;
    
    //Constructores

    public Logo() {
    }

    public Logo(String nombreL, String descripcionL, String imgL) {
        this.nombreL = nombreL;
        this.descripcionL = descripcionL;
        this.imgL = imgL;
    }
    // G y S

    public Logo(String nombreL, String descripcionL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

