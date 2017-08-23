
public class Medicamento {
	
	private String nombre;
	
	public Medicamento (){
		

	}

	public Medicamento(String nombre) {
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
		
		if(obj == null || obj.getClass()!= Medicamento.class){
			
			return false;
		}
		Medicamento m = (Medicamento)obj;
		return m.getNombre().equals(this.getNombre());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	
}
