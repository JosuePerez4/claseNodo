package arbol;

public class Main {
    public static void main(String[] args) {
        ArbolBinario <Integer> ab = new ArbolBinario <Integer>();
        Node <Integer> n1 = ab.agregarNodo(7);
        Node <Integer> n2 = ab.agregarNodo(2);
        Node <Integer> n3 = ab.agregarNodo(4);
        Node <Integer> n4 = ab.agregarNodo(9);
        Node <Integer> n5 = ab.agregarNodo(3);
        Node <Integer> n6 = ab.agregarNodo(1);
        System.out.println("Nodo encontrado: " + ab.buscarNodo(3));
        //System.out.println(ab.pertenece(7));
        System.out.println("Pre orden: " + ab.imprimirPreOrden(n1));
        //System.out.println(ab.obtenerRaiz());
    }
}
