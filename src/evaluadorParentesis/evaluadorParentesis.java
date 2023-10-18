package evaluadorParentesis;

import pilas.MineStack;

public class evaluadorParentesis<E> {

	private MineStack<Character> pila;

	public evaluadorParentesis() {
		this.pila = new MineStack<>();
	}

	public MineStack<Character> getPila() {
		return pila;
	}

	public void setPila(MineStack<Character> pila) {
		this.pila = pila;
	}

	public String comprobarParentesis(String p) {
		for (Character c : p.toCharArray()) {
			if (c == '(') {
				pila.push(c);
			} else if (c == ')' && !pila.isEmpty()) {
				pila.pop();
			} else if(c == ')' && pila.isEmpty()) {
				pila.push(c);
			}
		}
		return ""+pila.peek();
	}
}
