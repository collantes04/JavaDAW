import java.util.Scanner;
public class EjemploFor {
    public static void main(String[] args) {
        double potencia;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            potencia = Math.pow(i,2);
            System.out.println(potencia);
        }

        scan.close();
    }
}
