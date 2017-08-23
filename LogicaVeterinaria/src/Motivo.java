
public class Motivo {
	private String descripcion;
	
	public Motivo (){
		
	}

	public Motivo(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj == null || obj.getClass()!= Motivo.class){
			return false;
		}
		Motivo m = (Motivo)obj;
		return m.getDescripcion().equals(this.getDescripcion());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	

}
