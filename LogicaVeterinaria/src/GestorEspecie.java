import java.util.ArrayList;

public class GestorEspecie {
	
	private ArrayList<Especie> listadoEspecies = new ArrayList<Especie>();
	
	public Boolean crearEspecie (String pNombre){
		
		Especie eNueva= new Especie(pNombre);
		if(!listadoEspecies.contains(eNueva)){
			listadoEspecies.add(eNueva);
			return true;
		}
		return false;
	}

	public ArrayList<Especie> getListadoEspecies() {
		return listadoEspecies;
	}
	
	public Especie getEspeciePorNombreExacto(String pNombre){
		for (Especie especie : listadoEspecies) {
			if(especie.getNombre().equals(pNombre)){
				return especie;
			}
		}
		return null;
	}
	
	

}
