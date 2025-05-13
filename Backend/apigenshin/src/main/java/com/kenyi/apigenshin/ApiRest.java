package com.kenyi.apigenshin;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.kenyi.Models.*;
import com.kenyi.Repository.*;
import java.util.*;

@RestController
public class ApiRest {
    /*private final PersonajeRepository personajeRepository;
    public ApiRest(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }*/
    @GetMapping("/api")
    public String getApiInfo() {
        return "API Information: This is a sample API endpoint.";
    }

    /*@GetMapping("/api/personajes")
    public List<Personaje> obtenerTodosPersonajes() {
        return personajeRepository.findAll();
    }*/
    
    @GetMapping("/api/personajesfunc")
    public List<Map<String,Object>> obtenerTodos() {
        Personaje personaje = new Personaje();
        List<Map<String,Object>> objeMap=personaje.obteneMap();

        return objeMap;
    }

    
}
