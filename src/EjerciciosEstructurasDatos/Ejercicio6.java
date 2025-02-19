package EjerciciosEstructurasDatos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> diccionario = new HashSet<>();
        Set<String> conjuntoFrase = new HashSet<>();

        for(int i = 0; i < 10; i++){
            diccionario.add(scan.nextLine());
        }

        System.out.println("Introduce una frase: ");
        String frase = scan.nextLine();
        String[] splitPalabras = frase.split(" ");

        for(String palabra: splitPalabras){
            conjuntoFrase.add(palabra);
        }

        for(String palabra: conjuntoFrase){
            if(!diccionario.contains(palabra.toLowerCase())){
                System.out.print(palabra + ",");
            }
        }
        System.out.println();

        scan.close();
    }
}
