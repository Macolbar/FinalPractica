package controlador;

import almacen.AlmacenIndice;
import modelo.Articulo;
import modelo.Cliente;
import modelo.Pedido;
import utiles.Constantes;

public class DarAlta extends Acciones{

	//Se puede modificar tanto la entrada de datos como la salida
	/*private Constantes constantes;
	private AlmacenIndice<Cliente, String> almacenCliente;
	
	public DarAlta() {
		super();
		almacenCliente= new AlmacenIndice<>(constantes.getIndiceDat(), constantes.getClientesDat());
	}*/
	
	public void darAltaPedido(Pedido pedido){
		//getLogica().darAltaPedido(pedido);
	}
	
	
	public boolean darAlta(Cliente cliente) {
		//return almacenCliente.grabar(cliente, cliente.getKey());
		return false;
	}
	
	/**
	 * Coge los datos que recoge el paraui de art�culo y llama a la l�gica
	 * para que a�ada un nuevo art�culo
	 */
	public void darAltaArticulo(Pedido pedido,Articulo articulo, int cantidad){
		
	}
}
