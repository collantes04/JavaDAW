package EJERCICIOSOBJETOS;

import java.util.Random;

public class SimuladorDado {
    public static void main(String[] args) {
        Random rnd = new Random();

        int dado = rnd.nextInt(6)+1;
        System.out.println(dado);
    }
}