package com.sanchez.app.proyecto4.models;

import com.sanchez.app.proyecto4.models.enums.CodigosAviones;
import com.sanchez.app.proyecto4.models.enums.TiposAviones;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.Date;

@Entity
@Table(name = "aviones")
public class Avion {

    @Id
    @Column(name = "idA")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ1")
    @SequenceGenerator(sequenceName = "CUST_SEQ1", allocationSize = 1, name = "CUST_SEQ1")

    private Long idA;

    @Column(name = "codigo_avion")
    private CodigosAviones codigoA;

    @Column(name = "tipo_avion")
    private TiposAviones tipoA;
    @Column(name = "horas_avion")
    private Date horasA;
    @Column(name = "numero_pasajerso")
    private Integer numPasajeros;

}
