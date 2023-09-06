package com.sanchez.app.proyecto4.controllers;

import com.sanchez.app.proyecto4.models.Avion;
import com.sanchez.app.proyecto4.services.AvionesService;
import com.sanchez.app.proyecto4.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/aviones")
@CrossOrigin(origins = "*")
public class AvionesServlet {

    @Autowired
    private IService<Avion, Avion> avionesService;

    @GetMapping
    public List<Avion> obtenerListAviones(){
        return this.avionesService.listar();
    }

    @PostMapping
    public Map<String, String> almacenarAvion(@RequestBody Avion avion){

        Map<String, String> res = new HashMap<>();

        this.avionesService.guardar(avion);

        res.put("success", "OK");
        res.put("msg", "Avion Almacenado¡¡¡");


        return res;

    }
    @GetMapping("/{id}")
    public Avion obtenerAvion(@PathVariable(name = "id") long id){

        return this.avionesService.getId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Map<String, String> actualizarAvion(@RequestBody Avion avion, @PathVariable(name = "id") long id){

        Map<String, String> res = new HashMap<>();
        Optional<Avion> idP = this.avionesService.getId(id);
        if (idP.isPresent()) {
            
            this.avionesService.guardar(avion);
            res.put("success", "OK");
            res.put("msg", "Avion Actualizado¡¡¡");
            
        }else{
            throw  new RuntimeException("El id no existe en la base de datos");
        }
        
        return res;
    }
}
