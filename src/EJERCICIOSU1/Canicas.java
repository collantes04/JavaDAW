package EJERCICIOSU1;

import java.util.Scanner;

public class Canicas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casosPrueba;
        long altura;
        long canicas;

        casosPrueba = scan.nextInt();

        for(int i = 0; i < casosPrueba; i++){
            altura = scan.nextInt();
            canicas = (altura * (altura + 1) * (altura + 2)) / 6; //Suma de los n primeros numeros triangulares
            System.out.println(canicas);
        }
        scan.close();
    }
}
