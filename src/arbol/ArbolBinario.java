package arbol;

public class ArbolBinario<E> {

    private Node<E> raiz;

    public ArbolBinario() {
    }

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

    public Node<E> agregarNodo(E dato) {
        if (raiz == null) {
            Node<E> nuevoNodo = new Node<E>(dato);
            raiz = nuevoNodo;
            return raiz;
        } else {
            return agregarNodoRecursivo(raiz, dato);
        }
    }

    private Node<E> agregarNodoRecursivo(Node<E> nodoActual, E dato) {
        Node<E> nuevoNodo = new Node<E>(dato);

        if (nuevoNodo.compareTo(nodoActual) > 0) {
            if (nodoActual.getDerecha() == null) {
                nodoActual.setDerecha(nuevoNodo);
                return nuevoNodo;
            } else {
                return agregarNodoRecursivo(nodoActual.getDerecha(), dato);
            }
        } else if (nuevoNodo.compareTo(nodoActual) < 0) {
            if (nodoActual.getIzquierda() == null) {
                nodoActual.setIzquierda(nuevoNodo);
                return nuevoNodo;
            } else {
                return agregarNodoRecursivo(nodoActual.getIzquierda(), dato);
            }
        } else {
            return null;
        }
    }

    public boolean esVacio() {
        return raiz == null;
    }

    public Node<E> obtenerRaiz() {
        return raiz;
    }

    public Node<E> obtenerIzquierda(Node<E> nodo) {
        return nodo.getIzquierda();
    }

    public Node<E> obtenerDerecha(Node<E> nodo) {
        return nodo.getDerecha();
    }

    public E eliminar(E dato) {
        Node<E> t = new Node<E>(dato);
        if (raiz != null && raiz.compareTo(t) == 0) {
            E eliminado = raiz.getData();
            raiz = null;
            return eliminado;
        }
        return eliminarRecursivo(raiz, dato);
    }

    public E eliminarRecursivo(Node<E> nodoActual, E dato) {
        if (raiz == null) {
            return null;
        } else if (nodoActual.getDerecha() != null && nodoActual.getDerecha().compareTo(new Node <E> (dato)) == 0) {
            E eliminado = nodoActual.getDerecha().getData();
            nodoActual.setDerecha(null);
            return eliminado;
        } else if (nodoActual.getIzquierda() != null && nodoActual.getIzquierda().compareTo(new Node <E> (dato)) == 0) {
            E eliminado = nodoActual.getIzquierda().getData();
            nodoActual.setIzquierda(null);
            return eliminado;
        }
        return eliminarRecursivo(nodoActual, dato);
    }

    public boolean pertenece(E dato) {
        if (raiz != null) {
            return perteneceRecursivo(raiz, dato);
        }
        return false;
    }

    private boolean perteneceRecursivo(Node<E> nodoActual, E dato) {
        Node<E> n = new Node<E>(dato);
        if (nodoActual != null) {
            if (nodoActual.compareTo(n) == 0) {
                return true;
            } else if (nodoActual.getDerecha() != null && nodoActual.getDerecha().compareTo(n) == 0) {
                return true;
            } else {
                if (nodoActual.getIzquierda() != null) {
                    return perteneceRecursivo(nodoActual.getIzquierda(), dato);
                }
            }
        }
        return false;
    }

    public void imprimir(Node<E> n) {
        if (n != null) {
            System.out.println(n.getData());
            imprimir(n.getDerecha());
            imprimir(n.getIzquierda());
        }
    }

    public void imprimirConIndicativo(Node<E> nodo) {
        if (nodo != null) {
            imprimirArbolRecursivo(nodo, "RAÍZ");
        }
    }

    private void imprimirArbolRecursivo(Node<E> nodo, String posicion) {
        if (nodo != null) {
            System.out.println("Nodo " + nodo.getData() + " - " + posicion);
            imprimirArbolRecursivo(nodo.getIzquierda(), "IZQUIERDA");
            imprimirArbolRecursivo(nodo.getDerecha(), "DERECHA");
        }
    }
}
