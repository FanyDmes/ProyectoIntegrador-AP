/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Dto;

import javax.validation.constraints.NotBlank;


public class dtoPersona {
     @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String img;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String titulo;
    
    //Constructor

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String apellido, String img, String descripcion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
        this.descripcion = descripcion;
        this.titulo = titulo;
    }
    
    //G y S

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    
}
