package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Especie
 *
 */
@Entity

public class Especie implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="especie_seq")
	@SequenceGenerator(name="especie_seq", sequenceName="especie_seq", initialValue=0, allocationSize=1)
	private long idEspecie;
	private String nombre;
	private static final long serialVersionUID = 1L;

	public Especie() {
		super();
	}  
	
	
	public Especie(String nombre) {
		this.nombre = nombre;
	}


	public long getIdEspecie() {
		return this.idEspecie;
	}

	public void setIdEspecie(long idEspecie) {
		this.idEspecie = idEspecie;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
