package DESAFIOS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReferenciasCruzadas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> mapaReferencias = new HashMap<>();
        
        int casosPrueba = -1;

        while (casosPrueba!=0) {
            casosPrueba = scan.nextInt();
            scan.nextLine();

            if(casosPrueba == 0){
                break;
            }

            for(int i = 0; i < casosPrueba; i++){
                String lineas = scan.nextLine().toLowerCase();
                String[] frases = lineas.split(" ");

                for(String palabras : frases){
                    if(palabras.length() > 3){
                        if(mapaReferencias.containsKey(palabras)){
                                /*me tengo que asegurar que la palabra no vuelve a aparecer
                                para no repetir las veces que aparece por eso pongo a ver si
                                el i+1 actual está ya concatenado y si no está, lo meto en existeValor que es
                                una cadena y compruebo con el contais*/
                            String existeValor = mapaReferencias.get(palabras);

                            if(existeValor.contains(Integer.toString(i + 1)) == false){
                                mapaReferencias.put(palabras, existeValor + " " + (i+1));
                            }

                        } else {
                            mapaReferencias.put(palabras, Integer.toString((i+1)));
                        }
                    }

                }

                
            }
            System.out.println();
            for(Map.Entry<String, String> entrada : mapaReferencias.entrySet()){
                System.out.println(entrada.getKey() + " " + entrada.getValue());
            }
            System.out.println("----");

            }
            scan.close();
        }
}
        

