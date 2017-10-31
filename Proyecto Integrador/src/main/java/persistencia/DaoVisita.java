package persistencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import modelo.*;

public class DaoVisita {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoVisita ()
	{
		
	}
	
	public Boolean persistirVisita(Visita pVisita)
	{
		try {
			em.getTransaction().begin();
			em.persist(pVisita);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarVisita(Visita pVisita)
	{
		try {
			em.getTransaction().begin();
			em.merge(pVisita);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
	public Boolean eliminarVisita(Visita pVisita)
	{
		try {
			em.getTransaction().begin();
			em.remove(pVisita);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Visita obtenerUnicaVisita(long pIdVisita)
	{
		return em.find(Visita.class, pIdVisita);
	}
	
	public List<Visita> obtenerTodasLasVisitas()
	{
		return em.createQuery("SELECT v FROM Visita v", Visita.class).getResultList();
	}
	
	public List<Visita> obtenerVisitasPorMotivo (MotivoVisita pMotivo)
	{
		return em.createQuery("SELECT v FROM Visita v WHERE p.motivovisita_idmotivovisita ="+pMotivo.getIdMotivoVisita(), Visita.class).getResultList();
	}
	
	public List<Visita> obtenerVisitasPorLocalidad(Localidad pLocalidad)
	{
		List<Paciente> listadoPacientes = em.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList();
		ArrayList<Visita> visitasPorLocalidad = new ArrayList<Visita>();
		for (Paciente p : listadoPacientes) {
			if(p.getDuenio().getDomicilio().getLocalidad().getIdLocalidad().equals(pLocalidad.getIdLocalidad()))
			{
				visitasPorLocalidad.addAll(p.getVisitas());
			}
		}
		return visitasPorLocalidad;
	}
	
	public List<Visita> obtenerVisitasDelDia()
	{
		List<Visita> listadoVisitas = obtenerTodasLasVisitas();
		ArrayList<Visita> resultado = new ArrayList<Visita>();
		for (Visita visita : listadoVisitas) {
			if(visita.getFechaVisita().equals(LocalDate.now())) resultado.add(visita);
		}
		return resultado;
	}
}
