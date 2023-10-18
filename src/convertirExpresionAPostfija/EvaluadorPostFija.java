package convertirExpresionAPostfija;

import pilas.MineStack;

public class EvaluadorPostFija {

	private MineStack<Float> operando;

	public EvaluadorPostFija() {
		this.operando = new MineStack<Float>();
	}

	public MineStack<Float> getOperando() {
		return operando;
	}

	public void setOperando(MineStack<Float> operando) {
		this.operando = operando;
	}

	public float resolverPostfija(String postfija) {
		float resultado = 0;
		for (Character c : postfija.toCharArray()) {
			if (c >= 48 && c <= 57) {
				float decimal = Character.getNumericValue(c);
				operando.push(decimal);
			} else if (!(c >= 65 && c <= 90) && !(c >= 97 && c <= 122)) {
				float b = operando.pop();
				float a = operando.pop();
				resultado = operar(c, a, b);
				operando.push(operar(c, a, b));
			} else {
				throw new RuntimeException("No se pueden evaluar letras");
			}
		}
		return resultado;
	}

	private float operar(char operador, float a, float b) {
		switch (operador) {
		case '^':
			return (float) Math.pow(a, b);
		case '*':
			return a*b;
		case '/':
			if(b == 0) return 0.1f;
			return a/b;
		case '+':
			return a+b;
		case '-':
			return a-b;
		default:
			return 0.0f;
		}
	}
}
