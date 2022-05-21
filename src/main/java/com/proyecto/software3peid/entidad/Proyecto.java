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
public class Proyecto implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;

    private String nombre;

    private Integer cantidad;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(nullable = false)
    private ObjetivoEstrategico objetivoEstrategico;


    @OneToMany(mappedBy = "proyecto")
    @ToString.Exclude
    private List<Meta> metas;


}
