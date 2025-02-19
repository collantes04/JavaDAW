package EJERCICIOSMATRICES;

public class Ej5 {
public static void main(String[] args) {
        int[][] matriz = {{8, 1, 6},
                        {3, 5, 7},
                        {4, 9, 2}};

        int diagonal_principal = 0;
        int diagonal_secundaria = 0;
        int columnas;
        int filas = 0;
        boolean esMagico = true;

        for (int i = 0; i < matriz.length; i++) {
            diagonal_principal += matriz[i][i];
        }

        for (int i = 0; i < matriz.length; i++) {
            diagonal_secundaria += matriz[i][matriz.length - i - 1];
        }



        for (int i = 0; i < matriz.length; i++) {
            int sumaFilaActual = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFilaActual += matriz[i][j];
            }
            if (sumaFilaActual != filas) {
                esMagico = false;
                break;
            }

        }


        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                columnas += matriz[i][j];
            }
        }

        if (diagonal_principal == diagonal_secundaria && diagonal_principal == filas && esMagico) {
            System.out.println("Es un cuadrado magico");
        } else {
            System.out.println("No es un cuadrado magico");
        }

    }
}
