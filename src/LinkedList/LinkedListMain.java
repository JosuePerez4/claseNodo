package LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList <Integer> l = new LinkedList <Integer>();
		l.add(1);
		l.add(2);
		l.add(8);
		l.add(5);
		l.add(0);
		l.add(9);
		l.add(17);
		System.out.println("primera impresión d la pila");
		l.print();
		//System.out.println("Impresión reversa: ");
		//l.printReverse();
		//System.out.println("");
		//l.addDespuesDeDos(8, 0);
		System.out.println();
		System.out.println("segunda impresión d la pila, en orden ascendente");
		l.ordenarAscendente();
		l.print();
		//System.out.println();
		//System.out.println("segunda impresión d la pila, en orden descendiente");
		//l.ordenarDescendiente();
		//l.print();
		System.out.println();
		System.out.println("Prueba de búsqueda binaria");
		System.out.println(l.busquedaBinaria(l, 9));
		//l.limpiar();
		//System.out.println();
		//System.out.println("Impresión de limpiar la cola");
		//l.print();
	}
}
