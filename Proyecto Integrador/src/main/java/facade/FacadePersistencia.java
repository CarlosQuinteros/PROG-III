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
	
	
}
