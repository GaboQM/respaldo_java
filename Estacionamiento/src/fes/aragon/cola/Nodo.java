package fes.aragon.cola;

public class Nodo {
	private Object dato;
	private Nodo siguiente;

	public Nodo(Object dato2) {
		this(dato2, null);
	}

	public Nodo(Object dato2, Nodo siguiente) {
		this.dato = dato2;
		this.siguiente = siguiente;
	}

	public Object getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

}
