import java.util.Calendar;

public class ItemHistorial {

	private Double dosis;
	private Enfermedad enfermedad;
	private Calendar fechaEnQueSeEnfermo;
	private Medicamento medicamento;
	private String periodoDeAdministracion;
	private Paciente paciente;
	
	
	public ItemHistorial (){
		
	}


	public ItemHistorial(Double dosis, Enfermedad enfermedad, Calendar fechaEnQueSeEnfermo, Medicamento medicamento,
			String periodoDeAdministracion, Paciente paciente) {
		this.dosis = dosis;
		this.enfermedad = enfermedad;
		this.fechaEnQueSeEnfermo = fechaEnQueSeEnfermo;
		this.medicamento = medicamento;
		this.periodoDeAdministracion = periodoDeAdministracion;
		this.paciente = paciente;
	}
	


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public Double getDosis() {
		return dosis;
	}


	public void setDosis(Double dosis) {
		this.dosis = dosis;
	}


	public Enfermedad getEnfermedad() {
		return enfermedad;
	}


	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}


	public Calendar getFechaEnQueSeEnfermo() {
		return fechaEnQueSeEnfermo;
	}


	public void setFechaEnQueSeEnfermo(Calendar fechaEnQueSeEnfermo) {
		this.fechaEnQueSeEnfermo = fechaEnQueSeEnfermo;
	}


	public Medicamento getMedicamento() {
		return medicamento;
	}


	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}


	public String getPeriodoDeAdministracion() {
		return periodoDeAdministracion;
	}


	public void setPeriodoDeAdministracion(String periodoDeAdministracion) {
		this.periodoDeAdministracion = periodoDeAdministracion;
	}
	
	
	
}
