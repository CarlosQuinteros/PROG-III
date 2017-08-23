import java.util.Calendar;

public class Visita {
	private Calendar fecha;
	private Motivo motivo;
	private Double pesoPaciente;
	
	public Visita (){
		
	}

	public Visita(Motivo motivo, Double pesoPaciente) {
		this.fecha = Calendar.getInstance();
		this.motivo = motivo;
		this.pesoPaciente = pesoPaciente;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public Motivo getMotivo() {
		return motivo;
	}

	public void setMotivo(Motivo motivo) {
		this.motivo = motivo;
	}

	public Double getPesoPaciente() {
		return pesoPaciente;
	}

	public void setPesoPaciente(Double pesoPaciente) {
		this.pesoPaciente = pesoPaciente;
	}
	
	
	
}
