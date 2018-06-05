package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import almacen.AlmacenRutaDestino;
import almacen.DAO;
import modelo.Cliente;
import modelo.Pedido;


public class AlmacenRutaDestinoTest {

	AlmacenRutaDestino<Pedido> instancia;
	Cliente cliente=new Cliente("1", "nose", null, null);
	@Before
	public void setUp() throws Exception {
		instancia=new AlmacenRutaDestino<>("data/pedidos", "ped");		
	}

	@After
	public void tearDown() throws Exception {
		new DAO<>().borrar("data/pedidos/1/1.ped");
		new DAO<>().borrar("data/pedidos/1/2.ped");
		new DAO<>().borrar("data/pedidos/1/3.ped");
	}

	@Test
	public void test() {
		Pedido pedido=new Pedido(1, cliente);
		assertTrue(instancia.grabar(cliente.getDniCif(), String.valueOf(pedido.getNumero()), pedido));
		assertEquals(pedido.getNumero(), instancia.obtener(cliente.getDniCif(), String.valueOf(pedido.getNumero())).getNumero());
		pedido=new Pedido(2, cliente);
		assertTrue(instancia.grabar(cliente.getDniCif(), String.valueOf(pedido.getNumero()), pedido));
		assertEquals(pedido.getNumero(), instancia.obtener(cliente.getDniCif(), String.valueOf(pedido.getNumero())).getNumero());
		pedido=new Pedido(3, cliente);
		assertTrue(instancia.grabar(cliente.getDniCif(), String.valueOf(pedido.getNumero()), pedido));
		assertEquals(pedido.getNumero(), instancia.obtener(cliente.getDniCif(), String.valueOf(pedido.getNumero())).getNumero());
		assertNotEquals(7, instancia.obtener(cliente.getDniCif(), String.valueOf(pedido.getNumero())).getNumero());
		assertNull(instancia.obtener(cliente.getDniCif(), String.valueOf(7)));
		}

}
