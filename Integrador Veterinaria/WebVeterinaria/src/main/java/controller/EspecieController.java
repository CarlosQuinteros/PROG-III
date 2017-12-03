package controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import persistencia.EspecieFacade;
import modelo.*;
import org.primefaces.context.RequestContext;

@ManagedBean(name = "especieController")
@ViewScoped
public class EspecieController implements Serializable{

    @EJB
    private EspecieFacade ejFacade;
    private Especie current;
    private Especie selectedEspecie;

    public EspecieController() {

    }

    public Especie getCurrent() {
        if (current == null) {
            current = new Especie();
        }
        return current;

    }

    public EspecieFacade getEjFacade() {
        return ejFacade;
    }

    public void setCurrent(Especie current) {
        this.current = current;
    }
    
    public void setSelectedEspecie(Especie e)
    {
        this.selectedEspecie=e;
    }
    
    public Especie getSelectedEspecie()
    {
        return this.selectedEspecie;
    }

    public void crearEspecie() {
        try {
            current.setNombre(current.getNombre().toUpperCase());
            if (!ejFacade.existeEspecieNombre(current.getNombre())) {
                getEjFacade().create(current);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Especie creada correctamente ", current.getNombre()));
                current = new Especie();

            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Especie no creada ", "Ya existe la especie " + current.getNombre()));

            }
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Especie no creada correctamente ", "Ocurrio un problema al cargar la especie!"));
        }
    }
    public void eliminarEspecie()
    {
        try {
            getEjFacade().remove(this.selectedEspecie);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso ","Especie eliminada correctamente"));
            current= new Especie();
 
        } catch (Exception ex) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Aviso","Ocurrio un problema al eliminar la especie"));
            
        }
    }

}
