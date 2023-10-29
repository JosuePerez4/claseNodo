package RecursividadEjerciciosClase;

import colas.Cola;

public class RecursividadMain {
    public static void main(String[] args) {
        recursividadEjercicios r = new recursividadEjercicios();
        Cola<Integer> cola1 = new Cola<Integer>();
        Cola<Integer> cola2 = new Cola<Integer>();
        cola1.encolar(1);
        cola1.encolar(2);
        cola1.encolar(3);
        cola1.encolar(4);
        cola1.encolar(5);
        cola1.encolar(6);
        cola1.encolar(7);
        cola1.encolar(8);
        // cola 2
        cola2.encolar(1);
        cola2.encolar(2);
        cola2.encolar(3);
        cola2.encolar(4);
        cola2.encolar(5);
        cola2.encolar(6);
        cola2.encolar(7);
        cola2.encolar(8);
        // probar método
        boolean siONo = r.compararColas(cola1, cola2);
        System.out.println(siONo);
    }
}
