package modelo;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.persistence.*;
import modelo.Domicilio;

/**
 * Entity implementation class for Entity: Cliente
 *
 */
@Entity

public class Cliente implements Serializable {

	   
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator="cliente_seq")
	@SequenceGenerator(name="cliente_seq", sequenceName="cliente_seq", initialValue=0, allocationSize=1)
	private long idCliente;
	private String apellidoFamilia;
	@ManyToOne
	private Domicilio domicilio;
	private String nroCuenta;
	private String telefono;
	@OneToMany(mappedBy="duenio")
	private List<Paciente> listaMascotas;

	private static final long serialVersionUID = 1L;

	public Cliente() {
		super();
	}   
	public long getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}   
	public String getApellidoFamilia() {
		return this.apellidoFamilia;
	}

	public void setApellidoFamilia(String apellidoFamilia) {
		this.apellidoFamilia = apellidoFamilia;
	}   
	public Domicilio getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}   
	public String getNroCuenta() {
		return this.nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}   
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public List<Paciente> getListaPacientes()
	{
		return this.listaMascotas;
	}
   
}
