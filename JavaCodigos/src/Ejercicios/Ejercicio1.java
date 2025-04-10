package Ejercicios;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduce la edad: ");

        byte edad = scan.nextByte();

        if(edad >= 18){

            System.out.println("Es mayor de edad");

        } else {
            System.out.println("Es menor de edad");

        }

        scan.close();
    }
    
}
