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
	private LinkedList<Vagon> listaTres = new LinkedList<Vagon>();

	/*
	 * public Carrusel() { this.listaUno = new DoubleCircularLinkedList<Vagon>();
	 * this.listaDos = new LinkedList<Vagon>(); this.listaTres = new
	 * LinkedList<Vagon>(); }
	 */

	public DoubleCircularLinkedList<Vagon> getListaUno() {
		return listaUno;
	}

	public void setListaUno(DoubleCircularLinkedList<Vagon> listaUno) {
		this.listaUno = listaUno;
	}

	public LinkedList<Vagon> getListaDos() {
		return listaDos;
	}

	public void setListaDos(LinkedList<Vagon> listaDos) {
		this.listaDos = listaDos;
	}

	public LinkedList<Vagon> getListaTres() {
		return listaTres;
	}

	public void setListaTres(LinkedList<Vagon> listaTres) {
		this.listaTres = listaTres;
	}
	
	// Implementaciones

	public void crearVagon() {
		String id = Integer.toString((int) (Math.random() * 10000000));
		Vagon v = new Vagon(id, true);
		listaDos.add(v);
	}

	/*public void agregarACarrusel(Vagon v) {
		listaUno.add(v);
		v.setDisponible(false);
	}

	public void removerDeCarrusel(Vagon v) {
		listaDos.add(v);
		v.setDisponible(true);
	}*/	

	public void encenderCarrusel(int vueltas) {
		// Se debe de recorrer la lista two y ver su estado
        for (int i = 0; i < listaDos.getSize(); i++) {
            Vagon v = listaDos.removeLast();
            v.setDisponible(false);
            listaUno.add(v);
            i--;
        }
        
        int contador = 0;
        while (contador < vueltas) {
            for (int i = 0; i < listaUno.getSize(); i++) {
                if (listaUno.get(i).getNivelDesgaste() <= 0) {
                    listaUno.get(i).setDisponible(true);
                    listaUno.get(i).setNivelDesgaste(3000);
                    listaDos.add(listaUno.get(i));
                    listaUno.remove(listaUno.get(i));

                } else {

                    int desgasteM = (int) (Math.random() * 1500);
                    int obtenerDesgaste = listaUno.get(i).getNivelDesgaste();
                    Vagon v = listaUno.get(i);
                    v.setNivelDesgaste(obtenerDesgaste - desgasteM);

                }
            }

            contador++;
        }
	}

	public void cerrarParque() {
		// Agrego todos los elementos de la lista uno
		for (int i = 0; i < listaUno.getSize(); i++) {
			if (listaUno.get(i) != null) {
				listaTres.add(listaUno.get(i));
			}
		}

		// Agrego todos los elementos de la lista dos
		for (int j = 0; j < listaDos.getSize(); j++) {
			if (listaDos.get(j) != null) {
				listaTres.add(listaDos.get(j));
			}
		}
	}

	public void imprimirCarrusel() {
		listaUno.print();
	}

	public void imprimirVagonesDisponibles() {
		listaDos.print();
	}
	
	public void imprimirFinalDia () {
		listaTres.print();
	}
}
