package unida.pkg3semana.pkg7clase.pkg19ejercicio.pkg1;
import java.util.Scanner;
public class Unida3semana7clase19ejercicio1 {
    public static void main(String[] args) {
        Scanner objeto = new Scanner(System.in);
        int numero1, numero2, respuesta, contador;
        System.out.println("Ingresa el primer numero: ");
        numero1 = objeto.nextInt();
        System.out.println("Ingresa el segundo numero");
        numero2 = objeto.nextInt();
        contador = numero1;
        while (contador > numero2) {
            System.out.println(contador);
            contador--;
        }
        
     
    }
    
}
