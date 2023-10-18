package evaluadorParentesis;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		evaluadorParentesis <Character> ev = new evaluadorParentesis<Character>();
		String parentesis = "(((())))";
		System.out.println(ev.comprobarParentesis(parentesis));			
	}

}
