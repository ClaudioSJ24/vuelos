package com.sanchez.app.proyecto4.models;

import com.sanchez.app.proyecto4.models.enums.CodigosPilotos;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "aeropuertos")
public class Aeropuerto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ3")
    @SequenceGenerator(sequenceName = "CUST_SEQ3", allocationSize = 1, name = "CUST_SEQ3")
    private Long idA;
    @Column(name = "nombre")
    private String nombreA;
    @Column(name = "municipio")
    private String municipio;
    @Column(name = "estado_pais")
    private String estadoPais;
    @Column(name = "horas_vuelo_o_d")
    private Date horas;
    @Column(name = "origen")
    private String origen;
    @Column(name = "destino")
    private String destino;

    @OneToMany(mappedBy = "aeropuerto")
    private List<Vuelo> vuelos;


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

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }
}
