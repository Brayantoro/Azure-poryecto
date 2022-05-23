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
    private Integer codigo;

    private String nombre;

    private String email;

    private String password;


    @OneToMany(mappedBy = "usuario")
    @ToString.Exclude
    private List<EjeEstrategico> usuarioEjesEstrategicos;


    @ManyToMany
    private List<PlanAccion> planAcciones;

    public Usuario(String nombre, String password) {
    }


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
