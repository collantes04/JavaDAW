package EJERCICIOSU1;
import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random numeroRandom = new Random();

        int numeroAdivinar = numeroRandom.nextInt(20) + 1;
        int intentos = 0;
        int adivinar = 0;
        
        System.out.println("Bienvenido a 'Adivina el numero'");
        System.out.println("Estoy pensando un numero del 1 al 20");
        System.out.println("Trata de adivinarlo en no más de 6 intentos");

        do {
            System.out.println("Adivina");
            adivinar = scan.nextInt();

            if (adivinar > numeroAdivinar){
                System.out.println("Es muy alto");
            } else {
                System.out.println("Es muy bajo");
            }
            intentos ++;
        } while (adivinar != numeroAdivinar && intentos != 6);

        if (adivinar == numeroAdivinar){
            System.out.println("Buen trabajo, has adivinado el número en " + intentos + " intentos!");
        } else{
            System.out.println("Se te agotaron los intentos");
        }

        scan.close();
    }
    
    
}
