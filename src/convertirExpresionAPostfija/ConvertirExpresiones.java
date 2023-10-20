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
		String num = "";
		boolean uniendoNumero = false;
		
		for (char c : expresionNormal.toCharArray()) {
	        if (Character.isLetterOrDigit(c)) {
	            num += c;
	            uniendoNumero = true;
	        } else { 
	            if (uniendoNumero) {
	                postFija += num + " ";
	                num = ""; // Reiniciar el número
	                uniendoNumero = false;
	            }
	            
	            if (c == '(') {
	                expresiones.push(c);
	            } else if (c == ')') {
	                while (!expresiones.isEmpty() && expresiones.peek() != '(') {
	                    postFija += expresiones.pop() + " ";
	                }
	                if (!expresiones.isEmpty() && expresiones.peek() == '(') {
	                    expresiones.pop();
	                }
	            } else {
	                while (!expresiones.isEmpty() && determinarImportancia(c) <= determinarImportancia(expresiones.peek())) {
	                    postFija += expresiones.pop() + " ";
	                }
	                expresiones.push(c);
	            }
	        }
	    }

	    // Agregar el último número si lo hay
	    if (uniendoNumero) {
	        postFija += num + " ";
	    }

	    while (!expresiones.isEmpty()) {
	        postFija += expresiones.pop() + " ";
	    }

	    return postFija;
	}
	
	public float resolverPostfija(String postfija) {
		MineStack<Float> operando = new MineStack<Float>();
		String[] tokens = postfija.split(" ");
		for (String token : tokens) {
			if (Character.isDigit(token.charAt(0))) {
				operando.push(Float.parseFloat(token));
			} else {
				float operador2 = operando.pop();
				float operador1 = operando.pop();
				operando.push(operar(token.charAt(0), operador1, operador2));
			}
		}
		return operando.pop();
	}

	// Se usa en el método resolverPostfija
	private float operar(char operador, float a, float b) {
		switch (operador) {
		case '^':
			return (float) Math.pow(a, b);
		case '*':
			return a * b;
		case '/':
			if (b == 0)
				return 0.1f;
			return a / b;
		case '+':
			return a + b;
		case '-':
			return a - b;
		default:
			return 0.0f;
		}
	}
	
	// Se usa en el método convertirAPostfija
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
