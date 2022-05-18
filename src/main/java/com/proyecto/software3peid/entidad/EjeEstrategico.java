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
@Table(name = "eje_estrategico")
public class EjeEstrategico implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;

    @Column(nullable = false, length = 100)
    private String nombre;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "id_ejeEstrategico")
    @ToString.Exclude
    private List<ObjetivoEstrategico> EjeEstrategicoObjetivosEstrategicos;



}
