package arbol;

import pilas.MineStack;

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

    public E obtenerRaiz() {
        return raiz.getData();
    }

    public Node<E> obtenerIzquierda(Node<E> nodo) {
        return nodo.getIzquierda();
    }

    public Node<E> obtenerDerecha(Node<E> nodo) {
        return nodo.getDerecha();
    }

    public boolean buscarNodo(E dato) {
        if (raiz == null) {
            return false;
        }
        return buscarNodoRecursivo(raiz, dato);
    }

    private boolean buscarNodoRecursivo(Node<E> nodoActual, E dato) {
        if (nodoActual == null) {
            return false;
        }

        if (nodoActual.getData().equals(dato)) {
            return true;
        }

        if (buscarNodoRecursivo(nodoActual.getIzquierda(), dato)) {
            return true;
        }

        return buscarNodoRecursivo(nodoActual.getDerecha(), dato);
    }

    public E eliminar(E dato) {
        return eliminarRecursivo(raiz, dato).getData();
    }

    private Node<E> eliminarRecursivo(Node<E> nodoActual, E valor) {
        if (nodoActual == null) {
            // El nodo no existe en el árbol
            return null;
        }
        // Identificar el movimiento de nuestras ramas

        // Si el valor a eliminar es menor al nodo actual (Rama izquierda)
        if (nodoActual.compareTo(new Node<E>(valor)) > 0) {
            // Usando el set y la llamada recursiva con el get de acuerdo a la posicion de
            // la rama
            // garantizamos que se este moviendo correctamente
            nodoActual.setIzquierda(eliminarRecursivo(nodoActual.getIzquierda(), valor));
        } // Si el valor a eliminar es mayor al nodo (Rama derecha)
        else if (nodoActual.compareTo(new Node<E>(valor)) < 0) {
            nodoActual.setDerecha(eliminarRecursivo(nodoActual.getDerecha(), valor));
        } // Una vez que se ha encontrado el nodo, comienza la evaluación de los casos
        else {

            // Caso 1: Sin hijo izquierdo o sin hijos
            if (nodoActual.getIzquierda() == null) {

                return nodoActual.getDerecha();

            } // Caso 2: Sin hijo derecho
            else if (nodoActual.getDerecha() == null) {

                return nodoActual.getIzquierda();

            } // Caso 3: Dos hijos, encontrar sucesor inmediato
            else {

                nodoActual.setData(valorMinimo(nodoActual.getDerecha()));
                // Eliminar el sucesor inmediato en el subárbol derecho
                nodoActual.setDerecha(eliminarRecursivo(nodoActual.getDerecha(), nodoActual.getData()));
            }
        }

        return nodoActual;
    }

    // Encontrar el valor más pequeño en el subárbol
    private E valorMinimo(Node<E> nodo) {
        E min = nodo.getData();
        while (nodo.getIzquierda() != null) {
            min = nodo.getIzquierda().getData();
            nodo = nodo.getIzquierda();
        }
        return min;
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
            } else {
                return perteneceRecursivo(nodoActual.getIzquierda(), dato) ||
                        perteneceRecursivo(nodoActual.getDerecha(), dato);
            }
        }
        return false;
    }

    public String imprimirPreOrden(Node<E> n) {
        if (n == null) {
            return "";
        }
        return n.getData() + " " + imprimirPreOrden(n.getIzquierda()) + imprimirPreOrden(n.getDerecha());
    }

    public String imprimirOrden(Node<E> n) {
        if (n == null) {
            return "";
        }
        return imprimirOrden(n.getIzquierda()) + n.getData() + " " + imprimirOrden(n.getDerecha());
    }

    public String imprimirPostOrden(Node<E> n) {
        if (n == null) {
            return "";
        }
        return imprimirPostOrden(n.getIzquierda()) + imprimirPostOrden(n.getDerecha()) + " " + n.getData();
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