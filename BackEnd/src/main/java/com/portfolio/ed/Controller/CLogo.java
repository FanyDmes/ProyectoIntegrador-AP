/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Controller;

import com.portfolio.ed.Dto.dtoLogo;
import com.portfolio.ed.Entity.Logo;
import com.portfolio.ed.Security.Controller.Mensaje;
import com.portfolio.ed.Service.SLogo;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loglab")
@CrossOrigin(origins = "https://myportfolioap-8f133.web.app")

public class CLogo {
    @Autowired
    SLogo sLogo;
    
      @GetMapping("/lista")
    public ResponseEntity<List<Logo>> list(){
        List<Logo> list = sLogo.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Logo> getById(@PathVariable("id") int id){
        if(!sLogo.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Logo logo = sLogo.getOne(id).get();
        return new ResponseEntity(logo, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sLogo.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sLogo.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
    
     
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoLogo dtoexp){      
        if(StringUtils.isBlank(dtoexp.getNombreL()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sLogo.existsByNombreL(dtoexp.getNombreL()))
            return new ResponseEntity(new Mensaje("Ese logo ya existe"), HttpStatus.BAD_REQUEST);
        
        Logo logo = new Logo(dtoexp.getNombreL(), dtoexp.getDescripcionL());
        sLogo.save(logo);
        
        return new ResponseEntity(new Mensaje("Logo agregado"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoLogo dtoexp){
        //Validamos si existe el ID
        if(!sLogo.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(sLogo.existsByNombreL(dtoexp.getNombreL()) && sLogo.getByNombreL(dtoexp.getNombreL()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ese logo ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexp.getNombreL()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Logo logo = sLogo.getOne(id).get();
        logo.setNombreL(dtoexp.getNombreL());
        logo.setDescripcionL((dtoexp.getDescripcionL()));
        
        sLogo.save(logo);
        return new ResponseEntity(new Mensaje("Logo actualizado"), HttpStatus.OK);
             
    }
}
