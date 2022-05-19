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
@Table(name = "meta")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Meta implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;


    @Column(nullable = false, length = 100)
    private String nombre;


    @Column(nullable = false, length = 5)
    private LocalDateTime año;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "proyecto_id")
    private Proyecto proyecto;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "planaccion_id")
    private PlanAccion PlanesAccion;


}
