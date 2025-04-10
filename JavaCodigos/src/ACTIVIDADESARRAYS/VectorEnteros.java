package ACTIVIDADESARRAYS;
import java.util.Scanner;

public class VectorEnteros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maximo = Integer.MAX_VALUE;
        int minimo = Integer.MIN_VALUE;

        int tamArray = scan.nextInt();
        int[] arrayEnteros; 
        arrayEnteros = new int[tamArray];
        
        for(int i = 0; i < arrayEnteros.length; i++){
            int datos = scan.nextInt();
            arrayEnteros[i] = datos;

            if(datos < maximo)
                maximo = datos;
            if(datos > minimo)
                minimo = datos;
        }
        System.out.println("Maximo: " + minimo + " Minimo: " + maximo);

        scan.close();
    }
}
