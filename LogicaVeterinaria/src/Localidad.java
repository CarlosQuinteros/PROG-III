
public class Localidad {
	private String nombre;
	
	public Localidad (){
		
	}

	public Localidad(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == null || obj.getClass()!= Localidad.class){
			return false;
		}
		Localidad l = (Localidad)obj;
		return l.getNombre().equals(this.getNombre());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	
	
	
}
