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
@Table(name = "eje_estrategico")
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class EjeEstrategico implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    private Integer codigo;

    private String nombre;

    @ManyToOne
    @ToString.Exclude
    private Usuario usuario;


    @OneToMany(mappedBy = "ejeEstrategico")
    @ToString.Exclude
    private List<ObjetivoEstrategico> objetivoEstrategicos;


}
