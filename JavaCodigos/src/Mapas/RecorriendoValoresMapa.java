package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RecorriendoValoresMapa {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);
        
        System.out.println("\nRecorrido valores: ");
        for(Integer valor : mapa.values()){
            System.out.println("Valor: " + valor);
        }

        System.out.println("\nRecorriendo valores con Iterators: ");
        Iterator<Integer> iteradorValores = mapa.values().iterator();
        while (iteradorValores.hasNext()) {
            System.out.println("Valor: " + iteradorValores.next());
        }

        System.out.println("\nRecorriendo valores con Iterator");
        mapa.values().forEach(System.out::println);
    }
}
