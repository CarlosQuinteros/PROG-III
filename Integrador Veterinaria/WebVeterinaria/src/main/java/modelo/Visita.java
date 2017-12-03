package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import modelo.MotivoVisita;

/**
 * Entity implementation class for Entity: Visita
 *
 */
@Entity

public class Visita implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="visita_seq")
	@SequenceGenerator(name="visita_seq", sequenceName="visita_seq", initialValue=0, allocationSize=1)
	private long idVisita;
	private LocalDate fechaVisita;
	@ManyToOne
	private MotivoVisita motivoVisita;
	private float pesoVisita;
	private static final long serialVersionUID = 1L;

	
	
	public Visita(LocalDate fechaVisita, MotivoVisita motivoVisita, float pesoVisita) {
		
		this.fechaVisita = fechaVisita;
		this.motivoVisita = motivoVisita;
		this.pesoVisita = pesoVisita;
	}
	public Visita() {
		super();
	}   
	public long getIdVisita() {
		return this.idVisita;
	}

	public void setIdVisita(long idVisita) {
		this.idVisita = idVisita;
	}   
	public LocalDate getFechaVisita() {
		return this.fechaVisita;
	}

	public void setFechaVisita(LocalDate fechaVisita) {
		this.fechaVisita = fechaVisita;
	}   
	public MotivoVisita getMotivoVisita() {
		return this.motivoVisita;
	}

	public void setMotivoVisita(MotivoVisita motivoVisita) {
		this.motivoVisita = motivoVisita;
	}   
	public float getPesoVisita() {
		return this.pesoVisita;
	}

	public void setPesoVisita(float pesoVisita) {
		this.pesoVisita = pesoVisita;
	}
   
}
