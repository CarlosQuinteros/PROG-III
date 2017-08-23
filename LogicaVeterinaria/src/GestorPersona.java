import java.util.ArrayList;
import java.util.Date;

public class GestorPersona {
	
	private ArrayList<Persona> listadoPersonas = new  ArrayList<Persona>();
	
	public GestorPersona(){
		
	}
	
	public Boolean crearPersona(String pApellido, String pNombre, Date pFechaNacimiento, String pDcumento, String pTelefono){
		Persona pNueva = new Persona(pApellido, pNombre, pFechaNacimiento, pDcumento, pTelefono);
		if(!listadoPersonas.contains(pNueva)){
			listadoPersonas.add(pNueva);
			return true;
		}
		return false;
	}


	public ArrayList<Persona> getListadoPersonas() {
		return listadoPersonas;
	}
	
	
}
