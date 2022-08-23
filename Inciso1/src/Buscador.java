import java.util.LinkedList;
/**
 * Clase que se encarga de buscar <strong>las lettras</strong> que se repiten en un cadena.
 *
 * @author Jose Luis Lopez 
 */
public class Buscador {

    /**
     * Lista de Character que almacena todas las letras de una cadena en orden.
     */
    private LinkedList<Character> letras;
    
    /**
     * Lista de Character que almacena todas las letras de una cadena que aparecen una sola vez.
     */
    private LinkedList<Character> letrasUnicas;
    
    /**
     * Lista de Character que almacena todas las letras de una cadena que aparecen más de una vez.
     */
    private LinkedList<Character> letrasRep;

    /**
    * Constructuctor que instancia todas las listas.
    */
    public Buscador() {
        letras = new LinkedList<Character>();
        letrasUnicas = new LinkedList<Character>();
        letrasRep = new LinkedList<Character>();
    }

    /**
     * Método que recorre la cadena carácter por carácter, para agregarlos a su lista correspondiente 
     * y por último comprobar el índice.
     *
     * @param palabra String a recorrer.
     * @return int - Si todas las letras se repiten regresa -1, en otro caso regresa el indice de la primera letra que no se repite.
     */
    public int busqueda( String palabra) {
        String cadena = palabra.toLowerCase();
        int indice = -1;
        Character letra;
        for (int i = 0; i < cadena.length(); i++) {
            letra = cadena.charAt(i);
            letras.addLast(letra);
            if (letra == ' ') {
                continue;
            }
            else if (letrasRep.contains(letra)) {
                continue;
            } else {
                if (letrasUnicas.contains(letra)) {
                    int index = letrasUnicas.indexOf(letra);
                    Character c = letrasUnicas.remove(index);
                    letrasRep.addFirst(letra);
                } else {
                    letrasUnicas.addFirst(letra);

                }
            }
        }

        if (letrasUnicas.isEmpty()) {
            return indice;
        } else {
            Character val = letrasUnicas.getLast();
            indice = letras.indexOf(val);
            return indice;
        }
    }
}