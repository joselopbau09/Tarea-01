
public class Prueba {

    public static String prefijo( String[] arr) {
        String cadena = " ";
        boolean marcador = false;
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

    public static int cadenaMin( String[] arr) {
        int val = arr[0].length();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() < val ) {
                val = arr[i].length();
            }
        }
        return val;
    }

    public static void main(String[] args) {
        String arr[] = {"manana","manago", "manalo" };
        String cadena;
        
        cadena = prefijo(arr);

        System.out.println(cadena);
    }
}
