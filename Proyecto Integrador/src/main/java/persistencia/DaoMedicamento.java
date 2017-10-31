package persistencia;

import java.util.List;

import javax.persistence.*;
import modelo.*;
public class DaoMedicamento {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoMedicamento() {
		
	}
	
	public Boolean persisitrMedicamento(Medicamento pMedicamento)
	{
		try {
			em.getTransaction().begin();
			em.persist(pMedicamento);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarMedicamento(Medicamento pMedicamento)
	{
		try {
			
			em.getTransaction().begin();
			em.merge(pMedicamento);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean eliminarMedicamento(Medicamento pMedicamento)
	{
		try {
			em.getTransaction().begin();
			em.remove(pMedicamento);
			em.getTransaction().commit();
			return true;			
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Medicamento obtenerUnicoMedicamento(long pIdMedicamento)
	{
		return em.find(Medicamento.class, pIdMedicamento);
	}
	
	public Medicamento obtenerMedicamentoPorCodigo(String pCodigo)
	{
		return em.createQuery("SELECT m FROM Medicamento m WHERE m.codigo =" +"'"+pCodigo+"'", Medicamento.class).getSingleResult();
	}
	
	public List<Medicamento> obtenerTodosLosMedicamentos()
	{
		return em.createQuery("SELECT m FROM Medicamento m", Medicamento.class).getResultList();
	}
	
	public List<Medicamento> obtenerMedicamentosPorNombre(String pNombre)
	{
		return em.createQuery("SELECT m FROM Medicamento m WHERE m.nombre LIKE "+"'%"+pNombre+"%'", Medicamento.class).getResultList();
	}

}
