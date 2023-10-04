package clasenodo;

public class DoubleLinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public void addAtEnd(int nodo) {
		Node p = head;
		while (p.getSiguiente() != null) {
			p = p.getSiguiente();
		}
		Node j = new Node();
		j.setDatos(nodo);
		p.setSiguiente(j);
		// j.setAnterior(p);
	}

	public void addFirst(int nodo) {
		Node p = head;
		Node x = new Node();
		head = x;
		x.setDatos(nodo);
		x.setSiguiente(p);
		// p.setAnterior(x);
	}

	public void addAtPosition(int val, int pos) {
		if (pos < 0) {
			System.out.println("Posición inválida");
		} else if (pos == 0) {
			Node j = new Node();
			j.setDatos(val);
			head = j;
		} else {
			Node p = head;
            int pContador = 0;
            while(p.getSiguiente() != null && pContador < pos -1) {
            pContador++;
            p = p.getSiguiente();
            }
            if(pContador == pos-1) {
            	Node n = new Node();
                n.setDatos(val);
                p.setSiguiente(n);
                //n.setAnterior(p);
            }
		}
	}
	
	public void print () {
		Node p = head;
		while(p.getSiguiente() != head) {
			System.out.println(p.getDatos());
			p = p.getSiguiente();
		}
	}

}
