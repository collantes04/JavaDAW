package ACTIVIDBIGINTEGER;

import java.math.BigInteger;
import java.util.Scanner;

public class CuadradosImperfectos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String numero = scan.nextLine();
            BigInteger entrada = new BigInteger(numero, 10);
            String hexadecimal = entrada.toString(16);
            char numeroFinal = hexadecimal.charAt(hexadecimal.length()-1);

            if(numeroFinal == '0' || numeroFinal == '1' || numeroFinal == '4' || numeroFinal == '9'){
                System.out.println("NO SE");
            } else {
                System.out.println("IMPERFECTO");
            }
        }
        scan.close();
    }
}
