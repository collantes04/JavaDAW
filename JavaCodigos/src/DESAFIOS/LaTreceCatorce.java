package DESAFIOS;

import java.util.Scanner;

public class LaTreceCatorce {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casosPrueba;
        
        casosPrueba = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < casosPrueba; i++){

            String llave = scan.nextLine();


            String [] auxiliar = llave.split("-");

            String numero1 = auxiliar[0];
            String numero2 = auxiliar[1];

            Integer numeroPrimeroFinal = Integer.parseInt(numero1);
            Integer numeroSegundoFinal = Integer.parseInt(numero2);

            if(numeroPrimeroFinal == numeroSegundoFinal+1 && numeroPrimeroFinal%2 != 0)
                System.out.println("SI");
            else if (numeroPrimeroFinal == numeroSegundoFinal-1 && numeroSegundoFinal%2 != 0)
                System.out.println("SI");
            else
                System.out.println("NO");
            
        }

        scan.close();
    }

}
