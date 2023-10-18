package validarExpresiones;

import previo1SemPasadoPilas.MineStack;

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
}
/*String postFija = "";
		System.out.println(expresionNormal.toCharArray());
		for (Character c : expresionNormal.toCharArray()) {
			System.out.println(c);
			if ((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
				postFija += c;
			} else {
				if (c == ')') {
					while (!expresiones.isEmpty() && expresiones.peek() != '(') {
						postFija += expresiones.pop();
					}
					if (!expresiones.isEmpty() && expresiones.peek() == '(') {
						expresiones.pop();
					}
				} else if (c == '(') {
					expresiones.push(c);
				} else {
					if (c != null && determinarImportancia(c) <= determinarImportancia(expresiones.peek())) {
						postFija += expresiones.pop();
					}
					expresiones.push(c);
				}
			}
			System.out.println("post: "+postFija);
		}

		while (!expresiones.isEmpty()) {
			postFija += expresiones.pop();
		}

		return postFija;*/
