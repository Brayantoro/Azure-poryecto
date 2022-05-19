package com.proyecto.software3peid.entidad;

import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

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
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(name = "plan_accion")
public class PlanAccion implements Serializable {
    @Id
    @EqualsAndHashCode.Include
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


    @ManyToOne
    @ToString.Exclude
    @JoinColumn(nullable = false)
    private Meta meta;

    @ManyToMany(mappedBy = "Planaccion")
    @ToString.Exclude
    private List<Usuario> planAccionUsuarios;

}
