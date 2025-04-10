package Ejercicios;
import java.util.Scanner;
public class EjemploSwitch {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numero del mes: ");

        short mes = scan.nextShort();

        switch(mes){
            case 1: case 2: case 3: case 4:;
        }
        scan.close();
    }
}
