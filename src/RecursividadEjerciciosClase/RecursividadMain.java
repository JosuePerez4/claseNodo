package RecursividadEjerciciosClase;

public class RecursividadMain {
    public static void main(String[] args) {
        recursividadEjercicios r = new recursividadEjercicios();
        String e = "(()))";
        System.out.println("¿String balanceado?");
        if(r.stringBalanceado(e) == true){
            System.out.println("Sí mi pana");
        } else {
            System.out.println("Diavlo chamo, como q ño");
        }
    }
}
