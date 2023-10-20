package convertirExpresionAPostfija;

public class TestConvertirExpresiones {

	public static void main(String[] args) {

		ConvertirExpresiones<Character> convertidor = new ConvertirExpresiones<Character>();
		String expresion = "(3+2)*(5^(4-1)-7/6)+8-9";
		System.out.println("La expresión postfija de la expresión " + expresion + " es: "
				+ convertidor.convertirAPostfija(expresion));
		String postFija = convertidor.convertirAPostfija(expresion);
		System.out.println("Y su solución es: " + convertidor.resolverPostfija(postFija));
	}
}
