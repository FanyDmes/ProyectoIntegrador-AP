package com.portfolio.ed.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.ed.Entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
