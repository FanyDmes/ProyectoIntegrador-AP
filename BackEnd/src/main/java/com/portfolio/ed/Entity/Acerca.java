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
public class Acerca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    private String nombreA;
    private String descripcionA;
    private String tituloA;
    private String imgA;
    
       //Constructores

    public Acerca() {
    }

    public Acerca(String nombreA, String descripcionA, String tituloA, String imgA) {
        this.nombreA = nombreA;
        this.descripcionA = descripcionA;
        this.tituloA = tituloA;
        this.imgA = imgA;
    }
    //G yS

    public Acerca(String nombreA, String descripcionA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
