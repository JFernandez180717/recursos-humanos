package com.recursoshumanos.recursoshumanos.persistence.repository;

import com.recursoshumanos.recursoshumanos.persistence.entity.EmpleadoEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepository extends CrudRepository<EmpleadoEntity, String> {
}
