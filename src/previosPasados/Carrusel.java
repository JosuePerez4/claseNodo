package previosPasados;

import DoubleCircularLinkedList.DoubleCircularLinkedList;
import LinkedList.LinkedList;

public class Carrusel<E> {

	// Para conectar los vagones del carrusel y los no disponibles = que están
	// en el carrusel
	private DoubleCircularLinkedList<Vagon> listaUno = new DoubleCircularLinkedList<Vagon>();
	// Para mantener los vagones no conectados o disponibles = significa que se
	// pueden
	// incorporar al carrusel
	private LinkedList<Vagon> listaDos = new LinkedList<Vagon>();
	// Para dar resultados finales
	private LinkedList <Vagon> listaTres = new LinkedList<Vagon>();

	public void crearVagon() {
		String id = Integer.toString((int) (Math.random() * 10000000));
		Vagon v = new Vagon(id);
		listaDos.add(v);
	}

	public void moverVagon(Vagon v, int indice) {

		for (int i = 0; i < listaDos.getSize(); i++) {
			if (listaDos.get(i).equals(v) && v.isDisponible() != true) {

			}
		}

		/*
		 * if(v.isDisponible() != true) { for(int i=0; i<listaDos.getSize();i++) { for
		 * (int j = 0; j < listaUno.getSize(); j++) {
		 * 
		 * } } }
		 */
	}

	public void agregarAlCarrusel(Vagon v) {
		// Su nueva disponibilidad ahora será falsa
		if (v != null) {
			v.setDisponible(false);
		}
		// Recorremos las listas para poder sacar el vehículo de una,
		// para ingresarla en la otra
		for (int i = 0; i < listaDos.getSize(); i++) {
			for (int j = 0; j < listaUno.getSize(); j++) {
				if (listaDos.get(i) != null && listaDos.get(i).equals(v) && v.isDisponible() != true) {
					listaUno.add(listaDos.get(i));
					listaDos.removeByPosition(i);
				}
			}
		}
	}
	
	public void removerDelCarrusel (Vagon v) {
		for (int i = 0; i < listaUno.getSize(); i++) {
			for (int j = 0; j < listaDos.getSize(); j++) {
				if (listaUno.get(i) != null && listaUno.get(i).equals(v) && v.isDisponible()) {
					listaDos.add(listaUno.get(i));
					listaUno.removeByPosition(i);
				}
			}
		}
	}
}
