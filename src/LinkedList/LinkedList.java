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
	    Node<E> nuevoNodo = new Node<E>(element);
	    if (head == null) {
	        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
	        head = nuevoNodo;
	    } else {
	        // Si la lista no está vacía, buscamos el último nodo y lo conectamos al nuevo nodo
	        Node<E> actual = head;
	        while (actual.getSiguiente() != null) {
	            actual = actual.getSiguiente();
	        }
	        actual.setSiguiente(nuevoNodo);
	    }

	    size++;
	}

	public void addFirst(E element) {
		Node<E> nuevoNodo = new Node<E>(element);
		nuevoNodo.setSiguiente(head);
		head = nuevoNodo;
		size++;
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

	public E removeFirst() {
		if (head.getSiguiente() == null) {
			E data = head.getDatos();
			head = null;
			size--;
			return data;
		} else {
			E data = head.getDatos();
			head = head.getSiguiente();
			size--;
			return data;
		}
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
			size--;
			return data;
		} else {
			E data = nodoFinal.getDatos();
			anterior.setSiguiente(null);
			size--;
			return data;
		}
	}

	public E getFirstElement() {
		return head.getDatos();
	}

	// Implementaciones para resolver parcial semestre anterior
	public E getLastElement() {
		Node<E> nodoFinal = head;
		while (nodoFinal.getSiguiente() != null) {
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
		System.out.print("[" + actual.getDatos() + "]");
	}

	public void printReverse() {
		printReverseRecursive(head);
	}

	private void printReverseRecursive(Node<E> node) {
		if (node == null) {
	        return;
	    }
	    
	    System.out.print("[" + node.getDatos() + "]");
	    
	    if (node.getSiguiente() != null) {
	        System.out.print("->"); 
	    }
	    
	    printReverseRecursive(node.getSiguiente());
	}
}
