package persistencia;

import java.util.List;

import javax.persistence.*;
import modelo.*;

public class DaoRaza {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoRaza() {
		
	}
	
	public Boolean persistirRaza(Raza pRaza) {
		try {
			em.getTransaction().begin();
			em.persist(pRaza);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean eliminarRaza(Raza pRaza)
	{
		try 
		{
			em.getTransaction().begin();
			em.remove(pRaza);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarRaza(Raza pRaza)
	{
		try {
			em.getTransaction().begin();
			em.merge(pRaza);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Raza obtenerUnicaRaza(long idRaza) 
	{
		Raza pRaza = em.find(Raza.class, idRaza);
		return pRaza;
	}
	
	public List<Raza> obtenerTodasLasRazas()
	{
		TypedQuery<Raza> consulta = em.createQuery("SELECT r FROM Raza r", Raza.class);
		return consulta.getResultList();
	}
	
	public List<Raza> obtenerRazasPorNombre(String pNombre)
	{
		return em.createQuery("SELECT r FROM Raza r WHERE r.nombre LIKE "+ "'%"+pNombre+"%'",Raza.class).getResultList();

	}
	

}
