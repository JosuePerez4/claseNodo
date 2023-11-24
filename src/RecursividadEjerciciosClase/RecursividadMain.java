package RecursividadEjerciciosClase;

public class RecursividadMain {
    public static void main(String[] args) {
        recursividadEjercicios r = new recursividadEjercicios();
        int [] numeros = {44,55,66,77,88,34,21,20,12,3,4,5,7,8,9};
        System.out.println("¿Cuántos números mayores qué el dado son mayores? " + r.contarNumerosMayores(numeros, 20));
    }
}
