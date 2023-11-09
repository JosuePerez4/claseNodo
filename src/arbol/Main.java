package arbol;

public class Main {
    public static void main(String[] args) {
        ArbolBinario <Integer> ab = new ArbolBinario <Integer>();
        Node n1 = ab.agregarNodo(7);
        Node n2 = ab.agregarNodo(2);
        Node n3 = ab.agregarNodo(4);
        Node n4 = ab.agregarNodo(9);
        Node n5 = ab.agregarNodo(3);
        Node n6 = ab.agregarNodo(1);
        Node n7 = ab.eliminar(7);
        //System.out.println(n7);
        ab.imprimir(n1);
        System.out.println(ab.obtenerRaiz());
    }
}
