package RecursividadEjerciciosClase;

import java.io.File;

public class RecursividadMain {
    public static void main(String[] args) {
        recursividadEjercicios r = new recursividadEjercicios();
        //int re = r.nPotencia(20);
        //System.out.println("La potencia de 2 es: " + re);
        File f = new File("C:\\");
        //double tamañoCarpeta = r.tamañoCarpetaRecursivo(f);
        System.out.println("Tamaño calculado de carpeta: " + r.tamañoCarpetaRecursivo(f));
        //int numero = 10011200;
        //boolean i = r.identificarNumeroBinario(numero);
        //System.out.println("El número " + numero + " ¿es binario? "+ i);
    }
}
