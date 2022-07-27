/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Service;

import com.portfolio.ed.Entity.HyS;
import com.portfolio.ed.Repository.RHyS;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHyS {
     @Autowired
     RHyS rHyS;
     
      public List<HyS> list(){
         return rHyS.findAll();
     }
     
     public Optional<HyS> getOne(int id){
         return rHyS.findById(id);
     }
    
      public Optional<HyS> getByNombreHyS(String nombreHyS){
         return rHyS.findByNombreHyS(nombreHyS);
     }
     
     public void save(HyS hys){
         rHyS.save(hys);
     }
     
          public void delete(int id){
         rHyS.deleteById(id);
     }
          
      public boolean existsById(int id){
         return rHyS.existsById(id);
     }
     
     public boolean existsByNombreHyS(String nombreHyS){
         return rHyS.existsByNombreHyS(nombreHyS);
     }
}
