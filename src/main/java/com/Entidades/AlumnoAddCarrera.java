
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
@Table(name = "AlumnoAddCarrera")
public class AlumnoAddCarrera implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idAlumnoAdd")        
    private int idAlumnoAdd;
    
    @ManyToOne
    @JoinColumn(name="IdAlumnoPreU")
    @org.hibernate.annotations.ForeignKey(name = "FK_AlumnoPreu_id")
    private AlumnoPreU alumnopreu;
    
    @ManyToOne
    @JoinColumn(name="idCarrera")
    @org.hibernate.annotations.ForeignKey(name = "FK_Carrera_id")
    private Carreras carreras;
    
    
    public int getIdAlumnoAdd() {
        return idAlumnoAdd;
    }

    public void setIdAlumnoAdd(int idAlumnoAdd) {
        this.idAlumnoAdd = idAlumnoAdd;
    }

    public AlumnoPreU getAlumnopreu() {
        return alumnopreu;
    }

    public void setAlumnopreu(AlumnoPreU alumnopreu) {
        this.alumnopreu = alumnopreu;
    }

    public Carreras getCarreras() {
        return carreras;
    }

    public void setCarreras(Carreras carreras) {
        this.carreras = carreras;
    }
  
    
    
    
}
