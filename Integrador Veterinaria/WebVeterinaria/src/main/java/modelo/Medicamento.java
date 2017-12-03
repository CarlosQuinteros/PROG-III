package modelo;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medicamento
 *
 */
@Entity

public class Medicamento implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="medicamento_seq")
	@SequenceGenerator(name="medicamento_seq", sequenceName="medicamento_seq", initialValue=0, allocationSize=1)
	private long idMedicamento;
	private String codigo;
	private String nombre;
	private static final long serialVersionUID = 1L;

	
	
	public Medicamento(String codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public Medicamento() {
		super();
	}   
	public long getIdMedicamento() {
		return this.idMedicamento;
	}

	public void setIdMedicamento(long idMedicamento) {
		this.idMedicamento = idMedicamento;
	}   
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}   
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
   
}
