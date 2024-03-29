package com.porfolio.AstroNave.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.porfolio.AstroNave.Entity.Persona;
import com.porfolio.AstroNave.Interface.IPersonaService;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;

    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }

    @PostMapping("persona/crear")
    public String crearPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "Persona creada";
    }

    @DeleteMapping("perosna/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "Perosna eliminada";
    }

    @PutMapping("/persona/editar/{id}")
    public Persona editPersona(@PathVariable Long id, 
                                @RequestParam ("nombre") String nuevoNombre, 
                                @RequestParam ("apellido") String nuevoApellido,
                                @RequestParam ("img") String nuevoImg){

            Persona persona = ipersonaService.findPersona(id);
            persona.setNombre(nuevoNombre);
            persona.setApellido(nuevoApellido);
            persona.setImg(nuevoImg);  
            
            ipersonaService.savePersona(persona);
            return persona;
                                }
}
