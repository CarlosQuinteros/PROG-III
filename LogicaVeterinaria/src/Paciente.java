import java.util.ArrayList;
import java.util.Calendar;

public class Paciente {
	private int idPaciente;
	private Cliente dueño;
	private String nombre;
	private String colorPelo;
	private Calendar fechaNacimientoAprox;
	private Double pesoActual;
	private Raza raza;
	private ArrayList<Double> misPesos = new ArrayList<Double>();
	private ArrayList<Visita> misVisitas = new ArrayList<Visita>();
	private ArrayList<Calendario> miCalendarioDeVacunacion = new ArrayList<Calendario>();
	private ArrayList<ItemHistorial> miHistorialMedico = new ArrayList<ItemHistorial>();
	public Paciente (){
		
	}

	public Paciente(int idPaciente, String nombre, String colorPelo, Calendar fechaNacimientoAprox, Double pesoActual,
			Raza raza, Cliente dueño) {
		this.idPaciente = idPaciente;
		this.nombre = nombre;
		this.colorPelo = colorPelo;
		this.fechaNacimientoAprox = fechaNacimientoAprox;
		this.pesoActual = pesoActual;
		this.raza = raza;
		this.dueño = dueño;
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColorPelo() {
		return colorPelo;
	}

	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	public Calendar getFechaNacimientoAprox() {
		return fechaNacimientoAprox;
	}

	public void setFechaNacimientoAprox(Calendar fechaNacimientoAprox) {
		this.fechaNacimientoAprox = fechaNacimientoAprox;
	}

	public Double getPesoActual() {
		return pesoActual;
	}

	public void setPesoActual(Double pesoActual) {
		this.pesoActual = pesoActual;
	}

	public ArrayList<Double> getMisPesos() {
		return misPesos;
	}
	
	public Cliente getDueño() {
		return dueño;
	}

	public void setDueño(Cliente dueño) {
		this.dueño = dueño;
	}

	public ArrayList<Visita> getMisVisitas() {
		return misVisitas;
	}

	public ArrayList<Calendario> getMiCalendarioDeVacunacion() {
		return miCalendarioDeVacunacion;
	}

	public ArrayList<ItemHistorial> getMiHistorialMedico() {
		return miHistorialMedico;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	
	
	
	
	
	
	
	

}
