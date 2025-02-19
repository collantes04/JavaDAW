package EJERCICIOSOBJETOS;

import java.util.Random;

public class Actividad3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int limite = 100;
        int acumuladorMedia = 0;
        int acumuladorMax = 100;
        int acumuladorMin = 199;

        for(int i = 0; i < 50; i++){
            int resultado = rnd.nextInt(limite) + 100;
            acumuladorMedia = acumuladorMedia + resultado;


            if(resultado > acumuladorMax){
                acumuladorMax = resultado;
            }

            if(resultado < acumuladorMin){
                acumuladorMin = resultado;
            }
        }

        float media = acumuladorMedia / 50;
        System.out.println("Media: "+ media);
        System.out.println("Maximo: "+ acumuladorMax);
        System.out.println("Minimo: "+ acumuladorMin);

    }
}
