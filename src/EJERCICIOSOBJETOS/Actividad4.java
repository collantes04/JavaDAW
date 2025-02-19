package EJERCICIOSOBJETOS;

import java.util.Random;
import java.util.Scanner;

public class Actividad4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int num1 = rand.nextInt(100)+1;
        int num2 = rand.nextInt(100)+1;
        double eleccion = 1;
        int opcion = rand.nextInt(4)+1;
        double respuestaCorrecta = 0;

        while(respuestaCorrecta != eleccion){
            switch (opcion) {
                case 1:
                        System.out.println(num1 + " + " + num2 + " = ?");
                        respuestaCorrecta = num1 +  num2;
                    break;
                case 2:
                        System.out.println(num1 + " - " + num2 + " = ?");
                        respuestaCorrecta = num1 - num2;
                    break;
                case 3:
                        System.out.println(num1 + " * " + num2 + " = ?");
                        respuestaCorrecta = num1 * num2;
                    break;
                case 4:
                        System.out.println(num1 + " / " + num2 + " = ?");
                        respuestaCorrecta = (double) num1 / num2;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
            eleccion = scan.nextDouble();
            if(respuestaCorrecta == eleccion){
                System.out.println("Correcto");
                break;
            } else{
                System.out.println("Respuesta incorrecta");
            }
        }
            scan.close();
    }

}

