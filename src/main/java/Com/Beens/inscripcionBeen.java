/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.Beens;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import com.Entidades.Carreras;
import com.Entidades.Estudiante;
import com.Entidades.Notas;
import java.io.Serializable;

//import Listas
import com.Dao.inscripcionDao;
import java.util.List;

@ManagedBean(name = "inscripcionbeen")
@ViewScoped
public class inscripcionBeen implements Serializable{
    
  private Carreras carrera ;
  private  Estudiante estudiante;
  private   Notas notas;
  // instancia de inscripcionDao
  private inscripcionDao iDao;
  private List<Estudiante> listaEstudiante;

    public List<Estudiante> getListaEstudiante() {
        iDao = new inscripcionDao();
        listaEstudiante = iDao.listaEstudiante();
        return listaEstudiante;
    }

    public void setListaEstudiante(List<Estudiante> listaEstudiante) {
        this.listaEstudiante = listaEstudiante;
    }
    
    public inscripcionBeen() {
       // nuevo();
    }
    public void nuevo(){
        this.carrera = new Carreras();
        this.estudiante = new Estudiante();
        this.notas = new Notas();
    }
    public Carreras getCarrera() {
        return carrera;
    }

    public void setCarrera(Carreras carrera) {
        this.carrera = carrera;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

   
}
