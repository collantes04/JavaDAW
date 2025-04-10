package EJERCICIOSOBJETOS;

public class Actividad6 {
    public static void main(String[] args) {
        int numero = (int) (Math.random()*100) + 1;
        int numero2 = (int) (Math.random()*100) + 1;
        int numero3 = (int) (Math.random()*100) + 1;

        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);

        int maximo = Math.max(numero, numero2);
        int maximo2 = Math.max(maximo, numero3);

        System.out.println("El maximo es : " + maximo2);

    }
}