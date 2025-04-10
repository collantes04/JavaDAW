package EJERCICIOSMATRICES;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        int c = scan.nextInt();
        int[][] matriz = new int[f][c];
        int[][] matrizTraspuesta = new int[c][f];

        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                int datos = scan.nextInt();
                matriz[i][j] = datos;
            }
        }
        

        for(int i = 0; i < f; i++){
            for(int j = 0; j < c; j++){
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println(); //Dos saltos de linea
        System.out.println();

        for(int i = 0; i < c; i++){
            for(int j = 0; j < f; j++){
                System.out.print(matrizTraspuesta[i][j] + " " );
            }
            System.out.println();
        }
        scan.close();

    }
}
