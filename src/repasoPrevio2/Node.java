package repasoPrevio2;

public class Node <E> {
    
    private int datos;
    private Node <E> siguiente;
    private Node <E> anterior;
    
    public Node (int datos) {
    	this.datos = datos;
    }

	public int getDatos() {
		return datos;
	}

	public void setDatos(int datos) {
		this.datos = datos;
	}

	public Node<E> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Node<E> siguiente) {
		this.siguiente = siguiente;
	}

    public Node<E> getAnterior() {
        return anterior;
    }

    public void setAnterior(Node<E> anterior) {
        this.anterior = anterior;
    }
    
}
