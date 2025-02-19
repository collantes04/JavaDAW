package ACTIVIDBIGINTEGER;

import java.math.BigInteger;
import java.util.Scanner;

public class CuantasMeLlevo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger resultado = new BigInteger("0");

        while(true){
            BigInteger n1 = scan.nextBigInteger();
            BigInteger n2 = scan.nextBigInteger();

            BigInteger acarreo = BigInteger.ZERO;
            resultado = BigInteger.ZERO;

            if(n1.equals(BigInteger.ZERO) && n2.equals(BigInteger.ZERO)){
                break;
            }
            
            while (n1 != BigInteger.ZERO || n2 != BigInteger.ZERO) {
                BigInteger digitoPrimero = n1.mod(BigInteger.TEN);
                BigInteger digitoSegundo = n2.mod(BigInteger.TEN);
                
                if(digitoPrimero.add(digitoSegundo).add(acarreo).compareTo(BigInteger.TEN) >= 0){
                    resultado = resultado.add(BigInteger.ONE);
                    acarreo = BigInteger.ONE;
                }
                else{
                    acarreo = BigInteger.ZERO;
                }
                n1 = n1.divide(BigInteger.TEN);
                n2 = n2.divide(BigInteger.TEN);
            }
            System.out.println(resultado);
        } 

        scan.close();
    }
}
