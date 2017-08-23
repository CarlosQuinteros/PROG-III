
public class Enfermedad {
	private String nombre;
	
	public Enfermedad(){
		
		
	}

	public Enfermedad(String nombre) {
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
		
		if(obj == null || obj.getClass()!= Enfermedad.class){
			return false;
		}
		Enfermedad e = (Enfermedad)obj;
		return e.getNombre().equals(this.nombre);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	

}
