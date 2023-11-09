package arbol;

public class ArbolBinario<E> {

    private Node<E> raiz;

    public ArbolBinario(Node<E> raiz) {
        this.raiz = raiz;
    }

    public Node<E> getRaiz() {
        return raiz;
    }

    public void setRaiz(Node<E> raiz) {
        this.raiz = raiz;
    }

    public Node<E> crearArbol(E e, Node<E> derecha, Node<E> izquierda) {
        return raiz = new Node<E>(e, derecha, izquierda);
    }

    public void imprimir(Node<E> n) {
        if (n != null) {
            System.out.println(n.getData());
            imprimir(n.getDerecha());
            imprimir(n.getIzquierda());
        }
    }

}
