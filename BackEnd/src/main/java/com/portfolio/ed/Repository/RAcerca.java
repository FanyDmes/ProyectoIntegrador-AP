/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.ed.Repository;

import com.portfolio.ed.Entity.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RAcerca extends JpaRepository<Acerca, Integer> {

    public Optional<Acerca> findByNombreA(String nombreA);

    public boolean existsByNombreA(String nombreA);
}
