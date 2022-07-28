/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Repository;

import com.portfolio.ed.Entity.Logo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RLogo extends JpaRepository<Logo, Integer>{
    public Optional<Logo> findByNombreL(String nombreL);
    public boolean existsByNombreL(String nombreL);
    
}
