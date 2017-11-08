package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
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
	
	
	public String crearEspecie()
	{
		try {
			if(ejFacade.existeEspecieNombre(current.getNombre()))
			{
				getEjFacade().create(current);
				return "Especie creada correctamente";
			}
			else {
				return "Especie no creada correctamente";
			}
		} catch (Exception e) {
			// TODO: handle exception
			return "Especie no creada correctamente";
		}
	}

}
