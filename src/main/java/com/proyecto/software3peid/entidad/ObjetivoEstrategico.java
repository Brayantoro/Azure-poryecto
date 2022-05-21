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
public class ObjetivoEstrategico implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;



    private String nombre;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(nullable = false)
    private EjeEstrategico ejeEstrategico;

    @OneToMany(mappedBy = "objetivoEstrategico")
    @ToString.Exclude
    private List<Proyecto> proyectos;





}
