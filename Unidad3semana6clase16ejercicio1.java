package unidad.pkg3semana.pkg6clase16ejercicio.pkg1;
import java.util.Scanner;
public class Unidad3semana6clase16ejercicio1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int password;
        do {
        System.out.println("Introduzca su contraseña numérica: ");
        password = keyboard.nextInt();
        if (password != 1234)
            System.out.println("La contraseña no es válida.");
        }
        while (password != 1234);
        }
    
}
