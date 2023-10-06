package primerPrevioPilasImplementacion;

import LinkedList.LinkedList;

public class MineStack<E> {

	private LinkedList<E> lista = new LinkedList<>();

	public LinkedList<E> getLista() {
		return lista;
	}

	public void setLista(LinkedList<E> lista) {
		this.lista = lista;
	}

	public void push(E data) {
		lista.add(data);
	}
	
	public E pop () {
		return lista.removeLast();
	}
	
	public E peek () {
		return lista.lastElement();
	}
	
	public void printStack () {
		lista.print();
	}
}
