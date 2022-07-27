/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Controller;

import com.portfolio.ed.Dto.dtoFooter;
import com.portfolio.ed.Entity.Footer;
import com.portfolio.ed.Security.Controller.Mensaje;
import com.portfolio.ed.Service.SFooter;
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
@RequestMapping("/footer")
@CrossOrigin(origins = "http://localhost:4200")
public class CFooter {
       @Autowired
       SFooter sFooter;
       
        @GetMapping("/lista")
    public ResponseEntity<List<Footer>> list(){
        List<Footer> list = sFooter.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Footer> getById(@PathVariable("id") int id){
        if(!sFooter.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Footer footer = sFooter.getOne(id).get();
        return new ResponseEntity(footer, HttpStatus.OK);
    }
        
        @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sFooter.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sFooter.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoFooter dtoexp){      
        if(StringUtils.isBlank(dtoexp.getNombreF()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sFooter.existsByNombreF(dtoexp.getNombreF()))
            return new ResponseEntity(new Mensaje("Ya existe"), HttpStatus.BAD_REQUEST);
        
        Footer footer = new Footer(dtoexp.getNombreF(), dtoexp.getDescripcionF());
        sFooter.save(footer);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
      
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoFooter dtoexp){
        //Validamos si existe el ID
        if(!sFooter.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre 
        if(sFooter.existsByNombreF(dtoexp.getNombreF()) && sFooter.getByNombreF(dtoexp.getNombreF()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Esa experiencia ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexp.getNombreF()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Footer footer = sFooter.getOne(id).get();
        footer.setNombreF(dtoexp.getNombreF());
        footer.setDescripcionF((dtoexp.getDescripcionF()));
        
        sFooter.save(footer);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
             
    }
    
}
