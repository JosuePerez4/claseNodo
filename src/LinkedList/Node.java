package LinkedList;

/**
 *
 * @author estudiante
 */
public class Node <E> implements Comparable<Node<E>>{
    
    private E datos;
    private Node <E> siguiente;
    
    public Node (E datos) {
    	this.datos = datos;
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

	@Override
    public int compareTo(Node <E> otroNodo) {
        if((Integer) this.datos > (Integer) otroNodo.getDatos()){
            return 1;
        } else if ((Integer) this.datos < (Integer) otroNodo.getDatos()){
            return -1;
        } else {
            return 0;
        }
    }
    
}
