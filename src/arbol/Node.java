package arbol;

public class Node <E> implements Comparable <Node <E>>{
    private E data;
    private Node<E> derecha, izquierda;

    public Node() {
    }

    public Node(E data) {
        this.data = data;
    }

    public Node(E e, Node <E> derecha, Node <E> izquierda) {
        this.data = e;
        this.derecha = derecha;
        this.izquierda = izquierda;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
    
    public Node<E> getDerecha() {
        return derecha;
    }

    public void setDerecha(Node<E> derecha) {
        this.derecha = derecha;
    }

    public Node<E> getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Node<E> izquierda) {
        this.izquierda = izquierda;
    }

    @Override
    public String toString() {
        return "Node: data=" + getData() + ", derecha=" + getDerecha() + ", izquierda=" + getIzquierda();
    }

    @Override
    public int compareTo(Node <E> otroNodo) {
        if((Integer) this.data > (Integer) otroNodo.getData()){
            return 1;
        } else if ((Integer) this.data < (Integer) otroNodo.getData()){
            return -1;
        } else {
            return 0;
        }
    }
}