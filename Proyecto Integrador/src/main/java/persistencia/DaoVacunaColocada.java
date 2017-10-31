package persistencia;

import javax.persistence.*;
import modelo.*;

import java.util.List;

public class DaoVacunaColocada {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
			
	
	public DaoVacunaColocada()
	{
		
	}
	
	public  Boolean persistirVacunaColocada(VacunaColocada pVacuna)
	{
		try {
			em.getTransaction().begin();
			em.persist(pVacuna);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarVacunaColocada(VacunaColocada pVacuna)
	{
		try {
			em.getTransaction().begin();
			em.merge(pVacuna);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}		
	}
	
	public Boolean eliminarVacunaColocada(VacunaColocada pVacuna)
	{
		try {
			em.getTransaction().begin();
			em.remove(pVacuna);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}		
	}
	
	public VacunaColocada obtenerUnicaVacunaColocada(long pIdVacunaColocada)
	{
		return em.find(VacunaColocada.class, pIdVacunaColocada);
	}
	
	public List<VacunaColocada> obtenerTodasLasVacunasColocadas()
	{
		return em.createQuery("SELECT v FROM vacunacolocada v", VacunaColocada.class).getResultList();
	}
	
}
