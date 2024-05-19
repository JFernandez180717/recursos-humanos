package com.recursoshumanos.recursoshumanos.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cargo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CargoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcargo", nullable = false)
    private int idCargo;

    @Column(nullable = false, length = 60)
    private String descripcion;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private Boolean estado;
}
