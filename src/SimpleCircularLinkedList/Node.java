package SimpleCircularLinkedList;

/**
 *
 * @author estudiante
 */
public class Node <E> {
    
    private E datos;
    private Node <E> siguiente;
    
    public Node (E ele) {
    	datos = ele;
    }

	public E getDatos() {
		return datos;
	}

	public void setDatos(E datos) {
		this.datos = datos;
	}

	public Node<E> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Node<E> siguiente) {
		this.siguiente = siguiente;
	}
    
}
