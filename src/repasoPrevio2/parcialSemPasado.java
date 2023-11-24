package repasoPrevio2;

public class parcialSemPasado<E> {

    private Node<E> head;

    // Parcial final semestre pasado (Repaso)

    /*
     * (4 puntos) Método recursivo que inserte un nodo de tipo entero en una lista
     * doble enlazada ordenada de
     * menor a mayor. Siempre se insertará un valor mayor, aunque no necesariamente,
     * un valor mayor a todos.
     * Ejemplo, se inserta el 10, luego se inserta el 15, luego se inserta el 13,
     * etc. Nunca se insertará un valor
     * menor al primer valor insertado. Se propone la firma de método, pero el
     * estudiante puede cambiarla.
     */

    /*
     * (1 punto) Método recursivo que imprima la lista desde la cabeza hasta la
     * cola. Se propone la firma de
     * método, pero el estudiante puede cambiarla.
     */

    public void insertarNodo(int valorNodo, Node<E> apuntador) {
        if (apuntador == null) {
            head = new Node<E>(valorNodo);
        }
        insertarNodoRecursivo(valorNodo, apuntador);
    }

    private void insertarNodoRecursivo(int valorNodo, Node<E> apuntador) {
        if (apuntador == null || apuntador.getSiguiente() == null || valorNodo > apuntador.getSiguiente().getDatos()) {
            Node<E> nuevoNode = new Node<E>(valorNodo);

            if (apuntador == null) {
                nuevoNode.setSiguiente(null);
            } else {
                nuevoNode.setSiguiente(apuntador.getSiguiente());
            }

            nuevoNode.setAnterior(apuntador);

            if (apuntador != null && apuntador.getSiguiente() != null) {
                apuntador.getSiguiente().setAnterior(nuevoNode);
            }

            if (apuntador != null) {
                apuntador.setSiguiente(nuevoNode);
            }
        } else {
            insertarNodoRecursivo(valorNodo, apuntador.getSiguiente());
        }
    }

    public void printList(Node<E> apuntador, boolean primeraVez) {
        if (apuntador != null) {
            if (primeraVez) {
                System.out.println("Lista: ");
            }
            System.out.println(apuntador.getDatos() + " ");
            printList(apuntador.getSiguiente(), primeraVez);
        } else {
            System.out.println();
        }
    }

    public void printList1() {
        Node<E> actual = head;

        if (actual != null) {
            System.out.print(actual.getDatos() + " ");
        } else {
            System.out.println(); // Salto de línea al final para mejorar la presentación.
        }
    }
}