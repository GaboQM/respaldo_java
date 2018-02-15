package fes.aragon.cola;

public class Lista {
	protected Nodo cabeza, cola;

	public Lista() {
		cabeza = cola = null;
	}

	public boolean esVacia() {
	//	System.out.println("Lista vacía");
		return cabeza==null;
		//System.out.prObjectln("Lista vacía");
	}

	public void agregarCabeza(Object dato) {
		cabeza = new Nodo(dato, cabeza);
		if (cola == null) {
			cola = cabeza;
		}

	}
	public int magnitudCola() {
		int magnitud=1;
		if (cabeza != null) {
			for (Nodo temp = cabeza; temp != null; temp = temp.getSiguiente()) {
				magnitud +=1;
			}
		} else {

		}
		return magnitud;
	}

	public void agregarCola(Object dato) {
		if (!esVacia()) {
			cola.setSiguiente(new Nodo(dato));
			cola = cola.getSiguiente();
		} else {
			cabeza = cola = new Nodo(dato);
		}
	}

	public Object eliminarDeCabeza() {
		Object dato = cabeza.getDato();
		if (cabeza == cola) {
			cabeza = cola = null;
		} else {
			cabeza = cabeza.getSiguiente();
		}
		return dato;
	}
	
	  public Object leerCola() { 
	       Object dato = cola.getDato(); 
	        
	        return dato; 
	    } 
	  
	public Object eliminarDeCola() {
		Object dato = cola.getDato();
		if (cabeza == cola) {
			cabeza = cola = null;
		} else {
			Nodo temp;
			for (temp = cabeza; temp.getSiguiente() != cola; temp = temp
					.getSiguiente())
				;
			cola = temp;
			cola.setSiguiente(null);
		}
		return dato;
	}

	public void imprimirTodo() {
		// System.out.prObjectln("ja");
		if (cabeza != null) {
			for (Nodo temp = cabeza; temp != null; temp = temp.getSiguiente()) {
				System.out.print(temp.getDato());
			}
		} else {

		}
	}

	public boolean estaEnLista(Object dato) {
		Nodo temp;
		for (temp = cabeza; temp != null && temp.getDato() != dato; temp = temp
				.getSiguiente());
		System.out.println("esta en lista");
		return temp != null;
	}

	public void borrarTodo() {
		cabeza = cola = null;
		System.out.println("Me borré :P");
		// System.out.prObjectln("Estoy borrado");

	}

	public void borrar(Object dato) {
		if (!esVacia()) {
			if (cabeza == cola && dato == cabeza.getDato()) {
				cabeza = cola = null;
			} else if (dato == cabeza.getDato()) {
				cabeza = cabeza.getSiguiente();
			} else {
				Nodo predesor, temp;
				for (predesor = cabeza, temp = cabeza.getSiguiente(); temp != null
						&& temp.getDato() != dato; predesor = predesor
						.getSiguiente(), temp = temp.getSiguiente())
					;
				if (temp != null) {
					predesor.setSiguiente(temp.getSiguiente());
					if (temp == cola) {
						cola = predesor;
					}
				}
			}
		}
	}

}
