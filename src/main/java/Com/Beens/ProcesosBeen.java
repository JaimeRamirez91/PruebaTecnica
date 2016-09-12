
package Com.Beens;
import java.io.Serializable;
//import Listas
import com.Dao.ProcesosDao;
import com.Entidades.AlumnoAddCarrera;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "ProcesosBeen")
@ViewScoped
public class ProcesosBeen implements Serializable{
    private ProcesosDao  pDao;
    private List<AlumnoAddCarrera> listaalumnoadd;
    public ProcesosBeen() {
    }

    public ProcesosDao getpDao() {
        return pDao;
    }

    public void setpDao(ProcesosDao pDao) {
        this.pDao = pDao;
    }

    public List<AlumnoAddCarrera> getListaalumnoadd() {
        pDao = new ProcesosDao();
        listaalumnoadd = pDao.Lista();
        return listaalumnoadd;
    }

    public void setListaalumnoadd(List<AlumnoAddCarrera> listaalumnoadd) {
        this.listaalumnoadd = listaalumnoadd;
    }
    
    
}
