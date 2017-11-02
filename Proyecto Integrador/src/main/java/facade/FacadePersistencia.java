package facade;
import java.util.List;
import persistencia.*;
import modelo.*;

public class FacadePersistencia {
	
	DaoEnfermedad persistenciaEnfermedad = new DaoEnfermedad();
	DaoEspecie persistenciaEspecie = new DaoEspecie();
	DaoLocalidad persistenciaLocalidad = new DaoLocalidad();
	DaoMotivo persistenciaMotivo = new DaoMotivo();
	DaoRaza persistenciaRaza = new DaoRaza();
	DaoMedicamento persistenciaMedicamento = new DaoMedicamento();
	DaoDomicilio persistenciaDomicilio = new DaoDomicilio();
	DaoCliente persistenciaCliente = new DaoCliente();
	DaoVacunaColocada persistenciaVacunaColocada = new DaoVacunaColocada();
	DaoMedicacion persistenciaMedicacion = new DaoMedicacion();
	DaoEnfermedadPaciente persistenciaEnfermedadPaciente = new DaoEnfermedadPaciente();
	DaoPaciente persistenciaPaciente = new DaoPaciente();
	DaoVisita persistenciaVisita = new DaoVisita();
	
	public FacadePersistencia(){
		
	}
	//CLASE ENFERMEDAD
	
	public Boolean crearEnfermedad(Enfermedad pEnfermedad)
	{
		return persistenciaEnfermedad.persistirEnfermedad(pEnfermedad);
	}
	
	public Boolean actualizarEnfermedad(Enfermedad pEnfermedad)
	{
		return persistenciaEnfermedad.modificarEnfermedad(pEnfermedad);
	}
	
	
	public Boolean borrarEnfermedad(Enfermedad pEnfermedad)
	{
		return persistenciaEnfermedad.eliminarEnfermedad(pEnfermedad);
	}
	
	public Enfermedad buscarUnicaEnfermedad(long pIdEnfermedad)
	{
		return persistenciaEnfermedad.obtenerUnicaEnfermedad(pIdEnfermedad);
	}
	
	public List<Enfermedad> buscarTodasLasEnfermedades()
	{
		return persistenciaEnfermedad.obtenerTodasLasEnfermedades();
	}
	
	public List<Enfermedad> buscarEnfermedadesPorNombre(String nombre)
	{
		return persistenciaEnfermedad.obtenerEnfermedadPorNombre(nombre);
	}
	
	//CLASE ESPECIE
	
	
	public Boolean crearEspecie (Especie pEspecie)
	{
		return persistenciaEspecie.persistirEspecie(pEspecie);
		
	}
	
	public Boolean actualizarEspecie(Especie pEspecie)
	{
		return persistenciaEspecie.modificarEspecie(pEspecie);
	}
	
	public Boolean borrarEspecie(Especie pEspecie)
	{
		return persistenciaEspecie.eliminarEspecie(pEspecie);
	}
	
	public Especie buscarUnicaEspecie(long pIdEspecie)
	{
		return  persistenciaEspecie.obtenerUnicaEspecie(pIdEspecie);
	}
	
	public List<Especie> buscarTodasLasEspecies()
	{
		return persistenciaEspecie.obtenerTodasLasEspecies();
	}
	
	public List<Especie> buscarEspeciesPorNombre(String pNombre)
	{
		return persistenciaEspecie.obtenerEspeciesPorNombre(pNombre);
	}
	
	public List<Raza> buscarRazasPorEspecie(Especie pEspecie)
	{
		return persistenciaEspecie.obtenerMisRazas(pEspecie);
	}
	
	//CLASE LOCALIDAD
	
	public Boolean crearLocalidad(Localidad pLocalidad)
	{
		return persistenciaLocalidad.persistirLocalidad(pLocalidad);
	}
	
	public Boolean actualizarLocalidad(Localidad pLocalidad)
	{
		return persistenciaLocalidad.modificarLocalidad(pLocalidad);
	}
	
	public Boolean borrarLocalidad(Localidad pLocalidad)
	{
		return persistenciaLocalidad.eliminarLocalidad(pLocalidad);
	}
	
	public Localidad buscarUnicaLocalidad(long pIdLocalidad)
	{
		return persistenciaLocalidad.obtenerUnicaLocalidad(pIdLocalidad);
		
	}
	
	public List<Localidad> buscarTodasLasLocalidades()
	{
		return persistenciaLocalidad.obtenerTodasLasLocalidades();
	}
	
	public List<Localidad> buscarLocalidadesPorNombre(String pNombre)
	{
		return persistenciaLocalidad.obtenerLocalidadesPorNombre(pNombre);
		
	}
	
	public List<Domicilio> buscarDomiciliosPorLocalidad (Localidad pLocalidad)
	{
		return persistenciaLocalidad.obtenerMisDomicilios(pLocalidad);
	}
	
	//CLASE MOTIVO VISITA
	
	public Boolean crearMotivoVisita(MotivoVisita pMotivo)
	{
		return persistenciaMotivo.persistirMotivoVisita(pMotivo);
	}
	
	public Boolean actualizarMotivo(MotivoVisita pMotivo)
	{
		return persistenciaMotivo.modificarMotivoVisita(pMotivo);
	}
	
	public Boolean borrarMotivo(MotivoVisita pMotivo)
	{
		return persistenciaMotivo.eliminarMotivoVisita(pMotivo);
	}
	
	public MotivoVisita buscarUnicoMotivo(long pIdMotivo)
	{
		return persistenciaMotivo.obtenerUnicoMotivoVisita(pIdMotivo);
	}
	
	public List<MotivoVisita> buscarTodosLosMotivos ()
	{
		return persistenciaMotivo.obtenerTodosLosMotivos();
	}
	
	public List<MotivoVisita> buscarMotivosPorDescripcion(String pDescripcion)
	{
		return persistenciaMotivo.obtenerMotivosPorDescripcion(pDescripcion);
	}
	
	
	public List<Visita> buscarVisitasPorMotivo (MotivoVisita pMotivo)
	{
		return persistenciaMotivo.obtenerVisitasPorMotivo(pMotivo);
	}
	
	//CLASE RAZA
	
	public Boolean crearRaza (Raza pRaza)
	{
		return persistenciaRaza.persistirRaza(pRaza);
	}
	
	public Boolean actualizarRaza(Raza pRaza)
	{
		return persistenciaRaza.modificarRaza(pRaza);
	}
	
	public Boolean borrarRaza (Raza pRaza)
	{
		return persistenciaRaza.eliminarRaza(pRaza);
	}
	
	public Raza buscarUnicaRaza(long pIdRaza)
	{
		return persistenciaRaza.obtenerUnicaRaza(pIdRaza);
	}
	
	public List<Raza> buscarTodasLasRazas()
	{
		return persistenciaRaza.obtenerTodasLasRazas();
	}
	
	public List<Raza> buscarRazasPorNombre(String pNombre)
	{
		return persistenciaRaza.obtenerRazasPorNombre(pNombre);
	}
	
	
	//CALSE MEDICAMENTO 
	
	public Boolean crearMedicamento(Medicamento pMedicamento)
	{
		return persistenciaMedicamento.persisitrMedicamento(pMedicamento);
	}
	
	public Boolean actualizarMedicamento(Medicamento pMedicamento)
	{
		return persistenciaMedicamento.modificarMedicamento(pMedicamento);
	}
	
	public Boolean borrarMedicamento(Medicamento pMedicamento)
	{
		return persistenciaMedicamento.eliminarMedicamento(pMedicamento);
	}
	
	public Medicamento buscarUnicoMedicamento(long pIdMedicamento)
	{
		return persistenciaMedicamento.obtenerUnicoMedicamento(pIdMedicamento);
	}
	
	public List<Medicamento> buscarTodosLosMedicamentos()
	{
		return persistenciaMedicamento.obtenerTodosLosMedicamentos();
	}
	
	public List<Medicamento> buscarMedicamentosPorNombre(String pNombre)
	{
		return persistenciaMedicamento.obtenerMedicamentosPorNombre(pNombre);
	}
	
	public Medicamento buscarMedicamentoPorCodigo(String pCodigo)
	{
		return persistenciaMedicamento.obtenerMedicamentoPorCodigo(pCodigo);
	}
	
	
	//CLASE DOMICILIO
	
	public Boolean crearDomicilio(Domicilio pDomicilio)
	{
		return persistenciaDomicilio.persistirDomicilio(pDomicilio);
	}
	
	public Boolean actualizarDomicilio (Domicilio pDomicilio)
	{
		return persistenciaDomicilio.modificarDomicilio(pDomicilio);
	}
	
	public Boolean borrarDomicilio(Domicilio pDomicilio)
	{
		return persistenciaDomicilio.eliminarDomicilio(pDomicilio);
	}
	
	public Domicilio buscarUnicoDomicilio(long pIdDomicilio)
	{
		return persistenciaDomicilio.obtenerUnicoDomicilio(pIdDomicilio);
	}
	
	public List<Domicilio> buscarDomiciliosPorCalleODepto(String pCalleODepto)
	{
		return persistenciaDomicilio.obtenerDomiciliosPorCalleODepartamento(pCalleODepto);
	}
	
	public List<Domicilio> buscarTodosLosDomicilios()
	{
		return persistenciaDomicilio.obtenerTodosLosDomicilios();
	}
	
	//CLASE CLIENTE
	
	public Boolean crearCliente(Cliente pCliente)
	{
		return persistenciaCliente.persistirCliente(pCliente);
	}
	
	public Boolean actualizarCliente (Cliente pCliente)
	{
		return persistenciaCliente.modificarCliente(pCliente);
	}
	
	public Boolean borrarCliente(Cliente pCliente)
	{
		return persistenciaCliente.eliminarCliente(pCliente);
	}
	
	public Cliente buscarUnicoCliente(long pIdCliente)
	{
		return persistenciaCliente.obtenerUnicoCliente(pIdCliente);
	}
	
	public List<Cliente> buscarTodosLosClientes()
	{
		return persistenciaCliente.obtenerTodosLosClientes();
	}
	
	public List<Cliente> buscarClientesPorLocalidad(Localidad pLocalidad)
	{
		return persistenciaCliente.obtenerClientesPorLocalidad(pLocalidad);
	}
	
	public List<Cliente> buscarClientesPorApellidoFamilia(String pApellido)
	{
		return persistenciaCliente.obtenerClientesPorApellidoFamilia(pApellido);
	}
	
	public List<Paciente> buscarPacientesPorCliente(Cliente pCliente)
	{
		return persistenciaCliente.obtenerPacientesPorCliente(pCliente);
	}
	
	//CLASE VACUNA COLOCADA
	
	public Boolean crearVacunaColocada(VacunaColocada pVacuna)
	{
		return persistenciaVacunaColocada.persistirVacunaColocada(pVacuna);
	}
	
	public Boolean actualizarVacunaColocada(VacunaColocada pVacuna)
	{
		return persistenciaVacunaColocada.modificarVacunaColocada(pVacuna);
	}
	
	public Boolean borrarVacunaColocada(VacunaColocada pVacuna)
	{
		return persistenciaVacunaColocada.eliminarVacunaColocada(pVacuna);
	}
	
	public VacunaColocada buscarUnicaVacunaColocada(long pIdVacunaColocada)
	{
		return persistenciaVacunaColocada.obtenerUnicaVacunaColocada(pIdVacunaColocada);
	}
	
	public List<VacunaColocada> buscarTodasLasVacunasColocadas()
	{
		return persistenciaVacunaColocada.obtenerTodasLasVacunasColocadas();
	}
	
	//CLASE MEDICACION
	
	public Boolean crearMedicacion(Medicacion pMedicacion)
	{
		return persistenciaMedicacion.persistirMedicacion(pMedicacion);
	}
	
	public Boolean actualizarMedicacion(Medicacion pMedicacion)
	{
		return persistenciaMedicacion.modificarMedicacion(pMedicacion);
	}
	
	public Boolean borrarMedicacion(Medicacion pMedicacion)
	{
		return persistenciaMedicacion.eliminarMedicacion(pMedicacion);
	}
	
	public Medicacion buscarUnicaMedicacion(long pIdMedicacion)
	{
		return persistenciaMedicacion.obtenerUnicaMedicacion(pIdMedicacion);
	}
	
	public List<Medicacion> buscarTodasLasMedicaciones()
	{
		return persistenciaMedicacion.obtenerTodasLasMedicaciones();
	}
	
	public List<Medicacion> buscarMedicacionesPorMedicamento(Medicamento pMedicamento)
	{
		return persistenciaMedicacion.obtenerMedicacionesPorMedicamento(pMedicamento);
	}
	
	//CLASE ENFERMEDAD PACIENTE
	
	public Boolean crearEnfermedadPaciente(EnfermedadPaciente pEnfermedadPaciente)
	{
		return persistenciaEnfermedadPaciente.persistirEnfermedadPaciente(pEnfermedadPaciente);
	}
	
	public Boolean actualizarEnfermedadPaciente(EnfermedadPaciente pEnfermedadPaciente)
	{
		return persistenciaEnfermedadPaciente.modificarEnfermedadPaciente(pEnfermedadPaciente);
	}
	
	public Boolean borrarEnfermedadPaciente(EnfermedadPaciente pEnfermedadPaciente)
	{
		return persistenciaEnfermedadPaciente.eliminarEnferemdadPaciente(pEnfermedadPaciente);
	}
	
	public EnfermedadPaciente buscarUnicaEnfermedadPaciente(long pId)
	{
		return persistenciaEnfermedadPaciente.obtenerUnicaEnfermedadPaciente(pId);
	}
	
	public List<EnfermedadPaciente> buscarTodasLasEnfermedadesPaciente()
	{
		return persistenciaEnfermedadPaciente.obtenerTodasLasEnfermedadesPaciente();
	}
	
	//CLASE PACIENTE
	
	public Boolean crearPaciente(Paciente pPaciente)
	{
		return persistenciaPaciente.persistirPaciente(pPaciente);
	}
	
	public Boolean actualizarPaciente(Paciente pPaciente)
	{
		return persistenciaPaciente.modificarPaciente(pPaciente);
	}
	
	public Boolean borrarPaciente (Paciente pPaciente)
	{
		return persistenciaPaciente.eliminarPaciente(pPaciente);
	}
	
	public Paciente buscarUnicoPaciente(long pIdPaciente)
	{
		return persistenciaPaciente.obtenerUnicoPaciente(pIdPaciente);
	}
	
	public List<Paciente> buscarTodosLosPacientes()
	{
		return persistenciaPaciente.obtenerTodosLosPacientes();
	}
	
	public List<Paciente> buscarPacientesPorColorDePelo(String pColor)
	{
		return persistenciaPaciente.obtenerPacientesPorColorDePelo(pColor);
	}
	
	public List<Paciente> buscarPacientesMayorAXAños(int pCantidadDeAños)
	{
		return persistenciaPaciente.obtenerPacientesMayoresDeXAños(pCantidadDeAños);
	}
	
	public List<Paciente> buscarPacientesPorAlias(String pAlias)
	{
		return persistenciaPaciente.obtenerPacientesPorAlias(pAlias);
	}
	
	public List<Paciente> buscarPacientesPorRaza(Raza pRaza)
	{
		return persistenciaPaciente.obtenerPacientesPorRaza(pRaza);
	}
	
	public List<VacunaColocada> buscarVacunasDePaciente(Paciente pPaciente)
	{
		return persistenciaPaciente.obtenerMisVacunasPorPaciente(pPaciente);
	}
	
	public List<Visita> buscarVisitasDePaciente (Paciente pPaciente)
	{
		return persistenciaPaciente.obtenerMisVisitasPorPaciente(pPaciente);
	}
	
	//CLASE VISITA
	
	public Boolean crearVisita(Visita pVisita)
	{
		return persistenciaVisita.persistirVisita (pVisita);
	}
	
	public Boolean actualizarVisita(Visita pVisita)
	{
		return persistenciaVisita.modificarVisita(pVisita);
	}
	
	public Boolean eliminarVisita(Visita pVisita)
	{
		return persistenciaVisita.eliminarVisita(pVisita);
	}
	
	public Visita buscarUnicaVisita(long pIdVisita)
	{
		return persistenciaVisita.obtenerUnicaVisita(pIdVisita);
	}
	
	public List<Visita> buscarTodasLasVisitas()
	{
		return persistenciaVisita.obtenerTodasLasVisitas();
	}
	
	public List<Visita> buscarVisitasPorMotivo2(MotivoVisita pMotivo)
	{
		return persistenciaVisita.obtenerVisitasPorMotivo(pMotivo);
	}
	
	public List<Visita> buscarVisitasPorLocalidad(Localidad pLocalidad)
	{
		return persistenciaVisita.obtenerVisitasPorLocalidad(pLocalidad);
	}
	
	public List<Visita> buscarVisitasDelDia()
	{
		return persistenciaVisita.obtenerVisitasDelDia();
	}
	
	
	

	
}
