
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Buscador buscar = new Buscador();
        String mensaje, cadena;
        int val;
        Scanner scn = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sb.append("Bienvenido!\n");
        sb.append("Ingresa la palabra: ");

        mensaje = sb.toString();

        System.out.println(mensaje);
        cadena = scn.nextLine();
        scn.close();
        val = buscar.busqueda(cadena);
        System.out.println("Resultado: " + val);
    }
}
