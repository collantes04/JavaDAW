package DESAFIOS;

import java.util.Scanner;

public class SietePicos {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int casosPrueba = -1;
        int contadorPicos = 0;

        while (casosPrueba != 0) {
            contadorPicos = 0;
            casosPrueba = scan.nextInt();
            int[] arrayPicos = new int[casosPrueba];

            if(casosPrueba == 0){
                break;
            }

            for(int i = 0; i < casosPrueba; i++){
                int datos = scan.nextInt();
                arrayPicos[i] = datos;
            }

            for(int i = 0; i < casosPrueba; i++){

                int elementoAnterior = 0;
                int elementoSiguiente = 0;
    
                if(i != 0){ /*Compruebo que no estoy en el primer elemento, de forma que tomo
                            el elemento justo despues de i, ejemplo si es 1, tomo 0*/
                    elementoAnterior = arrayPicos[i - 1];
                } else{
                    /*Si estoy en el primer elemento, pues tomo el ultimo elemento cerrando
                    el circuito circular de la montaña rusa*/
                    elementoAnterior = arrayPicos[casosPrueba - 1];
                } /*este trozo llena la variable anterior */

                if(i != casosPrueba-1){ 
                    /*Aquí miro que no estoy en el ultimo elemento, si se cumple, tomo un elemento
                    siguiente al de la posición en la que se encuentre i, ejemplo si es 0, tomo 1*/
                    elementoSiguiente = arrayPicos[i + 1];
                } else {
                    /*si la condicion no se cumple significa que estamos al final del array
                    por lo que hay que cerrar el circuito de la atracción, así que vamos al
                    ultimo elemento del array
                     */
                    elementoSiguiente = arrayPicos[0];
                } /*este trozo llena la variable siguiente */

                if(arrayPicos[i] > elementoAnterior && arrayPicos[i] > elementoSiguiente){
                    contadorPicos++;
                } /*Aquí vamos comparando, si el elemento anteriro y siguiente es menor
                a donde se encuentra i, pues significa que es un pico */


            }


            System.out.println(contadorPicos);

        }

        scan.close();

    }
}
