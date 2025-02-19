package DESAFIOS;

import java.util.Scanner;

public class QuintoMilenio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casosPrueba;

        
        casosPrueba = scan.nextInt();
        scan.nextLine();

        for(int i = 0; i < casosPrueba; i++){
            String frase = scan.nextLine().toLowerCase().replace(" ", "");
            String mensaje = scan.nextLine().toLowerCase().replace(" ", "");
            boolean estado = true;

            for(int j = 0; j < mensaje.length(); j++){
                char letraMensaje = mensaje.charAt(j);
                int indice = frase.indexOf(letraMensaje);

                if(indice != -1){
                    frase = frase.substring(indice + 1);

                } else {
                    estado = false;
                    break;
                }
            }
            if (estado) {
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }

        }

        scan.close();

    }
}