package EJERCICIOSMATRICES;


public class Ej4 {
    public static void main(String[] args) {
        int[][] matriz = {{1,2,3}, 
                        {4,5,6},
                        {7,8,9}};


        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == j){
                    matriz[i][j] = 0;
                }

                if(i + j == matriz.length-1){
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
    }
}
