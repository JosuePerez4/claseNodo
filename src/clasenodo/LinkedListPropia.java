/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasenodo;

/**
 *
 * @author estudiante
 */
public class LinkedListPropia {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void add(int valor) {
        if (head == null) {
            Node j = new Node();
            j.setDatos(valor);
            head = j;
        } else {
            Node p = head;
            while (p.getSiguiente() != null) {
                p = p.getSiguiente();
            }
            Node n = new Node();
            n.setDatos(valor);
            p.setSiguiente(n);
        }
    }

    public void addAtPosition(int val, int pos) {
        if (pos < 0) {
            System.out.println("PosiciÃ³n invÃ¡lida");
        } else if (pos == 0) {
            Node j = new Node();
            j.setDatos(val);
            head = j;
        } else {
            Node p = head;
            int pContador = 0;
            while (p.getSiguiente() != null && pContador < pos - 1) {
                pContador++;
                p = p.getSiguiente();
            }
            if (pContador == pos - 1) {
                Node n = new Node();
                n.setDatos(val);
                p.setSiguiente(n);
            }
        }
    }

    public void addBeforeByValue(int val, int valNodo) {
        Node p = head;
        if (head == null) {
            System.out.println("La lista está vacía");
        }
        Node anterior = null;
        while (p != null && p.getDatos() != valNodo) {
            anterior = p;
            p = p.getSiguiente();
        }

        if (p != null && anterior != null) {
            Node n = new Node();
            n.setDatos(val);
            n.setSiguiente(p);
            anterior.setSiguiente(n);

        }
    }

    public void addAfterByValue(int val, int valNodo) {
        Node p = head;
        if (head == null) {
            System.out.println("La lista está vacía");
        }

        while (p != null && p.getDatos() != valNodo) {
            p = p.getSiguiente();
        }
        if (p != null) {
            Node x = new Node();
            x.setDatos(val);
            x.setSiguiente(p.getSiguiente());
            p.setSiguiente(x);
        }
    }

    public void addBeforeByPosition(int val, int nodoBuscado) {
        Node x = new Node();
        int contador = 0;
        Node anterior = null;
        Node p = head;

        if (nodoBuscado < 0) {
            System.out.println("Posicion invalida");
        } else if (head == null) {
            System.out.println("La lista esta vacia");
        }

        while (p.getSiguiente() != null && contador < nodoBuscado - 1) {
            anterior = head;
            contador++;
            p = p.getSiguiente();
        }

        if (contador == 0) {
            x.setSiguiente(head);
            x.setDatos(val);
            head = x;
            return;
        }

        if (contador == nodoBuscado - 1) {
            Node n = new Node();
            n.setDatos(val);
            n.setSiguiente(p);
            anterior.setSiguiente(n);
        } else {
            Node n = new Node();
            n.setDatos(val);
            p.setSiguiente(n);
        }
    }

    public void addAfterByPosition(int val, int nodoBuscado) {
        if (nodoBuscado < 0) {
            System.out.println("Posición inválida");
        } else if (head == null) {
            System.out.println("La lista está vacía");
        } else {
            Node p = head;
            int pContador = 0;
            while (p.getSiguiente() != null && pContador < nodoBuscado) {
                pContador++;
                p = p.getSiguiente();
            }
            if (pContador == nodoBuscado) {
                Node n = new Node();
                n.setDatos(val);
                n.setSiguiente(p.getSiguiente());
                p.setSiguiente(n);
            }
        }
    }

    public void deleteByValue(int valNodo) {
        if (head == null) {
            System.out.println("Lista vacía");
        }
        //En caso de que el nodo a eliminar sea la cabeza
        if (head.getDatos() == valNodo) {
            head = head.getSiguiente();
        }
        Node p = head;
        Node anterior = null;

        while (p != null && p.getDatos() != valNodo) {
            anterior = p;
            p = p.getSiguiente();
        }

        if (p != null) {
            anterior.setSiguiente(p.getSiguiente());
        }
    }

    public void print() {
        Node p = head;
        while (p != null) {
            System.out.println(p.getDatos());
            p = p.getSiguiente();
        }
    }
}
