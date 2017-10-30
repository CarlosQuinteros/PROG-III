package persistencia;
import modelo.*;
import javax.persistence.*;
import java.util.List;

public class DaoMotivo {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoMotivo()
	{
		
	}
	
	public Boolean persistirMotivoVisita(MotivoVisita pMotivo)
	{
		try {
			em.getTransaction().begin();
			em.persist(pMotivo);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarMotivoVisita(MotivoVisita pMotivo)
	{
		try {
			em.getTransaction().begin();
			em.merge(pMotivo);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean eliminarMotivoVisita(MotivoVisita pMotivo)
	{
		try {
			em.getTransaction().begin();
			em.remove(pMotivo);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}		
	}
	
	public MotivoVisita obtenerUnicoMotivoVisita(long idMotivo)
	{
		return em.find(MotivoVisita.class, idMotivo);
	}
	
	public List<MotivoVisita> obtenerTodosLosMotivos()
	{
		return em.createQuery("SELECT m FROM MotivoVisita m", MotivoVisita.class).getResultList();
	}
	
	public List<Visita> obtenerVisitasPorMotivo(MotivoVisita pMotivo)
	{
		return em.createQuery("SELECT v FROM Visita v WHERE v.MotivoVisita.idMotivoVisita ="+ pMotivo.getIdMotivoVisita(), Visita.class).getResultList();
	}
	
	public List<MotivoVisita> obtenerMotivosPorDescripcion(String pDescripcion)
	{
		return em.createQuery("SELECT m FROM MotivoVisita m WHERE descripcion LIKE "+ "%"+pDescripcion+"%",MotivoVisita.class).getResultList();
	}

}
