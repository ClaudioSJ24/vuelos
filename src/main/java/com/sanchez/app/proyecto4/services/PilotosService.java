package com.sanchez.app.proyecto4.services;

import com.sanchez.app.proyecto4.dao.AvionesDAO;
import com.sanchez.app.proyecto4.dao.PilotosDAO;
import com.sanchez.app.proyecto4.dto.PilotoDTO;
import com.sanchez.app.proyecto4.models.Piloto;
import com.sanchez.app.proyecto4.models.enums.Generos;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
@Service
public class PilotosService implements IService<Piloto, PilotoDTO>{

    private PilotosDAO pilotosRepositoio;
    private AvionesDAO avionesRepositorio;

    public PilotosService(PilotosDAO pilotosrepositoio) {
        this.pilotosRepositoio = pilotosRepositoio;
    }

    @Override
    public List<Piloto> listar() {

        return (List<Piloto>) this.pilotosRepositoio.findAll();
    }

    @Override
    public Optional<Piloto> getId(Long id) {

        return Optional.of(this.pilotosRepositoio.findById(id).get());
    }

    @Override
    public void guardar(PilotoDTO pilotoDTO) {

        this.pilotosRepositoio.save(this.convertirDTOPiloto(pilotoDTO));

    }

    @Override
    public void eliminar(Long id) {

        this.pilotosRepositoio.deleteById(id);

    }

    public Piloto convertirDTOPiloto(PilotoDTO pilotoDTO){

        Piloto piloto = new Piloto();

        piloto.setIdP(pilotoDTO.getIdP());
        piloto.setAvion(this.avionesRepositorio.findById(pilotoDTO.getAvion()).orElse(null));
        piloto.setCodigoP(pilotoDTO.getCodigoP());
        piloto.setGenero(Generos.valueOf(pilotoDTO.getGenero()));
        piloto.setNombreC(pilotoDTO.getNombreC());
        //SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
       // piloto.setHorasP();

        return piloto;
    }
}
