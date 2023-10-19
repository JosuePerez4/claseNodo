package convertirExpresionAPostfija;

public class TestConvertirExpresiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConvertirExpresiones <Character> convertidor = new ConvertirExpresiones<Character>();
		EvaluadorPostFija evaluador = new EvaluadorPostFija();
		String expresion = "7*3*2";
		System.out.println("números separados: "+ convertidor.separarNum(expresion));
		System.out.println("La expresión postfija de la expresión "+ expresion + " es: " + convertidor.convertirAPostfija(expresion));
		String postFija = convertidor.convertirAPostfija(expresion);
		System.out.println("Y su solución es: " + evaluador.resolverPostfija(postFija));

	}

}
