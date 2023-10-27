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

    // Calcula el tamaño en bytes de la ruta en el pc que le pasamos
    public long tamañoCarpetaRecursivo(File ruta) {
        long tamaño = 0;
        if (ruta.isDirectory()) {
            File[] archivos = ruta.listFiles();
            if (archivos != null) {
                for (File archivo : archivos) {
                    if (archivo.canRead() && archivo.isDirectory()) {
                        tamaño += tamañoCarpetaRecursivo(archivo);
                    } else {
                        tamaño += archivo.length();
                    }
                }
            }
        }
        return tamaño;
    }

    // Ejercicios día 27/10/2023

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
        if (texto.charAt(pos) == letra) {
            return contarCoincidenciasRecursivo(texto, letra, pos + 1, contador + 1);
        }
        return contarCoincidenciasRecursivo(texto, letra, pos + 1, contador);
    }

    public boolean identificarNumeroBinario(int numero) {
        return identificarNumeroBinarioRecursivo(String.valueOf(numero), 0);
    }

    private boolean identificarNumeroBinarioRecursivo(String numero, int pos) {
        if (pos >= numero.length()) {
            return true;
        }
        if ("01".indexOf(numero.charAt(pos)) != -1) {
            return identificarNumeroBinarioRecursivo(String.valueOf(numero), pos + 1);
        }
        return false;
    }
}