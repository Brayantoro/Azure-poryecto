package com.proyecto.software3peid.entidad;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
public class Meta implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;


    @Column(nullable = false, length = 100)
    private String nombre;

    private Integer cantidad;

    private LocalDateTime año;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(nullable = false)
    private Proyecto proyecto;


    @ManyToOne
    @ToString.Exclude
    @JoinColumn(nullable = false)
    private PlanAccion planAccion;





}
