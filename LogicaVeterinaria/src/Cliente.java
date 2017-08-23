import java.util.ArrayList;

public class Cliente {
	private String codigo;
	private String numeroCuentaBancaria;
	private String primerApellidoFamilia;
	private ArrayList<Persona> misIntegrantes =  new ArrayList<Persona>();
	private ArrayList<Paciente> misPacientes = new ArrayList<Paciente>();
	
	public Cliente (){
		
	}

	public Cliente(String codigo, String numeroCuentaBancaria, String primerApellidoFamilia) {
		this.codigo = codigo;
		this.numeroCuentaBancaria = numeroCuentaBancaria;
		this.primerApellidoFamilia = primerApellidoFamilia;

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNumeroCuentaBancaria() {
		return numeroCuentaBancaria;
	}

	public void setNumeroCuentaBancaria(String numeroCuentaBancaria) {
		this.numeroCuentaBancaria = numeroCuentaBancaria;
	}

	public String getPrimerApellidoFamilia() {
		return primerApellidoFamilia;
	}

	public void setPrimerApellidoFamilia(String primerApellidoFamilia) {
		this.primerApellidoFamilia = primerApellidoFamilia;
	}

	public ArrayList<Persona> getMisIntegrantes() {
		return misIntegrantes;
	}

	public ArrayList<Paciente> getMisPacientes() {
		return misPacientes;
	}

	
	
	
	
	

}
