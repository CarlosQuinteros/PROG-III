package persistencia;

import modelo.*;
import javax.persistence.*;
import java.util.List;

public class DaoDomicilio {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoDomicilio()
	{
		
	}
	
	public Boolean persistirDomicilio(Domicilio pDomicilio)
	{
		try {
			em.getTransaction().begin();
			em.persist(pDomicilio);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarDomicilio(Domicilio pDomicilio)
	{
		try {
			em.getTransaction().begin();
			em.merge(pDomicilio);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}		
	}
	
	public Boolean eliminarDomicilio(Domicilio pDomicilio)
	{
		try {
			em.getTransaction().begin();
			em.remove(pDomicilio);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}		
	}
	
	public Domicilio obtenerUnicoDomicilio(long pIdDomicilio)
	{
		return em.find(Domicilio.class, pIdDomicilio);
	}
	
	public List<Domicilio> obtenerTodosLosDomicilios ()
	{
		return em.createQuery("SELECT d FROM Domicilio d", Domicilio.class).getResultList();
	}
	
	public List<Domicilio> obtenerDomiciliosPorCalleODepartamento(String pCalleDepto)
	{
		return em.createQuery("SELECT d FROM Domicilio d WHERE calle LIKE "+ "'%"+pCalleDepto+"%'" + " OR depto LIKE " + "'%"+pCalleDepto+"%'" , Domicilio.class).getResultList();
	}

	public List<Domicilio> obtenerDomiciliosPorLocalidad(Localidad pLocalidad)
	{
		return em.createQuery("SELECT d FROM Domicilio d WHERE d.localidad_idlocalidad ="+pLocalidad.getIdLocalidad(),Domicilio.class).getResultList();
	}

}
