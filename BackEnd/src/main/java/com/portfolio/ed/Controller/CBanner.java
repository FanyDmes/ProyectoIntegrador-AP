/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Controller;

import com.portfolio.ed.Dto.dtoBanner;
import com.portfolio.ed.Entity.Banner;
import com.portfolio.ed.Security.Controller.Mensaje;
import com.portfolio.ed.Service.SBanner;
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
@RequestMapping("/banner")
@CrossOrigin(origins = "http://localhost:4200")
public class CBanner {
     @Autowired
     SBanner sBanner;
     
      @GetMapping("/lista")
    public ResponseEntity<List<Banner>> list(){
        List<Banner> list = sBanner.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Banner> getById(@PathVariable("id") int id){
        if(!sBanner.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        Banner banner = sBanner.getOne(id).get();
        return new ResponseEntity(banner, HttpStatus.OK);
    }
    
      @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sBanner.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sBanner.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }

    
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoBanner dtoexp){      
        if(StringUtils.isBlank(dtoexp.getNombreBanner()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        if(sBanner.existsByNombreBanner(dtoexp.getNombreBanner()))
            return new ResponseEntity(new Mensaje("Ese banner ya existe"), HttpStatus.BAD_REQUEST);
           
          Banner banner = new Banner(dtoexp.getNombreBanner(), dtoexp.getDescripcionBanner());
        sBanner.save(banner);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoBanner dtoexp){
        //Validamos si existe el ID
        if(!sBanner.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //Compara nombre de experiencias
        if(sBanner.existsByNombreBanner(dtoexp.getNombreBanner()) && sBanner.getByNombreBanner(dtoexp.getNombreBanner()).get().getId() != id)
            return new ResponseEntity(new Mensaje("Ese Banner ya existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexp.getNombreBanner()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Banner banner = sBanner.getOne(id).get();
        banner.setNombreBanner(dtoexp.getNombreBanner());
        banner.setDescripcionBanner((dtoexp.getDescripcionBanner()));
        
        sBanner.save(banner);
        return new ResponseEntity(new Mensaje("Banner actualizado"), HttpStatus.OK);
             
    }
}
