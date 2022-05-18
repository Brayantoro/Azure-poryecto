package com.proyecto.software3peid.entidad;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
@Table(name = "proyecto")
public class Proyecto implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(nullable = false, length = 100)
    private String nombre;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "objetivoEstrategicos")
    private ObjetivoEstrategico objetivoEstrategico;

    @OneToMany(mappedBy = "proyecto")
    @ToString.Exclude
    private List<Meta> proyectoMetas;
}
