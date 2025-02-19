package FichaArrays;

import java.util.Arrays;
import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String eleccion = "";
        String cadenaBuscar = "";
        int index;
        String cadenaReemplazo = "";

        int tamanyo;

        tamanyo = scan.nextInt();
        scan.nextLine();

        String[] arrayPalabras = new String[tamanyo];

        for(int i = 0; i < tamanyo; i++){
            String cadena = scan.nextLine();
            arrayPalabras[i] = cadena;
        }

        while(eleccion != "terminar"){
            System.out.println("Contar");
            System.out.println("Modificar");
            System.out.println("Eliminar");
            System.out.println("Insertar");
            System.out.println("Mostrar");
            System.out.println("Terminar");
            System.out.println("");

            eleccion = scan.nextLine();

            if(eleccion.equals("terminar"))
                break;

            switch (eleccion) {
                case "contar":
                    int contadorBuscar = 0;
                    cadenaBuscar = scan.nextLine();

                    for(int i = 0; i < tamanyo; i++){
                        if(arrayPalabras[i].equals(cadenaBuscar)){
                            contadorBuscar++;
                        }
                    }
                    System.out.println("La cadena aparece " + contadorBuscar + " veces.");
                    break;

                case "modificar":
                    cadenaBuscar = scan.nextLine();
                    cadenaReemplazo = scan.nextLine();

                    for(int i = 0; i < tamanyo; i++){
                        if(arrayPalabras[i].equals(cadenaBuscar)){
                            arrayPalabras[i] = cadenaReemplazo;
                        }
                    }                    
                    break;

                    case "eliminar":
                        cadenaBuscar = scan.nextLine();
                        index = Arrays.binarySearch(arrayPalabras, cadenaBuscar);

                        for(int i = index; i < arrayPalabras.length-1; i++){
                            arrayPalabras[i] = arrayPalabras[i+1];
                        }   

                        
                    break;


                case "insertar":
                        System.out.println("Introduce en que indice quieres insertar la cadena: ");
                        index = scan.nextInt();
                        scan.nextLine();

                        cadenaBuscar = scan.nextLine();

                        for(int i = arrayPalabras.length - 1; i > index; i--){
                            arrayPalabras[i] = arrayPalabras [i-1];
                        }
                        arrayPalabras[index] = cadenaBuscar;

                        break;

                case "mostrar":
                        System.out.println(Arrays.toString(arrayPalabras));
                break;                

                    
                default:
                    System.out.println("Eleccion no valida");
                    break;
            }

        }

        scan.close();
    }
}
