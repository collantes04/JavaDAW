package EJERCICIOSU1;

import java.util.Scanner;

public class SanFermines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int toros;
        int velocidades;
        int resultado;
            
        while(scan.hasNext()){
            resultado = 0;
            toros = scan.nextInt();
            for(int j = 0; j < toros; j++){
                velocidades = scan.nextInt();
                if(velocidades > resultado){
                    resultado = velocidades;
                }
            }
            System.out.println(resultado);
        }
        scan.close();
    }
}

