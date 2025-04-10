package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bigde {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("123.456");
        BigDecimal num2 = new BigDecimal("78.90");
        BigDecimal suma = num1.add(num2);
        BigDecimal producto = num1.multiply(num2);
        BigDecimal division = num1.divide(num2, 2, RoundingMode.HALF_UP);

        System.out.println("Suma: "+ suma);
        System.out.println("Producto: " + producto);
        System.out.println("Division (rendodeada a 2 decimales: )" + division);
    }
}
