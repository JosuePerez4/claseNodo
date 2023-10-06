package SimpleCircularLinkedList;

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
	
	
}
