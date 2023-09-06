package com.sanchez.app.proyecto4.dto;

import com.sanchez.app.proyecto4.models.Avion;
import com.sanchez.app.proyecto4.models.Vuelo;
import com.sanchez.app.proyecto4.models.enums.CodigosPilotos;
import com.sanchez.app.proyecto4.models.enums.Generos;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class PilotoDTO {
    private Long idP;
    private CodigosPilotos codigoP;
    private String nombreC;
    private String genero;
    private Date horasP;
    private Long vuelo;
    private Long avion;

    public Long getIdP() {
        return idP;
    }

    public void setIdP(Long idP) {
        this.idP = idP;
    }

    public CodigosPilotos getCodigoP() {
        return codigoP;
    }

    public void setCodigoP(CodigosPilotos codigoP) {
        this.codigoP = codigoP;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Date getHorasP() {
        return horasP;
    }

    public void setHorasP(Date horasP) {
        this.horasP = horasP;
    }


    public Long getVuelo() {
        return vuelo;
    }

    public void setVuelo(Long vuelo) {
        this.vuelo = vuelo;
    }

    public Long getAvion() {
        return avion;
    }

    public void setAvion(Long avion) {
        this.avion = avion;
    }
}
