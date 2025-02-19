package Ejercicios;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        final int MAYOR = 54;
        final int MENOR = 36;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce la talla de la prenda");

        int talla = scan.nextInt();

        if (talla <= MENOR && talla <= MAYOR){
            System.out.println("La talla existe");

        } else{
            System.out.println("La talla no existe");
        }

        scan.close();
    }
    
}
