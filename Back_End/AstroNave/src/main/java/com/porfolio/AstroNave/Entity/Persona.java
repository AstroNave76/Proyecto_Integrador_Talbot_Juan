package com.porfolio.AstroNave.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 50, message = "no cumple")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 50, message = "no cumple")
    private String img;
    
}
