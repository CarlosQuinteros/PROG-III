package persistencia;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import modelo.*;

public class DaoCliente {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("veterinaria");
	EntityManager em = emf.createEntityManager();
	
	public DaoCliente()
	{
		
	}
	
	public Boolean persistirCliente(Cliente pCliente)
	{
		try {
			em.getTransaction().begin();
			em.persist(pCliente);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean modificarCliente(Cliente pCliente)
	{
		try {
			em.getTransaction().begin();
			em.merge(pCliente);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Boolean eliminarCliente(Cliente pCliente)
	{
		try {
			em.getTransaction().begin();
			em.remove(pCliente);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Cliente obtenerUnicoCliente(long pIdCliente)
	{
		return em.find(Cliente.class, pIdCliente);
	}
	
	public List<Cliente> obtenerTodosLosClientes(){
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
	
	public List<Cliente> obtenerClientesPorApellidoFamilia(String pApellidoFamilia)
	{
		return em.createQuery("SELECT c FROM Cliente c WHERE c.apellidofamilia LIKE "+ "'%"+pApellidoFamilia+"%'",Cliente.class).getResultList();
	}
	
	public List<Paciente> obtenerPacientesPorCliente(Cliente pCliente)
	{
		return em.createQuery("SELECT p FROM Paciente p WHERE p.duenio_idcliente = "+pCliente.getIdCliente(), Paciente.class ).getResultList();
	}
	
	public List<Cliente> obtenerClientesPorLocalidad(Localidad pLocalidad)
	{
		List<Cliente> listaClientes = obtenerTodosLosClientes();
		ArrayList<Cliente> resultado = new ArrayList<Cliente>();
		
		for (Cliente cliente : listaClientes) {
			if(cliente.getDomicilio().getLocalidad().getIdLocalidad().equals(pLocalidad.getIdLocalidad()))
			{
				resultado.add(cliente);
			}
		}
		return resultado;
	}
	

}
