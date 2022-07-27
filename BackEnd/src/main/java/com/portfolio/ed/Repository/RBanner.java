/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Repository;
import com.portfolio.ed.Entity.Banner;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RBanner extends JpaRepository<Banner, Integer>{
    public Optional<Banner> findByNombreBanner(String nombreBanner);
     public boolean existsByNombreBanner(String nombreBanner);
}
