package SimpleCircularLinkedList;

import DoubleCircularLinkedList.Node;

public class LinkedListSimpleCircular <E> {
	
	private Node <E> head;
	private int size = 0;
	
	public Node<E> getHead() {
		return head;
	}
	public void setHead(Node<E> head) {
		this.head = head;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public void add (E element) {
		if(head == null) {
			Node <E> nuevoNodo = new Node<E>(element);
			head = nuevoNodo;
			size++;
		} else {
			Node <E> actual = head;
			while(actual.getSiguiente() != head) {
				actual = actual.getSiguiente();
			}
			Node <E> nuevoNodo = new Node<E>(element);
			actual.setSiguiente(nuevoNodo);
			nuevoNodo.setSiguiente(head);
			size++;
		}
	}
	
	public void remove (E element) {
		// 1) Si el elemento a borrar está en la cabeza
		if (head != null && head.getDatos().equals(element)) {
			if (size == 1) {
				head = null;
			} else {
				Node<E> anterior = head.getAnterior();
				Node<E> siguiente = head.getSiguiente();
				anterior.setSiguiente(siguiente);
				siguiente.setAnterior(anterior);
				head = head.getSiguiente();
			}
			size--;
			return;
		}

		// -------------------------------------------

		// 2) Si el elemento a borrar está en la mitad o al final de la cola

		Node<E> actual = head;
		while (actual != null) {
			if (actual.getDatos().equals(element)) {
				Node<E> anterior = actual.getAnterior();
				Node<E> siguiente = actual.getSiguiente();

				anterior.setSiguiente(siguiente);
				siguiente.setAnterior(anterior);

				size--;
				return;
			}
			actual = actual.getSiguiente();
		}
	}
	
	
}
