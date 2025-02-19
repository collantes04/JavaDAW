package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EntradasMapas {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);
        
        System.out.println("\nRecorrido entradas: ");
        for(Map.Entry<String, Integer> entrada : mapa.entrySet()){
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        System.out.println("\nRecorriendo entradas con Iterators: ");
        Iterator<Map.Entry<String, Integer>> iteradorEntradas = mapa.entrySet().iterator();
        while (iteradorEntradas.hasNext()) {
            Map.Entry<String, Integer> entrada = iteradorEntradas.next();
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }

        System.out.println("\nRecorriendo valores con forEach y Lambda");
        mapa.forEach((clave, valor) -> System.out.println("Clave: " + clave + ", Valor: " + valor));
    }   
}
