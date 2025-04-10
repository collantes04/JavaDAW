package FichaArrays;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroMayor = 0;
        String cadenaFinal = "";

        System.out.println("Introduce un rango para el array");
        int indice = scan.nextInt();

        int[] arrayNumeros = new int[indice];

        for(int i = 0; i < arrayNumeros.length; i++){
            int datos = scan.nextInt();
            arrayNumeros[i] = datos;
        }

        for(int i = arrayNumeros.length-1; i >= 0; i--){
            if(arrayNumeros[i] > numeroMayor){
                numeroMayor = arrayNumeros[i];
                cadenaFinal += numeroMayor + " ";

            }
        }

        System.out.println("{"+cadenaFinal+"}");

        scan.close();
    }
}
