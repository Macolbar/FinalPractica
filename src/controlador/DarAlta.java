package controlador;

import modelo.Articulo;
import modelo.Pedido;

public class DarAlta extends Acciones{

	//Se puede modificar tanto la entrada de datos como la salida
	
	@Override
	public void darAltaPedido(){
		
	}
	
	@Override
	public void darAltaCliente(){
		
	}
	
	/**
	 * Coge los datos que recoge el paraui de art�culo y llama a la l�gica
	 * para que a�ada un nuevo art�culo
	 */
	public void darAltaArticulo(Pedido pedido,Articulo articulo, int cantidad){
		getLogica().addArticulo(pedido, articulo, cantidad);
	}
}
