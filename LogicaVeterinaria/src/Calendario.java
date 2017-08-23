import java.util.Calendar;

public class Calendario {
	private Double dosisOtorgada;
	private Enfermedad enfermedad;
	private Calendar fechaVacuna;
	private String periodoDeAdministracion;
	
	public Calendario (){
		
	}
	
	public Calendario(Double dosisOtorgada, Enfermedad enfermedad, Calendar fechaVacuna,
			String periodoDeAdministracion) {
		this.dosisOtorgada = dosisOtorgada;
		this.enfermedad = enfermedad;
		this.fechaVacuna = fechaVacuna;
		this.periodoDeAdministracion = periodoDeAdministracion;
	}

	public Double getDosisOtorgada() {
		return dosisOtorgada;
	}

	public void setDosisOtorgada(Double dosisOtorgada) {
		this.dosisOtorgada = dosisOtorgada;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Calendar getFechaVacuna() {
		return fechaVacuna;
	}

	public void setFechaVacuna(Calendar fechaVacuna) {
		this.fechaVacuna = fechaVacuna;
	}

	public String getPeriodoDeAdministracion() {
		return periodoDeAdministracion;
	}

	public void setPeriodoDeAdministracion(String periodoDeAdministracion) {
		this.periodoDeAdministracion = periodoDeAdministracion;
	}
	
	
	
	
	
}
