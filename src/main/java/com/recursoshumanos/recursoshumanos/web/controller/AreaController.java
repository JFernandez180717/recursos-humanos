package com.recursoshumanos.recursoshumanos.web.controller;

import com.recursoshumanos.recursoshumanos.persistence.entity.AreaEntity;
import com.recursoshumanos.recursoshumanos.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("/api/area")
public class AreaController {
    private final AreaService areaService;

    @Autowired
    public AreaController (AreaService areaService) {
        this.areaService = areaService;
    }

    @GetMapping("/idarea/{idarea}")
    public ResponseEntity<AreaEntity> getById (@PathVariable("idarea") int idArea) {
        try {
            return ResponseEntity.ok(this.areaService.getById(idArea));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<AreaEntity>> getAll () {
        try {
            return ResponseEntity.ok(this.areaService.getAll());
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<AreaEntity>> getAllByEstado (@PathVariable("estado") Boolean estado) {
        try {
            return ResponseEntity.ok(this.areaService.getAllByEstado(estado));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/editar")
    public ResponseEntity<AreaEntity> saveArea (@RequestBody AreaEntity area) {
        try {
            return ResponseEntity.ok(this.areaService.saveArea(area));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
