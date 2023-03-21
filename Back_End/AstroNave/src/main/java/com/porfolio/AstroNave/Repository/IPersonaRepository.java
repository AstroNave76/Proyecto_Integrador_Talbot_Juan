package com.porfolio.AstroNave.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.porfolio.AstroNave.Entity.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
