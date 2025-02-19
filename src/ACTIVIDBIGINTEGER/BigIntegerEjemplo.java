package ACTIVIDBIGINTEGER;

import java.math.BigInteger;


public class BigIntegerEjemplo {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("987654321987654321987654321");
        BigInteger num2 = new BigInteger("123456789123456789123456789");

        //Operaciones
        BigInteger sum = num1.add(num2);
        BigInteger product = num1.multiply(num2);
        BigInteger gcd = num1.gcd(num2);

        System.out.println("Suma: " + sum);
        System.out.println("Producto: " + product);
        System.out.println("MCD: " + gcd);
    }
}
