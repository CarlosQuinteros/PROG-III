
public class Raza {
	private String nombre;
	private Especie especie;
	
	public Raza (){
		
	}

	public Raza(String nombre, Especie especie) {
		this.nombre = nombre;
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public Especie getEspecie() {
		return especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass()!= Raza.class){
			return false;
		}
		Raza r= (Raza)obj;
		return r.getNombre().equals(this.getNombre());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	

}
