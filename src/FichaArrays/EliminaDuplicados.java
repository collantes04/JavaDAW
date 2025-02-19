package FichaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EliminaDuplicados {
    public static void main(String[] args) {
        /*Crea un programa EliminaDuplicados en el que se crea un array al que 
        añade una cantidad de números indicada por el usuario. 
        Se debe generar una copia del array original, pero eliminando los números duplicados. 
        Finalmente se debe mostrar el array original y la copia sin duplicados */

        Scanner scan = new Scanner(System.in);

        int tamanyo = scan.nextInt();
        int[] arrayDuplicado = new int[tamanyo];
        int[] copiaArray = new int[tamanyo];
        for(int i = 0; i < tamanyo; i++){
            int valores = scan.nextInt();
            arrayDuplicado[i] = valores;
        }

        for(int i = 0; i < tamanyo; i++){

            copiaArray[i] = arrayDuplicado[i];
        }

        for(int i = tamanyo; i < copiaArray.length-1; i++){
            if(copiaArray[i] == copiaArray[i+1]){
                copiaArray[i] = copiaArray[i+1];
            }
        }

        System.out.println(Arrays.toString(copiaArray));
        scan.close();


    }
}
