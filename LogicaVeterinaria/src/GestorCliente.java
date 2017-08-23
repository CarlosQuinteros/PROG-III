import java.util.ArrayList;

public class GestorCliente {
	
	private ArrayList<Cliente> listadoClientes = new  ArrayList<Cliente>();
	
	public GestorCliente (){
		
	}
	
	
	
	public ArrayList<Cliente> getListadoClientes() {
		return listadoClientes;
	}



	public Boolean crearCliente(String pCodigo, String pNumeroCuentaBancaria, String pPrimerApellidoFamilia){
		
		try {
			Cliente clienteNuevo = new Cliente(pCodigo, pNumeroCuentaBancaria, pPrimerApellidoFamilia);
			if(buscarClientePorCodigo(pCodigo)==null){
				listadoClientes.add(clienteNuevo);
				return true;
			}
			return false;
			
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public Cliente buscarClientePorCodigo(String pCodigo){
		
		for (Cliente cliente : listadoClientes) {
			
			if(cliente.getCodigo().equals(pCodigo)){
				return cliente;
			}
		}
		return null;
	}

}
