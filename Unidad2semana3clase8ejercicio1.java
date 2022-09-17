package unidad.pkg2semana.pkg3clase.pkg8ejercicio.pkg1;
import java.util.Scanner;
public class Unidad2semana3clase8ejercicio1 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner (System.in);
        System.out.println("Ingrese el numero: ");
        int numero;
        numero = ingresar.nextInt ();
        for(int i =1; i<=10; i++){
            System.out.println(numero + " * " + i + " = " + numero * i);
        
        }
       
    }
    
}
