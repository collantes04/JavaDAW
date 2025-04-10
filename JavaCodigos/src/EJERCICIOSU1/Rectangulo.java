package EJERCICIOSU1;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        int x1;
        int y1;
        int x2;
        int y2;
        int area;
        Scanner scan = new Scanner(System.in);

        while(true){
            x1 = scan.nextInt();
            y1 = scan.nextInt();
            x2 = scan.nextInt();
            y2 = scan.nextInt();
            scan.nextLine();

            if (x1 > x2 || y1 > y2){
                break;
            }
            area = (x1 - x2) * (y1 - y2);
            System.out.println(area);
        }


        scan.close();
    }

}