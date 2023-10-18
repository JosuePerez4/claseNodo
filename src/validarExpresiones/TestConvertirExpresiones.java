package validarExpresiones;

public class TestConvertirExpresiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConvertirExpresiones <Character> convertidor = new ConvertirExpresiones<Character>();
		String expresion = "a*(b+c-(d/e^f)-g)-h";
		System.out.println("La expresión postfija de la expresión "+ expresion + " es: " + convertidor.convertirAPostfija(expresion));
		expresion = "A+(X/Y)*B^C";
		System.out.println("La expresión postfija de la expresión "+ expresion + " es: " + convertidor.convertirAPostfija(expresion));
	}

}
