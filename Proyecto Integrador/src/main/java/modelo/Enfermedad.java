package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Enfermedad
 *
 */
@Entity

public class Enfermedad implements Serializable {

	   
	@Id
	private long idEnfermedad;
	private String nombre;
	private static final long serialVersionUID = 1L;

	
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
	}
	public Enfermedad() {
		super();
	}   
	public long getIdEnfermedad() {
		return this.idEnfermedad;
	}

	public void setIdEnfermedad(long idEnfermedad) {
		this.idEnfermedad = idEnfermedad;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
