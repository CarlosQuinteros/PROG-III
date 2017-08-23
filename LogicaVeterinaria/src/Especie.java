import java.util.ArrayList;

public class Especie {
	private String nombre;
	private ArrayList<Raza> misRazas = new ArrayList<Raza>();
	
	public Especie (){
		
	}

	public Especie(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Raza> getMisRazas() {
		return misRazas;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj == null || obj.getClass()!= Especie.class){
			return false;
		}
		Especie e= (Especie)obj;
		return e.getNombre().equals(this.nombre);
	}
	
	
	

}
