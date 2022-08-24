import java.io.*;
import java.util.*;

public class Prueba {
    /**
     * Método que busca el prefijo común más largo en el arreglo de String.
     *
     * @param arr Arreglo de String.
     * @return String - Si no hay prefijo común devuelve " ", en otro caso el prefijo.
     */
    public static String prefijo( String[] arreglo) {
        String cadena = " ";
        boolean marcador = false;
        String arr[] = modificador(arreglo);
        for (int j = 0; j < cadenaMin(arr); j++) {
            for (int i = 1; i < arr.length; i++) {
                if(arr[0].charAt(j) != arr[i].charAt(j)) {
                    marcador = false;
                    break;
                } else {
                    marcador = true;
                }
            }
            if (marcador) {
                cadena += String.valueOf(arr[0].charAt(j));
            } else {
                break;
            }
        }
        return cadena;
    }
    public static String [] modificador(String [] arr) {
        String arrModificado[] = new String[arr.length];
        for (int i = 0; i < arrModificado.length; i++) {
            arrModificado[i] = arr[i].toLowerCase();
        }
        return arrModificado;
    }
   
    /**
     * Método que de encontrar la cadena de menor longitud del arreglo. 
     *
     * @param arr Arreglo de String.
     * @return int - Devuelve el tamaño de la cadena.
     */
    public static int cadenaMin( String[] arr) {
        int val = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < val ) {
                val = arr[i].length();
            }
        }
        return val;
    }

     /**
     * Método que se encarga de imprimir en consola los resultados de la busqueda del prefijo.
     *
     * @param arr Arreglo de String con las palabras a buscar.
     * @param cadena Prefijo en comun.
     */
    public static void imprime(String[] arr, String cadena) {
        System.out.println("Ejemplo con las palabras:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Prefijo comun: " + cadena);
    }

    public static void main(String[] args) {
        String arrUno[] = {"manzana","manago", "marcuya" };
        String arrDos[] = {"flow","flower", "flight" };
        String arrTres[] = {"Manuel","Juan", "Yair", "Emanuel", "Margarita" };
        String cadenaUno, cadenaDos, cadenaTres;
        
        cadenaUno = prefijo(arrUno);
        cadenaDos = prefijo(arrDos);
        cadenaTres = prefijo(arrTres);
        
        imprime(arrUno, cadenaUno);
        imprime(arrDos, cadenaDos);
        imprime(arrTres, cadenaTres);
    }
}
