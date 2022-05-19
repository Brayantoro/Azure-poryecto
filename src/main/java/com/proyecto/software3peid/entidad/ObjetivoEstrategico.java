package com.proyecto.software3peid.entidad;

import lombok.*;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@ToString
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(name = "objetivo_estrategico")
public class ObjetivoEstrategico implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;


    @Column(nullable = false, length = 500)
    private String nombre;

    @ManyToOne
    @ToString.Exclude
    @JoinColumn(name = "ejeEstrategico")
    private EjeEstrategico id_ejeEstrategico;

    @OneToMany(mappedBy = "objetivoEstrategico")
    @ToString.Exclude
    private List<Proyecto> objetivoEstrategicoProyectos;
}
