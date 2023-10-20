package pilas;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MineStack <Integer> Stack1 = new MineStack<Integer>();
		Stack1.push(1);
		Stack1.push(2);
		Stack1.push(3);
		Stack1.push(4);
		Stack1.push(5);
		Stack1.printStack();
		System.out.println();
		Stack1.pop();
		System.out.println(Stack1.peek());
		Stack1.printStack();
		System.out.println();
		System.out.println("Ahora vaciaremos la pila");
		Stack1.clenaStack();
		Stack1.printStack();
	}
}
