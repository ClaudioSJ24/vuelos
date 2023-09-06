package com.sanchez.app.proyecto4.controllers;

import com.sanchez.app.proyecto4.models.Avion;
import com.sanchez.app.proyecto4.models.Vuelo;
import com.sanchez.app.proyecto4.services.AvionesService;
import com.sanchez.app.proyecto4.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/vuelos")
@CrossOrigin(origins = "*")
public class VuelosServlet {

    @Autowired
    private IService<Vuelo, Vuelo> avionesService;

    @GetMapping
    public List<Vuelo> obtenerListAviones(){
        return this.avionesService.listar();
    }

    @PostMapping
    public Map<String, String> almacenarAvion(@RequestBody Vuelo vuelo){

        Map<String, String> res = new HashMap<>();

        this.avionesService.guardar(vuelo);

        res.put("success", "OK");
        res.put("msg", "Avion Almacenado¡¡¡");

        return res;

    }
    @GetMapping("/{id}")
    public Vuelo obtenerAvion(@PathVariable(name = "id") long id){

        return this.avionesService.getId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Map<String, String> actualizarAvion(@RequestBody Vuelo vuelo, @PathVariable(name = "id") long id){

        Map<String, String> res = new HashMap<>();
        Optional<Vuelo> idP = this.avionesService.getId(id);
        if (idP.isPresent()) {
            
            this.avionesService.guardar(vuelo);
            res.put("success", "OK");
            res.put("msg", "Avion Actualizado¡¡¡");
            
        }else{
            throw  new RuntimeException("El id no existe en la base de datos");
        }
        
        return res;
    }
}
