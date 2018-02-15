package fes.aragon.cola;

public interface Cola<E> {
	

	void borrar();

	boolean estaVacia();

	void insertar(E dato);

	E extraer();


	E primerElemento();
	void imprimirTodo();

	int verTamano();

}
