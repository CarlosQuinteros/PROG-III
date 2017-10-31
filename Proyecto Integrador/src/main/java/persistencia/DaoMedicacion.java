package persistencia;


import javax.persistence.*;
import modelo.*;
import java.util.List;

public class DaoMedicacion {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoMedicacion()
	{
		
	}
	
	public Boolean persistirMedicacion(Medicacion pMedicacion)
	{
		try {
			em.getTransaction().begin();
			em.persist(pMedicacion);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarMedicacion(Medicacion pMedicacion)
	{
		try {
			em.getTransaction().begin();
			em.merge(pMedicacion);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public Boolean eliminarMedicacion(Medicacion pMedicacion)
	{
		try {
			em.getTransaction().begin();
			em.remove(pMedicacion);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	
	public Medicacion obtenerUnicaMedicacion(long pIdMedicacion)
	{
		return em.find(Medicacion.class, pIdMedicacion);
	
	}
	
	public List<Medicacion> obtenerTodasLasMedicaciones()
	{
		return em.createQuery("SELECT m FROM Medicacion m", Medicacion.class).getResultList();
	}
	
	public List<Medicacion> obtenerMedicacionesPorMedicamento(Medicamento pMedicamento)
	{
		return em.createQuery("SELECT m FROM Medicacion m WHERE m.medicamento_idmedicamento = "+pMedicamento.getIdMedicamento(), Medicacion.class).getResultList();
	}
}
