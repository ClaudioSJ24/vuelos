package com.sanchez.app.proyecto4.services;

import java.util.List;
import java.util.Optional;

public interface IService <T, S>{

    List<T> listar();
    Optional<T> getId(Long id);
    void guardar(S s);
    void eliminar(Long id);


}
