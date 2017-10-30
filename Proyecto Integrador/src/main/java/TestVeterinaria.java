import java.util.List;
import modelo.*;
import facade.*;
public class TestVeterinaria {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FacadePersistencia persistencia = new FacadePersistencia();
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
	}

}
