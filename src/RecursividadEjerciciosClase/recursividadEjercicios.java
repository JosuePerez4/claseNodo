package RecursividadEjerciciosClase;

import java.io.File;

import colas.Cola;
import pilas.MineStack;

public class recursividadEjercicios<E> {

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

    // Fin ejercicios 27/10/2023

    public static void mostrarArrayRecursivo(int[] array, int indice) {
        if (indice < array.length) {
            System.out.println(array[indice]);
            mostrarArrayRecursivo(array, indice + 1);
        }
    }

    public static int posicionElementoRecursivo(int[] array, int elementoBuscar, int indice) {
        if (indice < array.length) {
            if (array[indice] == elementoBuscar) {
                return indice;
            } else {
                return posicionElementoRecursivo(array, elementoBuscar, indice + 1);
            }
        }
        return -1;
    }

    public int sumaVector(int[] array, int indice) {
        if (indice < array.length) {
            return array[indice] + sumaVector(array, indice + 1);
        } else {
            return 0;
        }
    }

    public int sumaDigitosNumero(int numero) {
        if (numero % 10 > 0) {
            return sumaDigitosNumero(numero / 10) + numero % 10;
        } else {
            return 0;
        }
    }

    public boolean stringBalanceado(String parentesis) {
        MineStack<Character> balance = new MineStack<Character>();
        return stringBalanceadoRecursivo(parentesis, 0, balance);
    }

    private boolean stringBalanceadoRecursivo(String parentesis, int index, MineStack<Character> balance) {
        if (index >= parentesis.length()) {
            return balance.isEmpty();
        }
        Character c = parentesis.charAt(index);
        if (c == '(') {
            balance.push(c);
        } else if (c == ')' && !balance.isEmpty()) {
            balance.pop();
        } else if (c == ')' && balance.isEmpty()) {
            return false;
        }
        return stringBalanceadoRecursivo(parentesis, index + 1, balance);
    }

    public boolean compararColas(Cola <Integer> cola1, Cola <Integer> cola2) {
        if (cola1.size() != cola2.size()) {
            return false; // Las colas tienen diferentes tamaños, no pueden ser iguales.
        }
        return compararColasRecursivo(cola1, cola2, 0);
    }

    private boolean compararColasRecursivo(Cola <Integer> cola1, Cola <Integer> cola2, int indice) {
        if (indice == cola1.size()) {
            return true; // Se han comparado todos los elementos y son iguales.
        }
        if (cola1.get(indice) == cola2.get(indice)) {
            return compararColasRecursivo(cola1, cola2, indice + 1);
        }
        return false; // Los elementos en el índice actual no son iguales.
    }
}