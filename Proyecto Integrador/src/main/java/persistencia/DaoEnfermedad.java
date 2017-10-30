package persistencia;

import java.util.List;

import javax.persistence.*;
import modelo.*;

public class DaoEnfermedad {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoEnfermedad() {
		
	}
	
	public Boolean persistirEnfermedad(Enfermedad pEnfermedad)
	{
		try {
			em.getTransaction().begin();
			em.persist(pEnfermedad);
			em.getTransaction().commit();
			return true;
			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarEnfermedad (Enfermedad pEnfermedad)
	{
		try {
			
			em.getTransaction().begin();
			em.merge(pEnfermedad);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean eliminarEnfermedad (Enfermedad pEnfermedad)
	{
		try {
			
			em.getTransaction().begin();
			em.remove(pEnfermedad);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Enfermedad obtenerUnicaEnfermedad(long idEnfermedad)
	{
		return em.find(Enfermedad.class, idEnfermedad);
	}
	
	public List<Enfermedad> obtenerTodasLasEnfermedades()
	{
		TypedQuery<Enfermedad> consulta = em.createQuery("SELECT e FROM Enfermedad e", Enfermedad.class);
		return consulta.getResultList();
	}
	
	public List<Enfermedad> obtenerEnfermedadPorNombre(String pNombre)
	{
		TypedQuery<Enfermedad> consulta = em.createQuery("SELECT e FROM Enfermedad e WHERE e.nombre LIKE " + "'%"+pNombre+"%'", Enfermedad.class);
		return consulta.getResultList();
	}
}
