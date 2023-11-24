package repasoPrevio2;

public class mainPrevioPasado {
    public static <E> void main(String[] args) {
        parcialSemPasado <Integer> lista = new parcialSemPasado<Integer>();
        lista.insertarNodo(10, null);
        lista.insertarNodo(15, null);
        lista.insertarNodo(13, null);
        lista.insertarNodo(16, null);
        lista.printList1();
    }
}
