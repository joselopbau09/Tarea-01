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
     * @param cadena String a recorrer.
     * @return int - Si todas las letras se repiten regresa -1, en otro caso regresa el indice de la primera letra que no se repite.
     */
    public int busqueda( String cadena) {
        int indice = -1;
        
        for (int i = 0; i < cadena.length(); i++) {
            letras.addFirst(cadena.charAt(i));
            if (cadena.charAt(i) == ' ') {
                continue;
            }
            else if (letrasRep.contains(cadena.charAt(i))) {
                continue;
            } else {
                if (letrasUnicas.contains(cadena.charAt(i))) {
                    int index = letrasUnicas.indexOf(cadena.charAt(i));
                    Character c = letrasUnicas.remove(index);
                    letrasRep.addFirst(cadena.charAt(i));
                } else {
                    letrasUnicas.addFirst(cadena.charAt(i));
                }
            }
        }

        if (letrasUnicas.size() == 0) {
            return indice;
        } else {
            Character val = letrasUnicas.getFirst();
            indice = letras.indexOf(val);
            return indice;
        }
    }
}