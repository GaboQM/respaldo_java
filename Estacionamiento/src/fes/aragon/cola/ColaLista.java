package fes.aragon.cola;

public class ColaLista<E>implements Cola<E> {
	Lista lista=new Lista();
	@Override
	public void borrar() {
		lista.borrarTodo();
		
	}

	@Override
	public boolean estaVacia() {
		// TODO Auto-generated method stub
		return lista.esVacia();
	}

	@Override
	public void insertar(E dato) {
		lista.agregarCabeza(dato);
		
	}

	@Override
	public E extraer() {
		// TODO Auto-generated method stub
		return (E) lista.eliminarDeCola();
	}

	@Override
	public E primerElemento() {
		// TODO Auto-generated method stub
		return (E)lista.leerCola();
	}
	@Override
	public void imprimirTodo(){
		lista.imprimirTodo();
	}
	@Override
	public int verTamano(){
		
		return lista.magnitudCola();
		
	}
}
