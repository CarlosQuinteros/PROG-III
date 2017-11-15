package controller;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import persistencia.EspecieFacade;
import modelo.*;

@ManagedBean (name = "especieController")
@SessionScoped
public class EspecieController {
	
	@EJB
	private EspecieFacade ejFacade;
	private Especie current;
	
	public EspecieController()
	{
		
	}
	
	public Especie getCurrent()
	{
		if(current==null)
		{
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
	
	
	public void crearEspecie()
	{
		try {
			if(ejFacade.existeEspecieNombre(current.getNombre()))
			{
				getEjFacade().create(current);
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Especie creada correctamente ",current.getNombre() ));
				current = new Especie();
			}
			else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Especie no creada ","Ya existe la especie " + current.getNombre() ));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Especie no creada correctamente ","Ocurrió un problema al cargar la especie!" ));
		}
	}

}
