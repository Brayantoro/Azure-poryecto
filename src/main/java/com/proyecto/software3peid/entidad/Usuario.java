package com.proyecto.software3peid.entidad;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Table(name="usuario")
public class Usuario {

    @Id
    @Column(name="CODIGO")
    private Integer codigo;

    @Column(name="NOMBRE")
    private String nombre;

    @Column(name="EMAIL")
    private String email;

    @Column(name="PASSWORD")
    private String password;


    @OneToMany(mappedBy = "usuario")
    @ToString.Exclude
    private List<EjeEstrategico> usuarioEjesEstrategicos;

    @ManyToMany(cascade = CascadeType.ALL)
    @ToString.Exclude
    @JoinColumn(nullable = false)
    private List<PlanAccion> Planaccion;



    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
