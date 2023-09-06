package com.sanchez.app.proyecto4.dao;

import com.sanchez.app.proyecto4.models.Piloto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PilotosDAO extends CrudRepository<Piloto, Long> {
}
