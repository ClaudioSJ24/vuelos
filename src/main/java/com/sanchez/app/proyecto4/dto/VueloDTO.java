package com.sanchez.app.proyecto4.dto;

import com.sanchez.app.proyecto4.models.Aeropuerto;
import com.sanchez.app.proyecto4.models.Piloto;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

public class VueloDTO {
    private Long idV;
    private Integer piloto;
    private Integer aeropuerto;

    public Long getIdV() {
        return idV;
    }

    public void setIdV(Long idV) {
        this.idV = idV;
    }

    public Integer getPiloto() {
        return piloto;
    }

    public void setPiloto(Integer piloto) {
        this.piloto = piloto;
    }

    public Integer getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(Integer aeropuerto) {
        this.aeropuerto = aeropuerto;
    }
}
