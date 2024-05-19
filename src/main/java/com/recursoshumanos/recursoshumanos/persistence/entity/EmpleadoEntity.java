package com.recursoshumanos.recursoshumanos.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "empleado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpleadoEntity {
    @Id
    @Column(name = "id_empleado", nullable = false, length = 20)
    private String idEmpleado;

    @Column(name = "primer_nombre", length = 30, nullable = false)
    private String primerNombre;

    @Column(name = "segundo_nombre", length = 30)
    private String segundoNombre;

    @Column(name = "primer_apellido", length = 30, nullable = false)
    private String primerApellido;

    @Column(name = "segundo_apellido", length = 30)
    private String segundoApellido;

    @Column(name = "fecha_ingreso", columnDefinition = "DATETIME")
    private LocalDateTime fechaIngreso;

    @Column(nullable = false)
    private int salario;

    @Column(length = 100)
    private String direccion;

    @Column(length = 10)
    private String name;

    @Column(length = 60)
    private String email;

    @Column(nullable = false, columnDefinition = "TINYINT")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo", insertable = false, updatable = false)
    private CargoEntity cargo;

    @ManyToOne
    @JoinColumn(name = "idarea", referencedColumnName = "idarea", insertable = false, updatable = false)
    private CargoEntity area;
}
