import java.util.List;
import facade.FacadePersistencia;
import modelo.*;
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		FacadePersistencia persistencia = new FacadePersistencia();
		
		Especie e1 = new Especie("Canino");
		//persistencia.crearEspecie(e1);
		Raza r1 = new Raza("dogo", e1);
		//persistencia.crearRaza(r1);
		List<Raza> razas = persistencia.buscarTodasLasRazas();
		for (Raza raza : razas) {
			System.out.println(raza.getNombre() + " Especie: " + raza.getEspecie().getNombre() );
		}
		
		
	}

}
