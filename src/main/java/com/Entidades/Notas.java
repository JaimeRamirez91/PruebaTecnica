
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
@Table(name = "Notas")
public class Notas implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idNotas")        
    private Integer idNotas;
    
    @Column (name = "Nota1")
    private Integer Nota1;
    
    @Column (name = " Nota2")
    private Integer Nota2;
    
    @Column (name = "promedio")
    private int promedio;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AlumnoPreU estudiante;

    public Integer getIdNotas() {
        return idNotas;
    }

    public void setIdNotas(Integer idNotas) {
        this.idNotas = idNotas;
    }

    public Integer getNota1() {
        return Nota1;
    }

    public void setNota1(Integer Nota1) {
        this.Nota1 = Nota1;
    }

    public Integer getNota2() {
        return Nota2;
    }

    public void setNota2(Integer Nota2) {
        this.Nota2 = Nota2;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public AlumnoPreU getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(AlumnoPreU estudiante) {
        this.estudiante = estudiante;
    }
    
}
