package almacen;

import java.util.AbstractList;

/**
 * 
 * @author estar
 *
 *Cuando en un fichero hemos almacenado un solo elemento y es una Lis
 * @param <T>
 */
public class AlmacenIndividualList<T> {

	private AbstractList<T> list;
	private String path;
	private DAO<AbstractList<T>> dao;

	public AlmacenIndividualList(AbstractList<T> list, String path) {
		super();
		assert list!=null&& path!=null;
		this.list = list;
		this.path = path;
		dao = new DAO<AbstractList<T>>();
	}

	/**
	 * Obtiene un objeto de una lista
	 * @param index
	 * @return
	 */
	public T obtener(int index) {
		getList();
		T retorno = null;
		if (index < list.size()) {
			retorno = list.get(index);
		}
		return retorno;

	}

	/**
	 * Graba un objeto en la lista
	 * @param t
	 * @return
	 */
	public boolean grabar(T t) {
		assert t!=null;
		boolean retorno = false;
		getList();
		if (list.add(t) && dao.grabar(path, list)) {
			retorno = true;
		}
		getList();
		return retorno;
	}

	/**
	 * Te devuelve una lista
	 */
	private void getList() {
		AbstractList<T> temporal = dao.leer(path);
		if (temporal == null) {
			dao.grabar(path, list);
		} else {
			list = temporal;
		}
	}
}
