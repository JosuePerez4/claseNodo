package previoListas2022;

import LinkedList.LinkedList;

public class sumaListas<E> {

	private LinkedList<Float> lista1;
	private LinkedList<Float> lista2;
	private LinkedList<Float> lista3;

	public sumaListas() {
		this.lista1 = new LinkedList<>();
		this.lista2 = new LinkedList<>();
		this.lista3 = new LinkedList<>();
	}

	public LinkedList<Float> getLista1() {
		return lista1;
	}

	public void setLista1(LinkedList<Float> lista1) {
		this.lista1 = lista1;
	}

	public LinkedList<Float> getLista2() {
		return lista2;
	}

	public void setLista2(LinkedList<Float> lista2) {
		this.lista2 = lista2;
	}

	public LinkedList<Float> getLista3() {
		return lista3;
	}

	public void setLista3(LinkedList<Float> lista3) {
		this.lista3 = lista3;
	}

	public void agregarALista1() {
		float number = (int) (Math.random() * 10);

		lista1.add(number);
	}

	public void agregarALista2() {
		float number = (int) (Math.random() * 10);
		lista2.add(number);
	}

	public void agregarALista3() {
		float number = (int) (Math.random() * 10);
		lista3.add(number);
	}

	public LinkedList<Float> sumarListasUnoAUno() {
		LinkedList<Float> sumatoria = new LinkedList<Float>();
		int longitud = determinarLongitudMaxima(lista1.getSize(), lista2.getSize(), lista3.getSize());
		for (int x = 0; x < longitud; x++) {
			float suma = 0;
			if (x < lista1.getSize()) {
				suma += lista1.get(x);
			}
			if (x < lista2.getSize()) {
				suma += lista2.get(x);
			}
			if (x < lista3.getSize()) {
				suma += lista3.get(x);
			}
			sumatoria.add(suma);
		}
		return sumatoria;
	}

	private int determinarLongitudMaxima(int l1, int l2, int l3) {
		if (l1 >= l2 && l1 >= l3) {
			return l1;
		} else if (l2 >= l1 && l2 >= l3) {
			return l2;
		} else {
			return l3;
		}
	}
}
