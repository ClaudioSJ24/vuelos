package com.sanchez.app.proyecto4.services;

import com.sanchez.app.proyecto4.dao.AvionesDAO;
import com.sanchez.app.proyecto4.models.Avion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvionesService implements IService<Avion, Avion>{

    @Autowired
    private AvionesDAO avionesRepository;

   // public AvionesService(AvionesDAO avionesRepository) {
   //     this.avionesRepository = avionesRepository;
   // }

    @Override
    public List<Avion> listar() {

        return (List<Avion>) this.avionesRepository.findAll();
    }

    @Override
    public Optional<Avion> getId(Long id) {

        return Optional.of(this.avionesRepository.findById(id).get());
    }

    @Override
    public void guardar(Avion avion) {

        this.avionesRepository.save(avion);
        

    }

    @Override
    public void eliminar(Long id) {

        this.avionesRepository.deleteById(id);

    }
}
