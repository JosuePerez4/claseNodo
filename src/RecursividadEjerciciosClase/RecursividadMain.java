package RecursividadEjerciciosClase;

//import java.io.File;

public class RecursividadMain {
    public static void main(String[] args) {
        recursividadEjercicios r = new recursividadEjercicios();
        //int re = r.nPotencia(20);
        //System.out.println("La potencia de 2 es: " + re);
        //File f = new File("C:\\");
        //double tamañoCarpeta = r.tamañoCarpetaRecursivo(f);
        //System.out.println("Tamaño calculado de carpeta: " + r.tamañoCarpetaRecursivo(f));
        int i = r.contarCoincidencias("Pene", 'e');
        System.out.println("Cantidad de letras a: " + i);
    }
}
