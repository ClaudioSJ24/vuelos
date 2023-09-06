package com.sanchez.app.proyecto4.dao;

import com.sanchez.app.proyecto4.models.Avion;
import com.sanchez.app.proyecto4.models.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface VuelosDAO extends CrudRepository<Vuelo, Long> {
}
