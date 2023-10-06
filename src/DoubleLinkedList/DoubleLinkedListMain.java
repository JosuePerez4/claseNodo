package DoubleLinkedList;

public class DoubleLinkedListMain {

	public static void main(String[] args) {
		DoubleLinkedList<Integer> l = new DoubleLinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.addAfter(1, 6);
		l.addAfter(3, 7);
		l.addAfter(4, 8);
		l.addFirst(10);
		l.addFirst(15);
		//System.out.println(l.remove(3));
		l.print();
		//System.out.println(l.remove(4));
		//l.print();
	}

}
