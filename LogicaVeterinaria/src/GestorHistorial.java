import java.util.ArrayList;
import java.util.Calendar;

public class GestorHistorial {
	ArrayList<ItemHistorial> listadoItemHistoriales = new ArrayList<ItemHistorial>();
	
	public GestorHistorial(){
		
	}
	
	public Boolean crearItemHistorial(Double pDosis, Enfermedad pEnfermedad, Calendar pFechaEnQueSeEnfermo, Medicamento pMedicamento,
			String pPeriodoDeAdministracion, Paciente pPaciente){
		ItemHistorial nuevoItem = new ItemHistorial(pDosis, pEnfermedad, pFechaEnQueSeEnfermo, pMedicamento, pPeriodoDeAdministracion, pPaciente);
		{
			listadoItemHistoriales.add(nuevoItem);
			return true;
		}
		
	}

	public ArrayList<ItemHistorial> getListadoItemHistoriales() {
		return listadoItemHistoriales;
	}
	
	

}
