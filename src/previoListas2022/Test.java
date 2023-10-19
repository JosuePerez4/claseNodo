package previoListas2022;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumaListas<Float> suma = new sumaListas<>();
		// Agregamos nodos a la lista 1
		suma.agregarALista1();
		suma.agregarALista1();
		suma.agregarALista1();
		// Agregamos nodos a la lista 2
		suma.agregarALista2();
		suma.agregarALista2();
		// Agregamos nodos a la lista 3
		suma.agregarALista3();
		suma.agregarALista3();

		System.out.println("Sumatoria de las 3 listas por posiciones: ");
		suma.sumarListasUnoAUno().print();

	}

}
