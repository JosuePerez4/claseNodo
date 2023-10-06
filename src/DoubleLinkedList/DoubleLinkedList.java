package DoubleLinkedList;

public class DoubleLinkedList<E> {

	private Node<E> head;
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

	public void add(E element) {
		if (head == null) {
			Node<E> nuevoNodo = new Node<E>(element);
			head = nuevoNodo;
			size++;
			return;
		}
		Node<E> actual = head;
		while (actual.getSiguiente() != null) {
			actual = actual.getSiguiente();
		}
		Node<E> nuevoNodo = new Node<E>(element);
		actual.setSiguiente(nuevoNodo);
		nuevoNodo.setAnterior(actual);
		size++;
		return;
	}

	public void addAfter(E elementToFind, E elementToAdd) {
		// Caso en el que hay que agregar después de la cabeza
		if (head != null && head.getDatos().equals(elementToFind)) {
			Node<E> nuevoNodo = new Node<E>(elementToAdd);
			nuevoNodo.setSiguiente(head.getSiguiente());
			nuevoNodo.setAnterior(head);
			head.setSiguiente(nuevoNodo);
			size++;
			return;
		}
		// Consideramos caso de añadir en medio de la lista
		Node<E> actual = head;
		while (actual != null) {
			if (actual.getDatos().equals(elementToFind)) {
				Node<E> nuevoNodo = new Node<E>(elementToAdd);
				if (actual.getSiguiente() == null) {
					nuevoNodo.setAnterior(actual);
					actual.setSiguiente(nuevoNodo);
					size++;
				} else {
					nuevoNodo.setSiguiente(actual.getSiguiente());
					nuevoNodo.setAnterior(actual);
					actual.setSiguiente(nuevoNodo);
					size++;
				}
			}
			actual = actual.getSiguiente();
		}
	}

	public void addAtEnd(E element) {
		Node<E> actual = head;
		while(actual != null) {
			actual = actual.getSiguiente();
		}
		
		Node <E> nuevoNodo = new Node<E>(element);
		nuevoNodo.setAnterior(actual);
		size++;
	}

	public void addFirst(E element) {
		Node <E> nuevoNodo = new Node<E>(element);
		
		nuevoNodo.setSiguiente(head);
		head.setAnterior(nuevoNodo);
		head = nuevoNodo;
		size++;
	}

	public void addAtPosition(E element, int pos) {
	}

	public E remove(E element) {
		
		// Si el q deseamos remover es la cabeza
		if (head != null && head.getDatos().equals(element)) {
			E datos = head.getDatos();
			head = head.getSiguiente();
			size--;
			return datos;
		}
		// Si el q deseamos remover está en el medio
		Node<E> actual = head;
		while (actual != null) {
			if (actual.getDatos().equals(element)) {
				E datos = actual.getDatos();
				Node<E> sig = actual.getSiguiente();
				Node<E> ant = actual.getAnterior();
				// Caso de eliminar la cola
				if (actual.getSiguiente() == null) {
					ant.setSiguiente(null);
					return datos;
				}
				sig.setAnterior(ant);
				ant.setSiguiente(sig);
				return datos;
			}
			actual = actual.getSiguiente();
		}
		return null;
	}

	public void print() {
		if (head == null) {
			System.out.println("Lista vacía");
			return;
		}
		Node<E> actual = head;
		while (actual.getSiguiente() != null) {
			System.out.print("[" + actual.getDatos() + "]" + "->");
			actual = actual.getSiguiente();
		}
		System.out.println("[" + actual.getDatos() + "]");
	}
}
