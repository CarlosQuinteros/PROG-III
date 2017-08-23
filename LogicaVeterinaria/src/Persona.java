import java.util.Date;

public class Persona {
	private String apellido;
	private String nombre;
	private Date FechaNacimiento;
	private String dcumento;
	private String telefono;
	
	
	public Persona (){
	
	}


	public Persona(String apellido, String nombre, Date fechaNacimiento, String dcumento, String telefono) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.FechaNacimiento = fechaNacimiento;
		this.dcumento = dcumento;
		this.telefono = telefono;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}


	public String getDcumento() {
		return dcumento;
	}


	public void setDcumento(String dcumento) {
		this.dcumento = dcumento;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public boolean equals(Object obj) {
		if(obj == null || obj.getClass()!= Persona.class){
			return false;
		}
		Persona p = (Persona) obj;
		return p.getDcumento().equals(this.getDcumento());
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	
	

}
