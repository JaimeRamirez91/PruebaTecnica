
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
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name = "AlumnoPreU")      
public class AlumnoPreU implements Serializable{
    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "IdAlumnoPreU") 
    private Integer IdAlumnoPreU;
    @Column (name = "Nombre") 
    private String Nombre;
    @Column (name = "FechaInscripcion") 
    private String FechaInscripcion;
    
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Notas notas;
    
   @OneToMany(mappedBy = "alumnopreu", cascade = CascadeType.ALL)
    private Set<AlumnoAddCarrera> alumnoadcarrera = new HashSet<AlumnoAddCarrera>(0);

    public Integer getIdAlumnoPreU() {
        return IdAlumnoPreU;
    }

    public void setIdAlumnoPreU(Integer IdAlumnoPreU) {
        this.IdAlumnoPreU = IdAlumnoPreU;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaInscripcion() {
        return FechaInscripcion;
    }

    public void setFechaInscripcion(String FechaInscripcion) {
        this.FechaInscripcion = FechaInscripcion;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public Set<AlumnoAddCarrera> getAlumnoadcarrera() {
        return alumnoadcarrera;
    }

    public void setAlumnoadcarrera(Set<AlumnoAddCarrera> alumnoadcarrera) {
        this.alumnoadcarrera = alumnoadcarrera;
    }
    
    
}
