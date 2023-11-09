package arbol;

public class Main {
    public static void main(String[] args) {
        ArbolBinario <Integer> ab = new ArbolBinario <Integer>();
        Node <Integer> n1 = ab.crearArbol(3, null, null);
        Node <Integer> n2 = ab.crearArbol(5, null, null);
        Node <Integer> n3 = ab.crearArbol(1, null, null);

        Node <Integer> n5 = ab.crearArbol(6, null, null);
        Node <Integer> n6 = ab.crearArbol(9, null, null);
        Node <Integer> n7 = ab.crearArbol(6, n5, n6);

        Node <Integer> n8 = ab.crearArbol(0, n3, n7);

        ab.imprimir(n8);
    }
}
