package ARRAY;

import java.util.Arrays;

public class EjemplosArrays {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Arrays.fill(numeros, 5);
        System.out.println("Array después de fill(): " + Arrays.toString(numeros));

        int[] numerosDesordenados = {9, 3, 5, 2, 8, 6, 1, 7, 10, 4};
        Arrays.sort(numerosDesordenados);
        System.out.println("Array despues de sort(): " + Arrays.toString(numerosDesordenados));

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};    
        int[] array3 = {1, 2, 3, 5};

        System.out.println("Array 1 y 2 son iguales? " + Arrays.equals(array1, array2));
        System.out.println("Array 1 y 3 son iguales? " + Arrays.equals(array1, array3));

        int[] numerosOrdenados = {1,2,3,4,5,6,7,8,9,10};
        int indice = Arrays.binarySearch(numerosOrdenados, 5);
        System.out.println("Indice de 5 en el array: "+ indice);

        int[] copia = Arrays.copyOfRange(numerosOrdenados, 2, 7);
        System.out.println("Copia del rango 2-6 " + Arrays.toString(copia));

    }
}
