package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MotivoVisita
 *
 */
@Entity

public class MotivoVisita implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="motivoVisita_seq")
	@SequenceGenerator(name="motivoVisita_seq", sequenceName="motivoVisita_seq", initialValue=0, allocationSize=1)
	private long idMotivoVisita;
	private String descripcion;
	private static final long serialVersionUID = 1L;
	
	

	public MotivoVisita(String descripcion) {
	
		this.descripcion = descripcion;
	}
	public MotivoVisita() {
		super();
	}   
	public long getIdMotivoVisita() {
		return this.idMotivoVisita;
	}

	public void setIdMotivoVisita(long idMotivoVisita) {
		this.idMotivoVisita = idMotivoVisita;
	}   
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
   
}
