package DESAFIOSENTREGA;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;



public class NumerosAfortunados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casosPrueba = -1;

        while (casosPrueba!=0) {
            Deque<Integer> colaNumeros = new LinkedList<>();
            int saltos = 2;
            casosPrueba = scan.nextInt();

            if(casosPrueba == 0){
                break;
            }


            for(int i = 1; i<=casosPrueba; i++){
                 colaNumeros.offer(i);
            }

            while (colaNumeros.size() >= saltos) {
                int tam = colaNumeros.size();
                for(int j = 0; j < tam; j++){

                    if(j==0){
                        colaNumeros.pollFirst();
                    }else if (j%saltos==0){
                        colaNumeros.poll();
                    } else{
                        int numero = colaNumeros.remove();
                        colaNumeros.offer(numero);
                    }
                    
                }
                saltos ++;
            }

            System.out.print(casosPrueba + ":");
            int tamanioFinal = colaNumeros.size();
            for(int x = 0; x < tamanioFinal; x++){
                int num = colaNumeros.pollLast();
                System.out.print(" " + num);
            }
            System.out.println();
        }

        scan.close();
    }
}