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
public class Footer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreF;
    private String descripcionF;
    private String ubicacion;
    
    //Constructores

    public Footer() {
    }

    public Footer(String nombreF, String descripcionF, String ubicacion) {
        this.nombreF = nombreF;
        this.descripcionF = descripcionF;
        this.ubicacion = ubicacion;
    }
    //G y S

    public Footer(String nombreF, String descripcionF) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
