package persistencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import modelo.*;

public class DaoPaciente {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoPaciente()
	{
		
	}
	
	public Boolean persistirPaciente(Paciente pPaciente)
	{
		try {
			em.getTransaction().begin();
			em.persist(pPaciente);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarPaciente(Paciente pPaciente)
	{
		try {
			em.getTransaction().begin();
			em.merge(pPaciente);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean eliminarPaciente(Paciente pPaciente)
	{
		try {
			em.getTransaction().begin();
			em.remove(pPaciente);
			em.getTransaction().commit();
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Paciente obtenerUnicoPaciente(long pIdPaciente)
	{
		return em.find(Paciente.class, pIdPaciente);
	}
	
	public List<Paciente> obtenerTodosLosPacientes()
	{
		return em.createQuery("SELECT p FROM Paciente p", Paciente.class).getResultList();
	}
	
	public List<Paciente> obtenerPacientesPorAlias(String pAlias)
	{
		return em.createQuery("SELECT p FROM Paciente p WHERE p.alias LIKE "+ "'%"+pAlias+"%'",Paciente.class).getResultList();
	}
	
	public List<Paciente> obtenerPacientesPorRaza(Raza pRaza)
	{
		return em.createQuery("SELECT p FROM Paciente p WHERE p.raza_id ="+pRaza.getIdRaza(), Paciente.class).getResultList();
	}
	
	public List<VacunaColocada> obtenerMisVacunasPorPaciente(Paciente pPaciente)
	{
		return pPaciente.getVacunas();
	}
	
	public List<Visita> obtenerMisVisitasPorPaciente(Paciente pPaciente)
	{
		return pPaciente.getVisitas();
	}
	
	public List<Paciente> obtenerPacientesPorColorDePelo(String pColor)
	{
		return em.createQuery("SELECT p FROM Paciente p WHERE p.colorpelo LIKE "+ "'%"+pColor+"%'",Paciente.class).getResultList();

	}
	
	public List<Paciente> obtenerPacientesMayoresDeXAños(int pCantidadDeAños)
	{
		List<Paciente> pacientes = obtenerTodosLosPacientes();
		ArrayList<Paciente> resultado= new ArrayList<Paciente>();
		for (Paciente paciente : pacientes) {
			if((LocalDate.now().getYear() -  paciente.getFechaNacimiento().getYear()) > pCantidadDeAños)
			{
				resultado.add(paciente);
			}
		}
		return resultado;
	}
		

}
