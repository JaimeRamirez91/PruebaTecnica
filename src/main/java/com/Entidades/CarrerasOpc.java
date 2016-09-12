
package com.Entidades;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "CarrerasOpc")
public class CarrerasOpc implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "IdPcarreras") 
    private Integer IdPcarreras;
    @Column (name = "NvPc1") 
    private Integer NvPc1;
    @Column (name = "NvPc2") 
    private Integer NvPc2;
    @Column (name = "NvPc3") 
    private Integer NvPc3;
    
    @ManyToOne
    @JoinColumn(name="carrera1")
    @org.hibernate.annotations.ForeignKey(name = "FK_Carrera_id")
    private Carreras carreras;
    
    @ManyToOne
    @JoinColumn(name="carreras2")
    @org.hibernate.annotations.ForeignKey(name = "FK_Carrera2_id")
    private Carreras carreras2;
    
    @ManyToOne
    @JoinColumn(name="carreras3")
    @org.hibernate.annotations.ForeignKey(name = "FK_Carrera3_id")
    private Carreras carreras3;

   

    public Integer getIdPcarreras() {
        return IdPcarreras;
    }

    public void setIdPcarreras(Integer IdPcarreras) {
        this.IdPcarreras = IdPcarreras;
    }

    public Integer getNvPc1() {
        return NvPc1;
    }

    public void setNvPc1(Integer NvPc1) {
        this.NvPc1 = NvPc1;
    }

    public Integer getNvPc2() {
        return NvPc2;
    }

    public void setNvPc2(Integer NvPc2) {
        this.NvPc2 = NvPc2;
    }

    public Integer getNvPc3() {
        return NvPc3;
    }

    public void setNvPc3(Integer NvPc3) {
        this.NvPc3 = NvPc3;
    }

    public Carreras getCarreras() {
        return carreras;
    }

    public void setCarreras(Carreras carreras) {
        this.carreras = carreras;
    }

    public Carreras getCarreras2() {
        return carreras2;
    }

    public void setCarreras2(Carreras carreras2) {
        this.carreras2 = carreras2;
    }

    public Carreras getCarreras3() {
        return carreras3;
    }

    public void setCarreras3(Carreras carreras3) {
        this.carreras3 = carreras3;
    }

  
}
