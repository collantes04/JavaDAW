import java.util.Scanner;

public class EjemploDoWhile {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        do{
            System.out.println("Introduce un número mayor que 100: ");
            num = scan.nextInt();
        } while (num <= 100);

        scan.close();
    }
}
