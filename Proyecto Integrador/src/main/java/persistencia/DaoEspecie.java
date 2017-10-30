package persistencia;

import java.util.List;

import javax.persistence.*;
import modelo.*;

public class DaoEspecie {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	
	public  DaoEspecie() {
		
	}
	
	public Boolean persistirEspecie(Especie pEspecie )
	{
		try {
				em.getTransaction().begin();
				em.persist(pEspecie);
				em.getTransaction().commit();
				return true;
		}catch (Exception e) {
			// TODO: handle exception
			em.close();			
			return false;
		}
	}
	
	public Boolean eliminarEspecie(Especie pEspecie) {
		
		try {
			em.getTransaction().begin();
			em.remove(pEspecie);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			
			// TODO: handle exception
			em.close();
			return false;
			
		}
		
	}
	
	public Especie obtenerUnicaEspecie(long id) 
	{
		try {
			Especie pEspecie = new Especie();
			pEspecie = em.find(Especie.class, id);
			return pEspecie;
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public List<Especie> obtenerTodasLasEspecies()
	{
		try {
			
			TypedQuery<Especie> consulta = em.createQuery("SELECT c FROM Especie c", Especie.class);
			return consulta.getResultList();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public Boolean modificarEspecie(Especie pEspecie)
	{
		try {
			em.getTransaction().begin();
			em.merge(pEspecie);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	public List<Raza> obtenerMisRazas(Especie pEspecie)
	{
		
		try {
			TypedQuery<Raza> consulta = em.createQuery("SELECT r FROM Razas r WHERE r.especie.idespecie = " + pEspecie.getIdEspecie(), Raza.class);
			return consulta.getResultList();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}
	
	public List<Especie> obtenerEspeciesPorNombre(String pNombre)
	{
		return em.createQuery("SELECT e FROM Especie e WHERE e.nombre LIKE " + "%"+pNombre+"%",Especie.class).getResultList();
	}
	
}

