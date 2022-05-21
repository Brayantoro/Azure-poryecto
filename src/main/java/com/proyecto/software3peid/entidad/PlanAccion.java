package com.proyecto.software3peid.entidad;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class PlanAccion implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(nullable = false, length = 100)
    private String nombre;


    @Column(nullable = false)
    private double peso;


    @Column(nullable = false, length = 100)
    private String Actividad;


    @Column(nullable = false)
    private Integer presupuesto;

    @Column(nullable = false)
    private LocalDateTime fechaInicio;


    @Column(nullable = false)

    private LocalDateTime fechaFin;


    @OneToMany(mappedBy = "planAccion")
    @ToString.Exclude
    private List<Meta> metas;

    @ManyToMany(mappedBy="planAcciones")
    private List<Usuario> usuarios;

}
