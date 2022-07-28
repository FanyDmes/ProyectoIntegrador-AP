/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Service;

import com.portfolio.ed.Entity.Logo;
import com.portfolio.ed.Repository.RLogo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SLogo {
     @Autowired
     RLogo rLogo;
     
       public List<Logo> list(){
         return rLogo.findAll();
     }
     
     public Optional<Logo> getOne(int id){
         return rLogo.findById(id);
     }
     
     public Optional<Logo> getByNombreL(String nombreL){
         return rLogo.findByNombreL(nombreL);
     }
     
     public void save(Logo logo){
         rLogo.save(logo);
     }
     
  public void delete(int id){
         rLogo.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rLogo.existsById(id);
     }
     
     public boolean existsByNombreL(String nombreL){
         return rLogo.existsByNombreL(nombreL);
     }
}


