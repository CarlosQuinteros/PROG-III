package persistencia;

import javax.persistence.*;
import modelo.*;
import java.util.List;

public class DaoEnfermedadPaciente {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoEnfermedadPaciente()
	{
		
	}
	
	public Boolean persistirEnfermedadPaciente(EnfermedadPaciente pEnfermedadPaciente)
	{
		try {
			em.getTransaction().begin();
			em.persist(pEnfermedadPaciente);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarEnfermedadPaciente(EnfermedadPaciente pEnfermedadPaciente)
	{
		try {
			em.getTransaction().begin();
			em.merge(pEnfermedadPaciente);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean eliminarEnferemdadPaciente(EnfermedadPaciente pEnfermedadPaciente)
	{
		try {
			em.getTransaction().begin();
			em.remove(pEnfermedadPaciente);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public EnfermedadPaciente obtenerUnicaEnfermedadPaciente(long pIdEnfermedadPaciente)
	{
		return em.find(EnfermedadPaciente.class, pIdEnfermedadPaciente);
	}
	
	public List<EnfermedadPaciente> obtenerTodasLasEnfermedadesPaciente()
	{
		return em.createQuery("SELECT e FROM enfermedadpaciente e", EnfermedadPaciente.class).getResultList();
	}
}
