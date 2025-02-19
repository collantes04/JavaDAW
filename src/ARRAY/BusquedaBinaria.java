package ARRAY;

public class BusquedaBinaria {
    public static int busquedaBinaria(int[] numeros, int objetivo){
        int encontrado = -1;

        // i, j apuntan al primer y último del array
        int i = 0, j = numeros.length - 1;
        
        //Buscar hasta que el intervaalo sea vacío i>j
        while(i <= j){
            int m = i + (j - i)/2; 
            if (numeros[m] < objetivo)
                i = m + 1;
            else if (numeros[m] > objetivo)
                j = m - 1;
            else {
                encontrado = m;
                break;
            }

        }
        return encontrado;
    }

    public static void main(String[] args) {
        int [] numeros = {1, 3, 4, 7, 13, 21, 55};
        int num = 21;
        int index = busquedaBinaria(numeros, num);

        System.out.println("El número " + num +" se encuentra en la posición: " + index);
    }
}