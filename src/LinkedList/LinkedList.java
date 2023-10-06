package LinkedList;

public class LinkedList<E> {
	private Node<E> head;
	private int size;

	public LinkedList() {
		this.head = null;
		this.size = 0;
	}

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
		} else {
			Node<E> actual = head;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			Node<E> nuevoNodo = new Node<E>(element);
			actual.setSiguiente(nuevoNodo);
			size++;
		}
	}
	
	public void addFirst () {
		
	}

	public void addAtPosition(int val, int pos) {
	}

	public void addBeforeByValue(int val, int valNodo) {
	}

	public void addAfterByValue(int val, int valNodo) {
	}

	public void addBeforeByPosition(int val, int nodoBuscado) {
	}

	public void addAfterByPosition(int val, int nodoBuscado) {
	}

	public void deleteByValue(int valNodo) {
	}

	// Implementaciones para resolver parcial semestre anterior
	public E removeLast() {
		if (head == null) {
			System.out.println("Pila vacía");
			return null;
		}

		Node<E> nodoFinal = head;
		Node<E> anterior = null;
		while (nodoFinal.getSiguiente() != null) {
			anterior = nodoFinal;
			nodoFinal = nodoFinal.getSiguiente();
		}

		if (nodoFinal == head) {
			E data = head.getDatos();
			head = null;
			return data;
		} else {
			E data = nodoFinal.getDatos();
			anterior.setSiguiente(null);
			return data;
		}
	}
	
	// Implementaciones para resolver parcial semestre anterior
	public E lastElement () {
		Node <E> nodoFinal = head;
		while(nodoFinal.getSiguiente() != null) {
			nodoFinal = nodoFinal.getSiguiente();
		}
		return nodoFinal.getDatos();
	}

	public void print() {

		if (this.head == null) {
			System.out.print("[Null]");
			return;
		}

		Node<E> actual = this.head;
		while (actual.getSiguiente() != null) {
			System.out.print("[" + actual.getDatos() + "]" + "->");
			actual = actual.getSiguiente();
		}
		System.out.println("[" + actual.getDatos() + "]");
	}
}
