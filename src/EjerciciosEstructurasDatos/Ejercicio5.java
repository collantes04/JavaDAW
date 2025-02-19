package EjerciciosEstructurasDatos;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> listaEnlazada = new LinkedList<>();

        for(int i = 0; i < 5; i++){
            listaEnlazada.add(scan.nextInt());
        }
        
        System.out.println("Introduce los indices que quieres cambiar: ");
        int indice = scan.nextInt();
        int indice2 = scan.nextInt();

        int elemento1 = listaEnlazada.get(indice);
        int elemento2 = listaEnlazada.get(indice2);

        listaEnlazada.set(indice2, elemento1);
        listaEnlazada.set(indice, elemento2);

        System.out.println(listaEnlazada);


        scan.close();
    }
}
