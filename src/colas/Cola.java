package colas;

import LinkedList.LinkedList;

public class Cola <E> {
	
	private LinkedList <E> cola;

	public Cola() {
		this.cola = new LinkedList<E>();
	}

	public LinkedList<E> getCola() {
		return cola;
	}

	public void setCola(LinkedList<E> cola) {
		this.cola = cola;
	}
	
	public void crear () {
		this.cola = new LinkedList<E>();
	}
	
	public void encolar (E element) {
		cola.addFirst(element);
	}
	
	public E desencolar () {
		return cola.removeLast();
	}
	
	public boolean estaVacia () {
		return cola.isEmpty();
	}
	
	public boolean estaLlena () {
		return !cola.isEmpty();
	}
	
	public E primero () {
		return cola.getLastElement();
	}
	
	public E ultimo () {
		return cola.getFirstElement();
	}
	
	public int size () {
		return cola.getSize();
	}
}
