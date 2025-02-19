package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class NotasAlumnos{
    public static void main(String[] args) {
        int alumnos = 0;
        int[] notas;
        double suma = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuantos alumnos hay en clase?");

        alumnos = scan.nextInt();
        notas = new int[alumnos];

        //Pedimos las notas de los alumnos y las vamos sumando
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota del alumno " + (i+1) + ": ");
            int num = scan.nextInt();
            notas[i] = num;
            suma += num;
        }

        System.out.println("Las notas son: " + Arrays.toString(notas));
        System.out.println("La media de la clase es: " + suma/notas.length);
        
        scan.close();
    }

}