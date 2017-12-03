package modelo;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Localidad
 *
 */
@Entity

public class Localidad implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="localidad_seq")
	@SequenceGenerator(name="localidad_seq", sequenceName="localidad_seq", initialValue=0, allocationSize=1)
	private Long idLocalidad;
	private String nombre;
	private String codigoPostal;
	private static final long serialVersionUID = 1L;
	
	 

	public Localidad(String nombre, String codigoPostal) {
		
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}
	
	public Localidad() {
		super();
	}   
	public Long getIdLocalidad() {
		return this.idLocalidad;
	}

	public void setIdLocalidad(Long idLocalidad) {
		this.idLocalidad = idLocalidad;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public String getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
   
}
