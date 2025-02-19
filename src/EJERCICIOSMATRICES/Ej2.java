package EJERCICIOSMATRICES;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matriz = new int[5][5];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == 0 || i == matriz.length-1 || j == 0 || j == matriz.length-1){
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " " );
            }
            System.out.println();
        }
        scan.close();
    }
}
