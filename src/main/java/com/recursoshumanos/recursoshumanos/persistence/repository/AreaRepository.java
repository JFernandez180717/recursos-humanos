package com.recursoshumanos.recursoshumanos.persistence.repository;

import com.recursoshumanos.recursoshumanos.persistence.entity.AreaEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;


public interface AreaRepository extends ListCrudRepository<AreaEntity, Integer> {
    public List<AreaEntity> findAllByEstado(Boolean estado);
}
