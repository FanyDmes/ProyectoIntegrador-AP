/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Service;

import com.portfolio.ed.Entity.Banner;
import com.portfolio.ed.Repository.RBanner;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SBanner {
    @Autowired
    RBanner rBanner;
    
     public List<Banner> list(){
         return rBanner.findAll();
     }
     
     public Optional<Banner> getOne(int id){
         return rBanner.findById(id);
     }
     
     public Optional<Banner> getByNombreBanner(String nombreBanner){
         return rBanner.findByNombreBanner(nombreBanner);
     }
     
      public void save(Banner banner){
         rBanner.save(banner);
     }
     
     public void delete(int id){
         rBanner.deleteById(id);
     }
     
     public boolean existsById(int id){
         return rBanner.existsById(id);
     }
     
     public boolean existsByNombreBanner(String nombreBanner){
         return rBanner.existsByNombreBanner(nombreBanner);
     }
}
