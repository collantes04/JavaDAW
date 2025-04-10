package FichaArrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        /*Desarrolla un programa que cree un vector de n números 
        aleatorios entre inf y sup, los datos de n, inf y sup se piden al usuario. 
        Posteriormente se debe ordenar los elementos de menor a mayor. 
        Mostrar el vector antes y después de ordenar. */

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int[] arrayInicial = new int[n];
        int[] arrayOrdenado = new int[n];

        int inf = scan.nextInt();

        int sup = scan.nextInt();

        Random random = new Random();


        for(int i = 0; i < arrayInicial.length; i++){
            int numerosAleatorios = random.nextInt(sup - inf + 1) + inf;
            arrayInicial[i] = numerosAleatorios;
        }  
        
        for(int i = 0; i < arrayInicial.length; i++){
            arrayOrdenado[i] = arrayInicial[i];
        }
        Arrays.sort(arrayOrdenado);
        
        System.out.println("Array sin ordenar :" + Arrays.toString(arrayInicial));
        System.out.println("Array ordenado: " + Arrays.toString(arrayOrdenado));
        

        scan.close();
    }
}
