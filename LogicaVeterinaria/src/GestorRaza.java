import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestorRaza {
	
	private ArrayList<Raza> listadoRazas = new ArrayList<Raza>();
	
	public GestorPaciente gestorPaciente = new GestorPaciente();
	
	public GestorEspecie gestorEspecie = new GestorEspecie();
	
	public Boolean crearRaza (String pNombre, Especie pEspecie){
		
		Raza razaNueva= new Raza(pNombre, pEspecie);
		if(!listadoRazas.contains(razaNueva)){
			listadoRazas.add(razaNueva);
			return true;
		}
		return false;
	}

	public ArrayList<Raza> getListadoRazas() {
		return listadoRazas;
	}
	
	public ArrayList<Raza> getRazasPorEspecie(Especie pEspcie){ 
		
		ArrayList<Raza> razasPorEspecies = new ArrayList<Raza>();
		for (Raza raza : listadoRazas) {
			if(raza.getEspecie().equals(pEspcie.getNombre())){
				razasPorEspecies.add(raza);
			}
		}
		return razasPorEspecies;
	}
	
	public Raza getRazaPorNombreExacto(String pNombre){
		
		for (Raza raza : listadoRazas) {
			if(raza.getNombre().equals(pNombre)){
				return raza;
			}
		}
		return null;
	}
	
	public String getRazaCaninosConMasVisitasPorEnfemerdadDada(Enfermedad pEnfermedad){
		
		Map<String, Integer> razasNumeroVisitasPorEnfermedad = new HashMap<String, Integer>();
		ArrayList<Raza> razasCaninos = getRazasPorEspecie(gestorEspecie.getEspeciePorNombreExacto("CAN"));
		ArrayList<Paciente> pacientesCaninos = gestorPaciente.getPacientesPorEspecie(gestorEspecie.getEspeciePorNombreExacto("CAN"));
		ArrayList<ItemHistorial> listadoHistorialPacientesCaninos = new ArrayList<ItemHistorial>();
		String nombreRazaMayorCantidadDeVisitas = null;
		
		for (Paciente paciente : pacientesCaninos) {
			for (ItemHistorial itemHistorial : paciente.getMiHistorialMedico()) {
				if(itemHistorial.getEnfermedad().equals(pEnfermedad)){
					listadoHistorialPacientesCaninos.add(itemHistorial);
				}	
			}
		}
		
		for (Raza raza : razasCaninos) {
			razasNumeroVisitasPorEnfermedad.put(raza.getNombre(), 0);
		}
		Iterator<Map.Entry<String, Integer>> entradas = razasNumeroVisitasPorEnfermedad.entrySet().iterator();
		for (ItemHistorial itemHistorial : listadoHistorialPacientesCaninos) {
			
			while (entradas.hasNext()) {
			    Map.Entry<String, Integer> entry = entradas.next();
			    if(itemHistorial.getPaciente().getRaza().getNombre().equals(entry.getKey())){
			    	entry.setValue(entry.getValue()+1);
			    }
			}
		}
		Integer mayor = 0;
		while(entradas.hasNext()){
				Map.Entry<String, Integer> entry = entradas.next();
				if(entry.getValue() > mayor){
					mayor= entry.getValue();
				}
		}
		
		while(entradas.hasNext()){
			Map.Entry<String, Integer> entry = entradas.next();
			if(entry.getValue().equals(mayor)){
				nombreRazaMayorCantidadDeVisitas = entry.getKey(); 
			}
		}
		return nombreRazaMayorCantidadDeVisitas;

	}
	
	
	
	


}
