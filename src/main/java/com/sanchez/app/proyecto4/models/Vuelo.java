package com.sanchez.app.proyecto4.models;

import jakarta.persistence.*;

@Entity
@Table(name = "vuelos")
public class Vuelo {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ4")
    @SequenceGenerator(sequenceName = "CUST_SEQ4", allocationSize = 1, name = "CUST_SEQ4")
    private Long idV;

    @OneToOne()
    @JoinColumn(name = "piloto_id")
    private Piloto piloto;
    @ManyToOne
    @JoinColumn(name = "aeropuerto_id")
    private Aeropuerto aeropuerto;

}
