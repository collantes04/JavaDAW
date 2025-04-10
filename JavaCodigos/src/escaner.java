import java.util.Scanner;

public class escaner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println(num);

        String nombre = sc.nextLine();
        System.out.println(nombre);
        sc.close();
    }    
}
