/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Service;

import com.portfolio.ed.Entity.Footer;
import com.portfolio.ed.Repository.RFooter;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SFooter {
    @Autowired
    RFooter rFooter;
    
 public List<Footer> list(){
         return rFooter.findAll();
     }
     
     public Optional<Footer> getOne(int id){
         return rFooter.findById(id);
     }
     
     public Optional<Footer> getByNombreF(String nombreF){
         return rFooter.findByNombreF(nombreF);
     }
     
     public void save(Footer footer){
         rFooter.save(footer);
     }
     
     public void delete(int id){
         rFooter.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rFooter.existsById(id);
     }
     
     public boolean existsByNombreF(String nombreF){
         return rFooter.existsByNombreF(nombreF);
     }
}
