package com.sanchez.app.proyecto4.dto;

import com.sanchez.app.proyecto4.models.Vuelo;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

import java.util.Date;
import java.util.List;

public class AeropuertoDTO {

    private Long idA;
   private String nombreA;
   private String municipio;
   private String estadoPais;
   private Date horas;
   private String origen;
   private String destino;

   private Integer vuelo;

    public Long getIdA() {
        return idA;
    }

    public void setIdA(Long idA) {
        this.idA = idA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getEstadoPais() {
        return estadoPais;
    }

    public void setEstadoPais(String estadoPais) {
        this.estadoPais = estadoPais;
    }

    public Date getHoras() {
        return horas;
    }

    public void setHoras(Date horas) {
        this.horas = horas;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getVuelo() {
        return vuelo;
    }

    public void setVuelo(Integer vuelo) {
        this.vuelo = vuelo;
    }
}
