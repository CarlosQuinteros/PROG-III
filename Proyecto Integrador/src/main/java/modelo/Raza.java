package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import modelo.Especie;

/**
 * Entity implementation class for Entity: Raza
 *
 */
@Entity

public class Raza implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="raza_seq")
	@SequenceGenerator(name="raza_seq", sequenceName="raza_seq", initialValue=0, allocationSize=1)
	private long idRaza;
	private String nombre;
	@ManyToOne
	private Especie especie;
	private static final long serialVersionUID = 1L;
	
	

	public Raza(String nombre, Especie especie) {
		super();
		this.nombre = nombre;
		this.especie = especie;
	}
	public Raza() {
		super();
	}   
	public long getIdRaza() {
		return this.idRaza;
	}

	public void setIdRaza(long idRaza) {
		this.idRaza = idRaza;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}   
	public Especie getEspecie() {
		return this.especie;
	}

	public void setEspecie(Especie especie) {
		this.especie = especie;
	}
   
}
