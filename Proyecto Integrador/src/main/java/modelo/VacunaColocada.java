package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import modelo.Enfermedad;

/**
 * Entity implementation class for Entity: VacunaColocada
 *
 */
@Entity

public class VacunaColocada implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="vacunaColocada_seq")
	@SequenceGenerator(name="vacunaColocada_seq", sequenceName="vacunaColocada_seq", initialValue=0, allocationSize=1)
	private long idVacuna;
	private LocalDate fechaColocacion;
	@ManyToOne
	private Enfermedad enfermedad;
	private static final long serialVersionUID = 1L;

	
	
	public VacunaColocada(LocalDate fechaColocacion, Enfermedad enfermedad) {
		this.fechaColocacion = fechaColocacion;
		this.enfermedad = enfermedad;
	}
	public VacunaColocada() {
		super();
	}   
	public long getIdVacuna() {
		return this.idVacuna;
	}

	public void setIdVacuna(long idVacuna) {
		this.idVacuna = idVacuna;
	}   
	public LocalDate getFechaColocacion() {
		return this.fechaColocacion;
	}

	public void setFechaColocacion(LocalDate fechaColocacion) {
		this.fechaColocacion = fechaColocacion;
	}   
	public Enfermedad getEnfermedad() {
		return this.enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}
   
}
