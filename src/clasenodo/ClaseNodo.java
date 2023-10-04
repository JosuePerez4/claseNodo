package clasenodo;

public class ClaseNodo {
    public static void main(String[] args) {
        LinkedListPropia l = new LinkedListPropia();
        l.addAtPosition(78, 0);
        l.addAtPosition(566, 1);
        l.add(688);
        l.add(763);
        l.add(243);
        l.addBeforeByValue(654, 763);
        l.addAfterByValue(546, 763);
        l.deleteByValue(243);
        l.print();
        
        System.out.println("------------------------------------");
        
        DoubleLinkedList list = new DoubleLinkedList();
        list.addAtPosition(123, 0);
        list.addAtPosition(433, 1);
        list.addAtPosition(67834783, 2);
        list.print();
    }
    
}
