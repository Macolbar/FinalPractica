package modelo;

import java.util.LinkedList;

public class Logica {

	private Datos dato;

	public Datos getDato() {
		return dato;
	}

	public void setDato(Datos dato) {
		this.dato = dato;
	}
	
	
	//Aqu� todos los m�todos que usen la l�gica y tengan que devolver cosas
	
	/**
	 * Le pasas el art�culo que quieres y te devuelve su nombre, descripci�n y proveedor en un String.
	 * @param articulo
	 * @return
	 */
	public String consultarArticulo(Articulo articulo){
		return articulo.toString();
	}
	
	/**
	 * Te devuelve todos los precios de un art�culo en concreto
	 * @param articulo
	 * @return
	 */
	public LinkedList<Precio> preciosArticulo(Articulo articulo){
		return articulo.getPrecios();
	}
	
	/**
	 * A�ade un art�culo a la l�nea de pedido. Recordar crear una nueva l�nea de pedido antes, para no sustituir la anterior.
	 * @param articulo
	 * @param cantidad
	 */
	public void darAltaArticulo(Articulo articulo, int cantidad){
		dato.getLinea().setArticulo(articulo);
		dato.getLinea().setCantidad(cantidad);
	}
	
	/**
	 * Te da todos los art�culos en un peiddo en concreto
	 * @param pedido
	 * @return
	 */
	public LinkedList<Articulo> articulosEnPedido(Pedido pedido){
		return dato.getAlmacenPedidos().getLineaPedidos();
	}
	
	/**
	 * Cambia el �ltimo precio de la lista (precioActual)  a un precio nuevo
	 * @param precioNuevo
	 * @param articulo
	 */
	public void cambiarPrecio(Precio precioNuevo,Articulo articulo){
		articulo.getPrecios().pop();
		articulo.getPrecios().add(precioNuevo);
	}
	
	/**
	 * A�ade un articulo a un pedido en concreto
	 * @param pedido
	 * @param articulo
	 * @param cantidad
	 */
	public void addArticulo(Pedido pedido, Articulo articulo,int cantidad){
		pedido.getLineas().add(new Linea(articulo, cantidad));
	}
	
}
