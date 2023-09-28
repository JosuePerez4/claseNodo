package clasenodo;

public class ClaseNodo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.addAtPosition(78, 0);
        l.addAtPosition(566, 1);
        l.add(688);
        l.add(763);
        l.add(243);
        l.addBeforeByValue(654, 763);
        l.addAfterByValue(546, 763);
        l.delete(243);
        l.print();
    }
    
}
