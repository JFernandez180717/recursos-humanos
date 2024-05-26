package com.recursoshumanos.recursoshumanos.service;

import com.recursoshumanos.recursoshumanos.persistence.entity.AreaEntity;
import com.recursoshumanos.recursoshumanos.persistence.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.geom.Area;
import java.util.List;

@Service
public class AreaService {

    private final AreaRepository areaRepository;

    @Autowired
    public AreaService (AreaRepository areaRepository) {
        this.areaRepository = areaRepository;
    }

    public AreaEntity getById (int idArea) {
        return this.areaRepository.findById(idArea).orElse(null);
    }

    public List<AreaEntity> getAll () {
        return this.areaRepository.findAll();
    }

    public List<AreaEntity> getAllByEstado (Boolean estado) {
        return this.areaRepository.findAllByEstado(estado);
    }

    public AreaEntity saveArea (AreaEntity area) {
        return this.areaRepository.save(area);
    }

}
