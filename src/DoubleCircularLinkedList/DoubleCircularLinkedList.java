package DoubleCircularLinkedList;

public class DoubleCircularLinkedList<E> {

	private Node<E> head;
	private int size = 0;
	

	public DoubleCircularLinkedList() {
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
		// Consideramos el caso en el qué no haya cabeza
		if (this.head == null) {
			Node<E> x = new Node<E>(element);
			x.setSiguiente(x);
			x.setAnterior(x);
			this.head = x;
			size++;
			return;
		}
		// Ahora el caso para buscar el nodo que no tiene un siguiente, y ahí agregar
		// nuestro nuevo nodo
		Node<E> actual = this.head;
		while (actual.getSiguiente() != this.head) {
			actual = actual.getSiguiente();
		}
		// Cuándo lo encontramos, agregamos y relacionamos el actual con el nuevo y el
		// nuevo con el actual
		// y el nuevo con la cabeza y así
		Node<E> nuevoNodo = new Node<E>(element);
		actual.setSiguiente(nuevoNodo);
		nuevoNodo.setAnterior(actual);
		nuevoNodo.setSiguiente(this.head);
		this.head.setAnterior(nuevoNodo);
		size++;
		return;
	}
	
	public void addBefore(E elementToFind, E elementToAdd) {
		Node<E> actual = head;
		if (actual != null && actual.getDatos().equals(elementToFind)) {
			Node<E> nuevoNodo = new Node<E>(elementToAdd);
			nuevoNodo.setSiguiente(actual);
			actual.setAnterior(nuevoNodo);
			head = nuevoNodo;
			size++;
			return;
		}

		while (actual != null) {
			if (actual.getDatos().equals(elementToFind)) {
				Node<E> nuevoNodo = new Node<E>(elementToAdd);
				nuevoNodo.setSiguiente(actual);
				nuevoNodo.setAnterior(actual.getAnterior());
				actual.getAnterior().setSiguiente(nuevoNodo);
				actual.setAnterior(nuevoNodo);
				size++;
				return;
			}
			actual = actual.getSiguiente();
		}
	}

	public void addAfter(E elementToFind, E elementToAdd) {
		// caso de que se desee agregar después de la cabeza
		if (head != null) {
			if (head.getDatos().equals(elementToFind)) {
				Node<E> nuevoNodo = new Node<E>(elementToAdd);
				nuevoNodo.setSiguiente(head.getSiguiente());
				nuevoNodo.setAnterior(head);
				head.setSiguiente(nuevoNodo);
				size++;
				return;
			}
		}
		
		Node<E> actual = head;
		while (actual.getSiguiente() != head && actual != null) {
			if (actual.getDatos().equals(elementToFind)) {
				Node<E> nuevoNodo = new Node<E>(elementToAdd);
				nuevoNodo.setAnterior(actual);
				nuevoNodo.setSiguiente(actual.getSiguiente());
				actual.setSiguiente(nuevoNodo);
				size++;
				return;
			}
			actual = actual.getSiguiente();
		}
		System.out.println("El elemento a buscar no está en la lista");
	}

	public void remove(E element) {
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

	public E removeAfter(E elementToFind) {
		Node<E> actual = head;
		if (head != null && head.getDatos().equals(elementToFind)) {
			if (actual.getSiguiente() != null) {
				Node<E> nodoARemover = actual.getSiguiente();
				actual.setSiguiente(nodoARemover.getSiguiente());
				if (nodoARemover.getSiguiente() != null) {
					nodoARemover.getSiguiente().setAnterior(actual);
				}
				size--;
				return nodoARemover.getDatos();
			} else {
				return null;
			}
		}
		while (actual != null) {
			if (actual.getDatos().equals(elementToFind)) {
				Node<E> nodoARemover = actual.getSiguiente();
				if (nodoARemover != null) {
					actual.setSiguiente(nodoARemover.getSiguiente());
					if (nodoARemover.getSiguiente() != null) {
						nodoARemover.getSiguiente().setSiguiente(actual);
					}
					size--;
					return nodoARemover.getDatos();
				}
			}
			actual = actual.getSiguiente();
		}
		return null;
	}

	public E removeBefore(E elementToFind) {
		Node<E> actual = head;
		if (actual != null && actual.getDatos().equals(elementToFind)) {
			System.out.println("No existe un elemento antes de la cabeza el cual eliminar");
		}

		while (actual != null) {
			if (actual.getDatos().equals(elementToFind)) {
				Node<E> nodoARemover = actual.getAnterior();
				if (nodoARemover != null) {
					actual.setAnterior(nodoARemover.getAnterior());
				}
				nodoARemover.getAnterior().setSiguiente(actual);
				size--;
				return nodoARemover.getDatos();
			}
			actual = actual.getSiguiente();
		}
		return null;
	}

	public void updateNode(E newElement, E oldElement) {

		Node<E> actual = head;
		if (head != null && actual.getDatos().equals(oldElement)) {
			head.setDatos(newElement);
		}

		while (actual != null) {
			if (actual.getDatos().equals(oldElement)) {
				actual.setDatos(newElement);
				return;
			}
			actual = actual.getSiguiente();
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("Lista vacía");
			return;
		}
		Node<E> actual = head;
		while (actual.getSiguiente() != head) {
			System.out.print("[" + actual.getDatos() + "]" + "->");
			actual = actual.getSiguiente();
		}
		System.out.println("[" + actual.getDatos() + "]");
	}

	public void printReverse() {
		if (head == null) {
			System.out.println("Lista vacía");
			return;
		}

		Node<E> actual = head.getAnterior();
		while (actual != head) {
			System.out.print("[" + actual.getDatos() + "]" + "->");
			actual = actual.getAnterior();
		}

		System.out.println("[" + actual.getDatos() + "]");
	}

	public void printAll(int times) {

		if (head == null) {
			System.out.println("Lista vacía");
			return;
		}

		StringBuffer sb = new StringBuffer("[");

		Node<E> actual = this.head;
		for (int i = 0; i < times; i++) {
			sb.append(actual.getDatos());
			actual = actual.getSiguiente();
			if (i == times - 1) {
				sb.append("]");
			}
			if (actual != null && i < times - 1) {
				sb.append(", ");
			}

		}

		System.out.println(sb.toString());
	}
}
