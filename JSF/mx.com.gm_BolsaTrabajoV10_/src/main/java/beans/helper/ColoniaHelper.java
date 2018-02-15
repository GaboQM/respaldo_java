package beans.helper;


import domail.entity.Colonia;
import javax.ejb.EJB;
import servicio.ejb.ColoniaFacade;
//import beans.domain.Colonia;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;

@RequestScoped
@Named

public class ColoniaHelper {
    @EJB
    ColoniaFacade coloniaFacade;
    
   public List<Colonia> getColonias() {
        List<Colonia> colonias = coloniaFacade.findAll();
       // log.info("Recuperamos el listado de personas del EJB");
        return colonias;
    }


    public long getColoniaIdPorNombre(String nombreColonia) {
        long coloniaId = 0;
        List<Colonia> colonias = getColonias();//Lista de colonias
        for (Colonia colonia : colonias) {
            if (colonia.getNombreColonia().equals(nombreColonia)) {
                coloniaId = colonia.getColoniaId();
                break;
            }
        }
        return coloniaId;
    }

    public long getColoniaIdPorCP(long codigoPostal) {
        long coloniaId = 0;
        List<Colonia> colonias = getColonias();
        for (Colonia colonia : colonias) {
            if (colonia.getCodigoPostal() == codigoPostal) {
                coloniaId = colonia.getColoniaId();
                break;
            }
        }
        return coloniaId;
    }

    public List<SelectItem> getSelectItems() {
        List<SelectItem> selectItems;
        selectItems = new ArrayList<>();
        List<Colonia> colonias = getColonias();
        for (Colonia colonia : colonias) {
            SelectItem selectItem = new SelectItem(colonia.getColoniaId(),
                    colonia.getNombreColonia());
            selectItems.add(selectItem);
        }
        return selectItems;
    }
}