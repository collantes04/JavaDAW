package DESAFIOSENTREGA;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Cubinfinitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Boolean estadoNumero = true;
        int numeros = -1;
        int repetido = -1;

        while(numeros != 0){
            Set<Integer> conjunto = new LinkedHashSet<>();
            numeros = scan.nextInt();

            if(numeros == 0){
                break;
            }

            while(true){

                if (!conjunto.add(numeros)) {
                    estadoNumero = false;
                    repetido = numeros;
                    break;
                } else {
                    estadoNumero = true;
                }

                int suma = 0;
                int auxiliar = numeros;

                while (auxiliar > 0) {
                    int n = auxiliar % 10;
                    suma += Math.pow(n, 3);
                    auxiliar = auxiliar / 10;    
                }


                numeros = suma;

            }

            boolean esNumero = true;
            for (Integer iterador : conjunto) {
                if (!esNumero) {
                    System.out.print(" - ");
                }
                System.out.print(iterador);
                if (iterador == 1) {
                    estadoNumero = true;
                }
                    esNumero= false;
            }

            if(!estadoNumero){
                System.out.print(" - " + repetido);
            }

            if(estadoNumero){
                System.out.println(" -> " + "cubifinito.");
            } else {
                System.out.println(" -> " + "no cubifinito.");
            }

        }

        scan.close();
    }
}
