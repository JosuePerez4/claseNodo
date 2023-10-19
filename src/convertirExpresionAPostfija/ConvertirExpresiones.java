package convertirExpresionAPostfija;

import pilas.MineStack;

public class ConvertirExpresiones<E> {

	private MineStack<Character> expresiones;

	public ConvertirExpresiones() {
		expresiones = new MineStack<>();
	}

	public MineStack<Character> getExpresiones() {
		return expresiones;
	}

	public void setExpresiones(MineStack<Character> expresiones) {
		this.expresiones = expresiones;
	}

	public String convertirAPostfija(String expresionNormal) {
		String postFija = "";
	    for (char c : expresionNormal.toCharArray()) {
	        if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
	            postFija += c;
	        } else if (c == '(') {
	            expresiones.push(c);
	        } else if (c == ')') {
	            while (!expresiones.isEmpty() && expresiones.peek() != '(') {
	                postFija += expresiones.pop();
	            }
	            if (!expresiones.isEmpty() && expresiones.peek() == '(') {
	                expresiones.pop();
	            }
	        } else {
	            while (!expresiones.isEmpty() && determinarImportancia(c) <= determinarImportancia(expresiones.peek())) {
	                postFija += expresiones.pop();
	            }
	            expresiones.push(c);
	        }
	    }

	    while (!expresiones.isEmpty()) {
	        postFija += expresiones.pop();
	    }
	    
	    return postFija;
	}

	private int determinarImportancia(Character c) {
		switch (c) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		default:
			return 0;
		}
	}
	
	public int separarNum (String str) {
		String num="";
		/*for(Character c : str.toCharArray()) {
			while (!(c == '^' && c == '/' && c == '*' && c == '+' && c == '-')) {
				num += c;
			}
		}*/
		return Integer.valueOf(num);
	}
}
