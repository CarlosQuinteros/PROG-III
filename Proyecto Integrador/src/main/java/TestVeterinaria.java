import java.time.LocalDate;
import java.util.List;
import modelo.*;
import facade.*;
public class TestVeterinaria {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FacadePersistencia persistencia = new FacadePersistencia();
 /*
		List<Raza> razas = persistencia.buscarTodasLasRazas();
		List<Especie> especies = persistencia.buscarTodasLasEspecies();
		Especie e = persistencia.buscarUnicaEspecie(40);
		System.out.println(e.getNombre());
		if(persistencia.buscarRazasPorEspecie(e)==null)
		{
			System.out.println("algo salio mal");
		}
		else {
			for (Raza r : persistencia.buscarRazasPorEspecie(e)) {
				System.out.println(r.getNombre());
			}
			
		}
		
		Raza r = new Raza("cocodrilo", e);
		persistencia.crearRaza(r);
		for (Raza ra : persistencia.buscarTodasLasRazas()) {
			System.out.println(ra.getNombre());
		}
		Localidad l1 = new Localidad("Chilecito", "5360");
		Domicilio d2 =  new Domicilio("san francisco", 373, 0,"chilecito", l1);
		Domicilio d1= new Domicilio("La plata", 548, 0, "chilecito", l1);
		Domicilio d3= new Domicilio("San francisco", 380, 0, "chilecito", l1);
		Cliente c1 = new Cliente("Quinteros", d1, "3822307614752653","3825-533103");
		Cliente c2 = new Cliente("Brizuela", d2, "123456785676767", "3825-436032" );
		//persistencia.crearCliente(c1);
		//persistencia.crearCliente(c2);
		Cliente c3 = new  Cliente("Luna", d3, "123456785676767", "3825-436032" );
		//persistencia.crearCliente(c3);
		List<Cliente> clientes = persistencia.buscarTodosLosClientes();
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getApellidoFamilia());
		}
		long idLocalidad = 34;
		List<Cliente> consulta = persistencia.buscarClientesPorLocalidad(persistencia.buscarUnicaLocalidad(idLocalidad));
		for (Cliente cliente : consulta) {
			System.out.println(cliente.getApellidoFamilia() + "  " + cliente.getDomicilio().getLocalidad().getNombre());
		}
		
		Localidad l5 = new Localidad("Nonogasta", "5362");
		persistencia.crearLocalidad(l5);
		Domicilio d5 =  new Domicilio("calle los nietoitos", 373, 0,"nonogasta", l5);
		persistencia.crearDomicilio(d5); // no agregado "error interno"*/
		
		Localidad l1 = new Localidad("Chilecito", "5360");
		Domicilio d2 =  new Domicilio("san francisco", 373, 0,"chilecito", l1);
		Domicilio d1= new Domicilio("La plata", 548, 0, "chilecito", l1);
		Domicilio d3= new Domicilio("San francisco", 380, 0, "chilecito", l1);
		Cliente c1 = new Cliente("Quinteros", d1, "3822307614752653","3825-533103");
		Cliente c2 = new Cliente("Brizuela", d2, "123456785676767", "3825-436032" );
		
		Paciente p1= new Paciente("Fiona", new Raza("Pastor aleman",  new Especie("canino")),"negro y marron", LocalDate.now() ,c1, 42);
		Visita v1 = new Visita(LocalDate.now(), new MotivoVisita("Ba�o"), 42);		p1.agregarVisita(v1);
		//persistencia.crearPaciente(p1);
		Visita visitaAActualzar = persistencia.buscarUnicaVisita(46);
		LocalDate fecha = LocalDate.of(2017, 11, 2);
		visitaAActualzar.setFechaVisita(fecha);
		persistencia.actualizarVisita(visitaAActualzar);
		List<Paciente> pacientesPorCliente = persistencia.buscarPacientesPorCliente(persistencia.buscarUnicoCliente(49));
		for (Paciente paciente : pacientesPorCliente) {
			for (Visita visita : paciente.getVisitas()) {
				System.out.println(paciente.getAlias() + " " + paciente.getRaza().getNombre() + " " + paciente.getDuenio().getApellidoFamilia()+ " " + visita.getIdVisita() + " " + visita.getMotivoVisita().getDescripcion() + " " + visita.getPesoVisita() + " " + visita.getFechaVisita());
			}
		}
		/*Paciente pPaciente = persistencia.buscarUnicoPaciente(46);
		for (Visita visita : pPaciente.getVisitas()) {
			System.out.println(visita.getIdVisita() + " " + visita.getMotivoVisita().getDescripcion() + " " + visita.getPesoVisita() + " " + visita.getFechaVisita());
		}*/
		
		
	} 

}
