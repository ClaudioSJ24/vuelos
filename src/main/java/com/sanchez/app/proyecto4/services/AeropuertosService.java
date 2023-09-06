package com.sanchez.app.proyecto4.services;

import com.sanchez.app.proyecto4.dao.AeropuertosDAO;
import com.sanchez.app.proyecto4.models.Aeropuerto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class AeropuertosService implements IService<Aeropuerto, Aeropuerto>{

    private AeropuertosDAO aeropuertosRepositorio;

    public AeropuertosService(AeropuertosDAO aeropuertosRepositorio) {
        this.aeropuertosRepositorio = aeropuertosRepositorio;
    }

    @Override
    public List<Aeropuerto> listar() {

        return (List<Aeropuerto>) this.aeropuertosRepositorio.findAll();
    }

    @Override
    public Optional<Aeropuerto> getId(Long id) {

        return Optional.of(this.aeropuertosRepositorio.findById(id).get());
    }

    @Override
    public void guardar(Aeropuerto aeropuerto) {

        this.aeropuertosRepositorio.save(aeropuerto);

    }

    @Override
    public void eliminar(Long id) {

        this.aeropuertosRepositorio.deleteById(id);

    }
}
