package ACTIVIDBIGINTEGER;

import java.math.BigInteger;

public class PrimosBigInteger {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("104729");
        int certainty = 10;

        if (bigInt.isProbablePrime(certainty))
            System.out.println(bigInt + " es probablemete primo.");
        else
            System.out.println(bigInt + " no es primo.");
        
    }
}
