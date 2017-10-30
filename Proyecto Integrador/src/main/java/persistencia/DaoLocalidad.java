package persistencia;

import modelo.*;

import java.util.List;

import javax.persistence.*;

public class DaoLocalidad {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoLocalidad()
	{
		
	}
	
	public Boolean persistirLocalidad(Localidad pLocalidad)
	{
		try {
			
			em.getTransaction().begin();
			em.persist(pLocalidad);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarLocalidad(Localidad pLocalidad)
	{
		try {
			em.getTransaction().begin();
			em.merge(pLocalidad);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean eliminarLocalidad (Localidad pLocalidad)
	{
		try {
			em.getTransaction().begin();
			em.remove(pLocalidad);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Localidad obtenerUnicaLocalidad(long idLocalidad)
	{
		return em.find(Localidad.class, idLocalidad);
	}
	
	public List<Localidad> obtenerTodasLasLocalidades()
	{
		TypedQuery<Localidad> consulta = em.createQuery("SELECT l FROM Localidad l", Localidad.class);
		return consulta.getResultList();
	}
	
	public List<Localidad> obtenerLocalidadesPorNombre(String pNombre)
	{
		TypedQuery<Localidad> consulta = em.createQuery("SELECT l FROM Localidad l WHERE l.nombre LIKE "+ "%"+pNombre+"%", Localidad.class);
		return consulta.getResultList();
	}
	
	public List<Domicilio> obtenerMisDomicilios (Localidad pLocalidad)
	{
		TypedQuery<Domicilio> consulta = em.createQuery("SELECT d FROM Direccion d WHERE d.localidad.idlocalidad ="+pLocalidad.getIdLocalidad(),Domicilio.class);
		return consulta.getResultList();
		
	}
		
}
