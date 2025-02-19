package Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EjemploMapa {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        mapa.put("Uno", 1);
        mapa.put("Dos", 2);
        mapa.put("Tres", 3);
        
        System.out.println("Recorro claves: ");

        for(String clave: mapa.keySet()){
            System.out.println("Clave: " + clave);
        }

        System.out.println("\nRecorriendo claves con iterator: ");
        Iterator<String> iteradorClaves = mapa.keySet().iterator();
        while (iteradorClaves.hasNext()) {
            System.out.println("Clave: " + iteradorClaves.next());
        }

    }
}
