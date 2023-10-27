package RecursividadEjerciciosClase;

import java.io.File;

public class recursividadEjercicios {

    public recursividadEjercicios() {

    }

    /**
     * 
     * @param numeros
     *                arreglo de números
     * @param indice
     *                dónde queremos q imprima
     */
    public void print(int[] numeros, int indice) {
        if (indice < numeros.length) {
            System.out.println(numeros[indice]);
            print(numeros, indice - 1);
        }
    }

    public int fibonacciRecursivo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public int factorialRecursivo(int n) {
        if (n == 1) {
            return n;
        }
        return factorialRecursivo(n - 1) * n;
    }

    public int nPotencia(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 2;
        }
        return nPotencia(n - 1) * 2;
    }

    public double tamañoCarpetaRecursivo(File ruta) {
        long tamaño = 0;
        if (!ruta.isDirectory()) {
            System.out.println("Analizando directorio: " + ruta.getAbsolutePath());
            File[] archivos = ruta.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.canRead() && archivo.isDirectory()) {
                        System.out.println("Recursión en subdirectorio: " + archivo.getAbsolutePath());
                        tamaño += tamañoCarpetaRecursivo(archivo);
                    } else {
                        tamaño += archivo.length();
                        System.out.println("Tamaño del archivo: " + archivo.length() + " bytes");
                    }
                }
            }
        }
        double gigabytes = tamaño / (1024.0 * 1024.0 * 1024.0);
        return gigabytes;
    }

    public void imprimirVocales(String palabra, int pos) {
        if (pos >= palabra.length()) {
            return;
        }

        char caracter = palabra.charAt(pos);
        if ("AEIOUaeiou".indexOf(caracter) != -1) {
            System.out.print(caracter);
        }
        imprimirVocales(palabra, pos + 1);
    }

    public int contarCoincidencias(String texto, char letra) {
        if (texto.isEmpty()) {
            return 0;
        }
        return contarCoincidenciasRecursivo(texto, letra, 0, 0);

    }

    private int contarCoincidenciasRecursivo(String texto, char letra, int pos, int contador) {
        if (pos >= texto.length()) {
            return contador;
        }
        if(texto.charAt(pos) == letra){
            return contarCoincidenciasRecursivo(texto, letra, pos + 1, contador + 1);
        }
        return contarCoincidenciasRecursivo(texto, letra, pos+1, contador);
    }

    public boolean identificarNumeroBinario (int numero) {
        return false;
    }
}


