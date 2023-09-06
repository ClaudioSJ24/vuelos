package com.sanchez.app.proyecto4.services;

import com.sanchez.app.proyecto4.dao.VuelosDAO;
import com.sanchez.app.proyecto4.models.Vuelo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class VuelosService implements IService<Vuelo, Vuelo>{

    private VuelosDAO vuelosRepository;

    public VuelosService(VuelosDAO vuelosRepository) {
        this.vuelosRepository = vuelosRepository;
    }

    @Override
    public List<Vuelo> listar() {
        return (List<Vuelo>) this.vuelosRepository.findAll();
    }

    @Override
    public Optional<Vuelo> getId(Long id) {
        return Optional.of(this.vuelosRepository.findById(id).get());
    }

    @Override
    public void guardar(Vuelo vuelo) {

        this.vuelosRepository.save(vuelo);

    }

    @Override
    public void eliminar(Long id) {

        this.vuelosRepository.deleteById(id);

    }
}
