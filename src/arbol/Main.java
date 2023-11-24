package arbol;

public class Main {
    public static void main(String[] args) {
        ArbolBinario<Integer> ab = new ArbolBinario<Integer>();
        Node<Integer> n1 = ab.agregarNodo(35);
        Node<Integer> n2 = ab.agregarNodo(50);
        Node<Integer> n3 = ab.agregarNodo(8);
        Node<Integer> n4 = ab.agregarNodo(12);
        Node<Integer> n5 = ab.agregarNodo(69);
        Node<Integer> n6 = ab.agregarNodo(84);
        Node<Integer> n7 = ab.agregarNodo(25);
        Node<Integer> n8 = ab.agregarNodo(75);
        Node<Integer> n9 = ab.agregarNodo(93);
        Node<Integer> n10 = ab.agregarNodo(16);
        // System.out.println("Nodo eliminado: " + ab.eliminar(3));
        System.out.print("¿Pertenece? ");
        if(ab.pertenece(35)){
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }
        System.out.println("PreOrden: " + ab.imprimirPreOrden(n1));
        System.out.println("Orden: " + ab.imprimirOrden(n1));
        System.out.println("PostOrden: " + ab.imprimirPostOrden(n1));
        System.out.println("Raíz: " + ab.obtenerRaiz());
    }
}
