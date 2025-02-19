package ACTIVIDBIGINTEGER;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimosDeRiesgo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casosPrueba;
        BigInteger suma = new BigInteger("0");
        casosPrueba = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < casosPrueba; i++){
            String palabra = scan.nextLine(); 
            for(int j = 0; j < palabra.length(); j++){
                int letra = (int) palabra.charAt(j);
                suma = suma.add(BigInteger.valueOf(letra)); //Sacado de la API de Java
            }

            while (true) {
                suma = suma.subtract(BigInteger.ONE);
                boolean estado = suma.isProbablePrime(10);
                if(estado){
                    break;
                }
            }
            int resultado = suma.intValue();
            System.out.println(resultado);
        }
        scan.close();
    }
}