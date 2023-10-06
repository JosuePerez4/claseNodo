package DoubleCircularLinkedList;

public class DoubleCircularLinkedListMain {

	public static void main(String[] args) {
		DoubleCircularLinkedList<Integer> listaDoble = new DoubleCircularLinkedList<Integer>();
		listaDoble.add(2);
		listaDoble.add(345);
		listaDoble.add(894);
		listaDoble.addAfter(345, 500);
		listaDoble.addAfter(768, 450);
		//listaDoble.remove(2);
		listaDoble.print();
		listaDoble.printReverse();
		listaDoble.printAll(6);
	}

}
