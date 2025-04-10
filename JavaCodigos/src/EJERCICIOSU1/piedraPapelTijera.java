package EJERCICIOSU1;

import java.util.Random;
import java.util.Scanner;

public class piedraPapelTijera {
    public static void main(String[] args) {
        final char piedra = 'x';
        final char papel = 'p';
        final char tijeras = 't';
        Scanner scan = new Scanner(System.in);
        Random eleccionAleatoria = new Random();
        char eleccion = ' ';
        char pcEleccion = ' ';
        int eleccionPc;
        int partidas = 0;
        int ganas = 0; 
        int pierdes = 0;
        int empates = 0;
        float calculoPierdes, calculoGanas;
        System.out.println("Juego Piedra, Papel, Tijeras: ");
        System.out.println("----------------------------------");

        do {
            String controlPc = " ";
            eleccionPc = eleccionAleatoria.nextInt(3);
            System.out.println("Tu turno (x = piedra, p = papel, t = tijeras)");
            eleccion = scan.next().charAt(0);
            scan.nextLine();
            if (eleccion == 's'){
                break;
            }
            switch (eleccionPc) {
                case 0:
                    pcEleccion = 'x';
                    controlPc = "piedra";
                    break;
                case 1:
                    pcEleccion = 'p';
                    controlPc = "papel";
                    break;

                case 2:
                    pcEleccion = 't';
                    controlPc = "tijeras";
                    break;
                default:
                    break;
            }
            System.out.println("Mi turno (Ordenador): " + controlPc);
            if (eleccion == piedra && pcEleccion == papel || eleccion == papel && pcEleccion == tijeras || eleccion == tijeras && pcEleccion == piedra){
                System.out.println("¡Has perdido!");
                pierdes ++;
            } else if (eleccion == pcEleccion) {
                System.out.println("¡Empate!");
                empates ++;
            } else if (eleccion == papel && pcEleccion == piedra || eleccion == tijeras && pcEleccion == papel || eleccion == piedra && pcEleccion == tijeras){
                System.out.println("¡Has ganado!");
                ganas ++;
            }
            partidas ++;

        } while (eleccion != 's');

        //Calculos

        calculoPierdes = (pierdes * 100) / partidas;
        calculoGanas = (ganas * 100) / partidas;

        //Estadísticas
        System.out.println("Estadísticas");
        System.out.println("----------------");
        System.out.println("Numero de partidas: " + partidas);
        System.out.println("Yo gané: " + pierdes + " veces " + "(" + calculoPierdes + ")" + "%");
        System.out.println("Tú ganaste: " + ganas + " veces " + "(" + calculoGanas + ")" + "%");
        System.out.println("Hemos empatado: " + empates + " veces");
        System.out.println("Adios");
        
        scan.close();
    }
}
