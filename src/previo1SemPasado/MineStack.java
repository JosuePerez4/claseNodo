package previo1SemPasado;

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
		lista.addFirst(data);
	}
	
	public E pop () {
		return lista.removeFirst();
	}
	
	public E peek () {
		return lista.getFirstElement();
	}
	
	public void printStack () {
		lista.print();
	}
}
