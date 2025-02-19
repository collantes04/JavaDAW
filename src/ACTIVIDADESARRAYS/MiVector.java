package ACTIVIDADESARRAYS;
import java.util.Arrays;
import java.util.Scanner;


public class MiVector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        int suma = 0;

        for(int i = 0; i < array.length; i++){
                int datos = scan.nextInt();
                array[i] = datos;


            
                //Multiplicamos
                array[i] = array[i] * 3;
                
                //Sumo los pares multiplicados por 3
                if (array[i]%2==0)
                    suma += array[i];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(suma);

        scan.close();


    }
}
