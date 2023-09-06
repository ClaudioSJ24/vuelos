package com.sanchez.app.proyecto4.models;

import com.sanchez.app.proyecto4.models.enums.CodigosPilotos;
import com.sanchez.app.proyecto4.models.enums.Generos;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "pilotos")
public class Piloto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ2")
    @SequenceGenerator(sequenceName = "CUST_SEQ2", allocationSize = 1, name = "CUST_SEQ2")
    private Long idP;
    @Enumerated
    @Column(name = "codigo_piloto")
    private CodigosPilotos codigoP;
    @Column(name = "nombre_completo")
    private String nombreC;
    @Column(name = "genero")
    private Generos genero;
    @Column(name = "horas_piloto")
    private Date horasP;
    @OneToOne()
    @JoinColumn(name = "avion_id")
    private Avion avion;

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

    public Generos getGenero() {
        return genero;
    }

    public void setGenero(Generos genero) {
        this.genero = genero;
    }

    public Date getHorasP() {
        return horasP;
    }

    public void setHorasP(Date horasP) {
        this.horasP = horasP;
    }


    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
