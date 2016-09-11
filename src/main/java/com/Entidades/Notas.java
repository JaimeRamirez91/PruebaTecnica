
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
@Table(name = "NOTAS")
public class Notas implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idNota")        
    private int idNota;
    
    @Column (name = "pruebaEstado")
    private int pruebaEstado;
    
    @Column (name = "ExamenUniversidad")
    private int ExamenUniversidad;
    
    @Column (name = "Notapromedio")
    private int Notapromedio;

    @OneToOne(cascade=CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Estudiante estudiante;
    
    public Notas() {
    }

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getPruebaEstado() {
        return pruebaEstado;
    }

    public void setPruebaEstado(int pruebaEstado) {
        this.pruebaEstado = pruebaEstado;
    }

    public int getExamenUniversidad() {
        return ExamenUniversidad;
    }

    public void setExamenUniversidad(int ExamenUniversidad) {
        this.ExamenUniversidad = ExamenUniversidad;
    }

    public int getNotapromedio() {
        return Notapromedio;
    }

    public void setNotapromedio(int Notapromedio) {
        this.Notapromedio = Notapromedio;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    
}
