package com.sanchez.app.proyecto4.controllers;

import com.sanchez.app.proyecto4.dto.PilotoDTO;
import com.sanchez.app.proyecto4.models.Piloto;
import com.sanchez.app.proyecto4.services.IService;
import com.sanchez.app.proyecto4.services.PilotosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("api/pilotos")
@CrossOrigin(origins = "*")
public class PilotosServlet {

    @Autowired
    private IService<Piloto, PilotoDTO> pilotosService;

    @GetMapping
    public List<Piloto> obtenerListPilotos(){
        return this.pilotosService.listar();
    }

    @PostMapping
    public Map<String, String> almacenarPiloto(@RequestBody PilotoDTO pilotoDTO){

        Map<String, String> res = new HashMap<>();

        this.pilotosService.guardar(pilotoDTO);

        res.put("success", "OK");
        res.put("msg", "Piloto Almacenado¡¡¡");

        return res;

    }
    @GetMapping("/{id}")
    public Piloto obtenerPiloto(@PathVariable(name = "id") long id){

        return this.pilotosService.getId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Map<String, String> actualizarPiloto(@RequestBody PilotoDTO pilotoDTO, @PathVariable(name = "id") long id){

        Map<String, String> res = new HashMap<>();
        Optional<Piloto> idP = this.pilotosService.getId(id);
        if (idP.isPresent()) {

            this.pilotosService.guardar(pilotoDTO);
            res.put("success", "OK");
            res.put("msg", "Piloto Actualizado¡¡¡");

        }else{
            throw  new RuntimeException("El id no existe en la base de datos");
        }

        return res;
    }
}
