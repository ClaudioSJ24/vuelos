package com.sanchez.app.proyecto4.controllers;

import com.sanchez.app.proyecto4.models.Aeropuerto;
import com.sanchez.app.proyecto4.services.AeropuertosService;
import com.sanchez.app.proyecto4.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/aeropuertos")
@CrossOrigin(origins = "*")
public class AeropuertosServlet {

    @Autowired
    private IService<Aeropuerto, Aeropuerto> aeropuertosService;

    @GetMapping
    public List<Aeropuerto> obtenerListAeropuertoes(){
        return this.aeropuertosService.listar();
    }

    @PostMapping
    public Map<String, String> almacenarAeropuerto(@RequestBody Aeropuerto aeropuerto){

        Map<String, String> res = new HashMap<>();

        this.aeropuertosService.guardar(aeropuerto);

        res.put("success", "OK");
        res.put("msg", "Aeropuerto Almacenado¡¡¡");

        return res;

    }
    @GetMapping("/{id}")
    public Aeropuerto obtenerAeropuerto(@PathVariable(name = "id") long id){

        return this.aeropuertosService.getId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Map<String, String> actualizarAeropuerto(@RequestBody Aeropuerto aeropuerto, @PathVariable(name = "id") long id){

        Map<String, String> res = new HashMap<>();
        Optional<Aeropuerto> idP = this.aeropuertosService.getId(id);
        if (idP.isPresent()) {
            
            this.aeropuertosService.guardar(aeropuerto);
            res.put("success", "OK");
            res.put("msg", "Aeropuerto Actualizado¡¡¡");
            
        }else{
            throw  new RuntimeException("El id no existe en la base de datos");
        }
        
        return res;
    }
}
