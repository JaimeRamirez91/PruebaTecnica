
package com.Entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name = "ESTUDIANTE")

public class Estudiante implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idEstudiante")        
    private int idEstudiante;
    
    @Column(name = "nombreEstudiante") 
    private String nombreEstudiante;
    
   // @Column(name = "NumCelular") 
   // private  String NumCelular;
    
    //bidireccional 
    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Notas notas;

    public Estudiante() {
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
/*
    public String getNumCelular() {
        return NumCelular;
    }

    public void setNumCelular(String NumCelular) {
        this.NumCelular = NumCelular;
    }
*/
    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }
      
    
}
