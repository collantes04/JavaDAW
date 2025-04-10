package ACTIVIDADESARRAYS;

public class ProductoEscalar {
    public static void main(String[] args) {
        int [] vectorUno = {4, 8, 9};
        int [] vectorDos = {9, 3, 2};
        int acumuladorResultado = 0;

        for(int i = 0; i < vectorUno.length; i++){
            acumuladorResultado += vectorUno[i] * vectorDos[i];
        }
        System.out.println(acumuladorResultado);
    }
}
