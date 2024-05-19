package com.recursoshumanos.recursoshumanos.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "area")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AreaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idarea", nullable = false)
    private int idArea;

    @Column(nullable = false, length = 60)
    private String descripcion;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private Boolean estado;
}
