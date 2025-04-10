package EjerciciosEstructurasDatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*    1. Crea un ArrayList de enteros que tras insertar un entero pregunta al usuario si quiere introducir otro. 
        Muestra al usuario un menú para realizar las siguientes opciones: 

        • Mostrar lista 
        • Mostrar mayor, menor y media 
        • Borrar un elemento en un índice concreto 
        • Borrar un elemento de un valor concreto 
        • Añadir un elemento al final 
        • Cambiar valor de un elemento por su posición 
        • Cambiar valor de un elemento por su valor */

        Scanner scan = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();
        int opcion = -1;

        char opcionNumero = ' ';

        while (opcionNumero != 'n') {
            System.out.println("Introduce un numero");
            int numero = scan.nextInt();
            scan.nextLine();

            listaNumeros.add(numero);

            System.out.println("¿Quiere ingresar otro número? si(s)/no(n)");
            opcionNumero = scan.next().charAt(0);
            scan.nextLine();

            
            
        }

        while(opcion != 0){
            /*Menú*/
            System.out.println("----Menu-----");
            System.out.print("1.Mostrar lista\n2.Mostrar mayor, menor y media\n3.Borrar un elemento en un índice\n");
            System.out.print("4.Borrar un lemento de un valor concreto\n5.Añadir un elemento al final\n6.Cambiar valor de un elemento por su posición\n");
            System.out.print("0.Salir\n");

            opcion = scan.nextInt();

            /*Switch elecciones*/
            switch (opcion) {
                case 1:

                    listaNumeros.forEach(numeros -> {
                        System.out.print(numeros + " ");
                    });
                    System.out.println();
                    break;
                
                case 2:
                        float suma = 0;
                        float media = 1;
                        int maximo = Collections.max(listaNumeros);
                        int minimo = Collections.min(listaNumeros);
                        
                        for (Integer numeros: listaNumeros){
                            suma += numeros;
                        }

                        media = suma / listaNumeros.size();
                        System.out.println("Maximo: " + maximo + " Minimo: " + minimo + " Media: " + media);
                    break;

                case 3:
                        System.out.println("Introduce el indice que quieres borrar: ");
                        int indice = scan.nextInt();
                        listaNumeros.remove(indice);
                        System.out.println("Se ha eliminado el elemento en el indice: " + indice);
                        break;
                    
                case 4:
                        System.out.println("Introduce el valor que quieres eliminar");
                        int valorEliminar = scan.nextInt();
                        boolean encuentraNumero = false;
                        indice = 0;

                        for(Integer numeros: listaNumeros){
                            if(numeros == valorEliminar){
                                indice = listaNumeros.indexOf(numeros);
                                encuentraNumero = true;
                                break;
                            } 
                        }
                        
                        if (encuentraNumero) {
                            listaNumeros.remove(indice);
                            System.out.println("Elemento eliminado");
                        } else {
                            System.out.println("El elemento no existe en el array");
                        }                    
                        break;

                case 5:
                        System.out.println("Introduce un numero a añadir");
                        int elementoAniadir = scan.nextInt();
                        listaNumeros.add(elementoAniadir);
                        break;
                
                case 6:
                        System.out.println("Introduce el indice y el valor que quieres cambiar");
                        indice = scan.nextInt();
                        int numero = scan.nextInt();
                        
                        listaNumeros.set(indice, numero);
                        System.out.println("Se ha cambiado el elemento");
                        break;
                default:
                    break;
            }
        }

        scan.close();
    }
}
