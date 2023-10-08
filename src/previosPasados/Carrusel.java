package previosPasados;

import DoubleCircularLinkedList.DoubleCircularLinkedList;
import LinkedList.LinkedList;
import previosPasados.Vagon;

public class Carrusel<E> {

	// Para conectar los vagones del carrusel y los no disponibles = que están
	// en el carrusel
	private DoubleCircularLinkedList<Vagon> listaUno = new DoubleCircularLinkedList<Vagon>();
	// Para mantener los vagones no conectados o disponibles = significa que se
	// pueden
	// incorporar al carrusel
	private LinkedList<Vagon> listaDos = new LinkedList<Vagon>();

	public void agregarVagon(Vagon v) {
		listaDos.add(v);
	}
	
	public void conectarVagon (Vagon v) {
		
	}
}
