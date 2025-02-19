import java.util.Scanner;
public class EjemploWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 1;
        while (num != 0) {
            System.out.println("Pulse 0 para salir ");
            num = scan.nextInt();
            
        }

        scan.close();
    }
    
}
