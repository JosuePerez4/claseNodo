package validarExpresiones;

import previo1SemPasadoPilas.MineStack;

public class validarExpresiones <E> {

	private MineStack <Character> expresiones;
	private String exprePostFija;
	
	public MineStack<Character> getExpresiones() {
		return expresiones;
	}
	public void setExpresiones(MineStack<Character> expresiones) {
		this.expresiones = expresiones;
	}
	public String getExprePostFija() {
		return exprePostFija;
	}
	public void setExprePostFija(String exprePostFija) {
		this.exprePostFija = exprePostFija;
	}
	
	public void transformarAPostfijo (String expresionNormal) {
		for (Character c : expresionNormal.toCharArray()) {
		}
	}
	
	public int determinarImportancia (Character c) {
		int importancia = -1;
		if(c == null) {
			return importancia;
		} else if (c== '^') {
			return 3;
		} else if (c == '*' || c == '/') {
			return 2;
		} else {
			return 1;
		}
	}
}
