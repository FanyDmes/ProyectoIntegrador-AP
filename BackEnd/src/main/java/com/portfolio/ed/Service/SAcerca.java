/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Service;

import com.portfolio.ed.Entity.Acerca;
import com.portfolio.ed.Repository.RAcerca;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SAcerca {
    @Autowired
    RAcerca rAcerca;
    
     public List<Acerca> list(){
         return rAcerca.findAll();
     }
     
     public Optional<Acerca> getOne(int id){
         return rAcerca.findById(id);
     }
     
     public Optional<Acerca> getByNombreA(String nombreA){
         return rAcerca.findByNombreA(nombreA);
     }
       
     public void save(Acerca expe){
         rAcerca.save(expe);
     }
     
     public void delete(int id){
         rAcerca.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rAcerca.existsById(id);
     }
     
     public boolean existsByNombreA(String nombreA){
         return rAcerca.existsByNombreA(nombreA);
     }
}
