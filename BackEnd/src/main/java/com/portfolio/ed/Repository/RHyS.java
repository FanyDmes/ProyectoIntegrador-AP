/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Repository;

import com.portfolio.ed.Entity.HyS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
   public interface RHyS extends JpaRepository<HyS, Integer> {
   public Optional<HyS> findByNombreHyS(String nombreHyS);
   public boolean existsByNombreHyS(String nombreHyS); 
    

    
}
