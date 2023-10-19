package LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList <Integer> l = new LinkedList <Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println("primera impresión d la pila");
		l.print();
		l.addDespuesDeDos(8, 0);
		System.out.println();
		System.out.println("segunda impresión d la pila");
		l.print();
		l.limpiar();
		System.out.println();
		System.out.println("Impresión de limpiar la cola");
		l.print();
	}

}
