/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Entidades;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

@Entity
@Table(name = "Carreras")
public class Carreras {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idCarrera")        
    private int idCarrera;
    @Column (name = "Nombre") 
    private String Nombre;
    @Column (name = "Codigo") 
    private String Codigo;
    @Column (name = "Cupo") 
    private String cupo;
    
    @OneToMany(mappedBy = "carreras", cascade = CascadeType.ALL)
    private Set<AlumnoAddCarrera> alumnoadcarrera = new HashSet<AlumnoAddCarrera>(0);
    
     @OneToMany(mappedBy = "carreras", cascade = CascadeType.ALL)
     private Set<CarrerasOpc> carreraopc = new HashSet<CarrerasOpc>(0);
     
     @OneToMany(mappedBy = "carreras", cascade = CascadeType.ALL)
     private Set<CarrerasOpc> carreraopc2 = new HashSet<CarrerasOpc>(0);
     
     @OneToMany(mappedBy = "carreras", cascade = CascadeType.ALL)
     private Set<CarrerasOpc> carreraopc3 = new HashSet<CarrerasOpc>(0);
    
    
    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getCupo() {
        return cupo;
    }

    public void setCupo(String cupo) {
        this.cupo = cupo;
    }

    public Set<AlumnoAddCarrera> getAlumnoadcarrera() {
        return alumnoadcarrera;
    }

    public void setAlumnoadcarrera(Set<AlumnoAddCarrera> alumnoadcarrera) {
        this.alumnoadcarrera = alumnoadcarrera;
    }

    public Set<CarrerasOpc> getCarreraopc() {
        return carreraopc;
    }

    public void setCarreraopc(Set<CarrerasOpc> carreraopc) {
        this.carreraopc = carreraopc;
    }

    public Set<CarrerasOpc> getCarreraopc2() {
        return carreraopc2;
    }

    public void setCarreraopc2(Set<CarrerasOpc> carreraopc2) {
        this.carreraopc2 = carreraopc2;
    }

    
}
