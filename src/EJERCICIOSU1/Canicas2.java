package EJERCICIOSU1;

import java.util.Scanner;

public class Canicas2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casosPrueba;
        int altura;

        casosPrueba = scan.nextInt();

        for(int i = 0; i < casosPrueba; i++){
            long canicas = 1;
            long piso = 1;

            altura = scan.nextInt();

            for(long acumulador = 1; acumulador < altura; acumulador++){
                piso = piso + acumulador+1;
                canicas = canicas + piso;

            }
            
            System.out.println(canicas);
        }
        scan.close();
    }
}
    

