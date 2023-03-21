package com.porfolio.AstroNave.Interface;

import java.util.List;

import com.porfolio.AstroNave.Entity.Persona;

public interface IPersonaService {
    
    //Lista Personas
    public List<Persona> getPersona();

    //Guardar
    public void savePersona(Persona persona);

    //Eliminar
    public void deletePersona(Long id);

    //Buscar
    public Persona findPersona(Long id);
}
