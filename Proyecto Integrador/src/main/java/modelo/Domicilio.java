package modelo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;
import modelo.Localidad;

/**
 * Entity implementation class for Entity: Domicilio
 *
 */
@Entity

public class Domicilio implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="domicilio_seq")
	@SequenceGenerator(name="domicilio_seq", sequenceName="domicilio_seq", initialValue=0, allocationSize=1)
	private long idDomicilio;
	private String calle;
	private Integer numero;
	private Integer piso;
	private String depto;
	@ManyToOne
	private Localidad localidad;
	private static final long serialVersionUID = 1L;

	
	
	public Domicilio(String calle, Integer numero, Integer piso, String depto, Localidad localidad) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.depto = depto;
		this.localidad = localidad;
	}
	public Domicilio() {
		super();
	}   
	public long getIdDomicilio() {
		return this.idDomicilio;
	}

	public void setIdDomicilio(long idDomicilio) {
		this.idDomicilio = idDomicilio;
	}   
	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}   
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}   
	public Integer getPiso() {
		return this.piso;
	}

	public void setPiso(Integer piso) {
		this.piso = piso;
	}   
	public String getDepto() {
		return this.depto;
	}

	public void setDepto(String depto) {
		this.depto = depto;
	}   
	public Localidad getLocalidad() {
		return this.localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}
   
}
