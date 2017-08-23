import java.util.ArrayList;
import java.util.Calendar;

public class GestorPaciente {
	public static int contadorPacientes=0;
	private ArrayList<Paciente> listadoPacientes = new ArrayList<Paciente>();
	
	GestorHistorial gestorHistorial = new GestorHistorial();
	GestorRaza gestorRaza = new GestorRaza();
	GestorEnfermedad gestorEnfermedad = new GestorEnfermedad();
	
	public GestorPaciente (){
		
	}
	
	public Boolean crearPaciente(String nombre, String colorPelo, Calendar fechaNacimientoAprox, Double pesoActual,
			Raza raza, Cliente pCliente){
		
		Paciente Nuevo= new Paciente(contadorPacientes++, nombre, colorPelo, fechaNacimientoAprox, pesoActual, raza, pCliente);
		
		if(!listadoPacientes.contains(Nuevo)){
			listadoPacientes.add(Nuevo);
			return true;
		}
		return false;
	}
	
	public ArrayList<Paciente> getPacientesPorRaza(Raza pRaza){
		
		ArrayList<Paciente> pacientesPorRaza = new ArrayList<Paciente>();
		for (Paciente paciente : listadoPacientes) {
			if(paciente.getRaza().equals(pRaza)){
				pacientesPorRaza.add(paciente);
			}
		}
		return pacientesPorRaza;
	}
	
	public ArrayList<Paciente> getPacientesPorEspecie (Especie pEspecie){
		ArrayList<Paciente> pacientesPorEspecie = new ArrayList<Paciente>();
		for (Paciente paciente : pacientesPorEspecie) {
			if(paciente.getRaza().getEspecie().equals(pEspecie)){
				pacientesPorEspecie.add(paciente);
			}
		}
		return pacientesPorEspecie;
	}
	
	public ArrayList<Paciente> getPacientesPorPeso(ArrayList<Paciente> pListadoPacientes, Double pPeso){
		ArrayList<Paciente> pacientesPorPeso = new ArrayList<Paciente>();
		for (Paciente paciente : pListadoPacientes) {
			
			if(paciente.getPesoActual().equals(pPeso)){
				pacientesPorPeso.add(paciente);
			}
		}
		return pacientesPorPeso;
	}

	
	public ArrayList<Paciente> getPacientesMayoresDe4Años(ArrayList<Paciente> pListadoPacientes){
		ArrayList<Paciente> pacientesMayoresDe4Años = new ArrayList<Paciente>();
		for (Paciente paciente : pListadoPacientes) {
			if((Calendar.getInstance().get(Calendar.YEAR)- paciente.getFechaNacimientoAprox().get(Calendar.YEAR)) > 4){
				pacientesMayoresDe4Años.add(paciente);
			}
		}
		return pacientesMayoresDe4Años;
	}
	
	public ArrayList<Paciente> getPacientesQueTuvieronEnfermedadDada(ArrayList<Paciente> pListadoPacientes, Enfermedad pEnfermeda){
		ArrayList<Paciente> pacientesQueTuvieronEnfermedad = new ArrayList<Paciente>();
		for (Paciente paciente : pListadoPacientes) {
			for (ItemHistorial item : paciente.getMiHistorialMedico()) {
				if(item.getEnfermedad().equals(pEnfermeda)){
					pacientesQueTuvieronEnfermedad.add(paciente);
				}
			}
		}
		
		return pacientesQueTuvieronEnfermedad;
	}
	
	public int getCantidadClientesConPitbullMayoresDe4AñosQueTuvieronEnfemedadDada(Enfermedad pEnfermeda){
		ArrayList<Cliente> listadodeClientes = new ArrayList<Cliente>();
		
		for (ItemHistorial itemHistorial : gestorHistorial.getListadoItemHistoriales()) {
			if(itemHistorial.getEnfermedad().equals(pEnfermeda) && (Calendar.getInstance().get(Calendar.YEAR)- itemHistorial.getPaciente().getFechaNacimientoAprox().get(Calendar.YEAR)) > 4 && itemHistorial.getPaciente().getRaza().equals(gestorRaza.getRazaPorNombreExacto("PITBULL")) && itemHistorial.getPaciente().getDueño()!= null){
				listadodeClientes.add(itemHistorial.getPaciente().getDueño());
			}	
		}
		return listadodeClientes.size();
	}
	

	
	

	
	

}
