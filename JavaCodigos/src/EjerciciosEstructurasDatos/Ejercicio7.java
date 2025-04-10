package EjerciciosEstructurasDatos;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) throws IOException{
        File fichero = new File("EjerciciosEstructurasDatos\\fichero.txt");
        Scanner scan = new Scanner(fichero);

        Map<String, Integer> mapaPalabras = new HashMap<>();

        while (scan.hasNextLine()){
            String frase = scan.nextLine();

            for(String palabra: frase.replace(",", "").split(" ")){
                if (mapaPalabras.containsKey(palabra) == false) {
                    mapaPalabras.put(palabra, 1);
                } else {
                    mapaPalabras.put(palabra, mapaPalabras.get(palabra)+1);
                }
            }
            
        }

        for(Map.Entry<String, Integer> entrada : mapaPalabras.entrySet()){
            System.out.println(entrada.getKey() + " ->" + entrada.getValue());
        }

        scan.close();
    }
}
