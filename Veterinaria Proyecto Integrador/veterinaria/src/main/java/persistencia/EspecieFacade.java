package persistencia;

import modelo.*;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EspecieFacade extends AbstractFacade<Especie> {

    @PersistenceContext(unitName= "puveterinaria")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EspecieFacade() {
        super(Especie.class);
    }
    
	public List<Raza> obtenerMisRazas(Especie pEspecie)
	{
			return em.createQuery("SELECT r FROM Raza r WHERE r.especie_idespecie ="+pEspecie.getIdEspecie(), Raza.class).getResultList();
		
	}
	
	public List<Especie> obtenerEspeciesPorNombre(String pNombre)
	{
		return em.createQuery("SELECT e FROM Especie e WHERE e.nombre LIKE " + "'%"+pNombre+"%'",Especie.class).getResultList();
	}
	
	public Boolean existeEspecieNombre(String pNombre)
	{
		if(em.createQuery("SELECT e FROM Especie e WHERE e.nombre="+pNombre, Especie.class).getResultList()==null)
		{
			return false;
		}
		else {
			return true;
		}
	}
    
}