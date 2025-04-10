package clasespt2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JugadorTest {
    public static void main(String[] args) {
        List<Jugador> lista = new ArrayList<>();

        lista.add(new Jugador ("Iker Casillas", Jugador. PORTERO,3)); 
        lista.add(new Jugador ("Jesús Navas", Jugador. DELANTERO, 10)); 
        lista.add(new Jugador ("Xabi Alonso", Jugador.CENTROCAMPISTA,4)); 
        lista.add(new Jugador ("Sergio Ramos", Jugador. DEFENSA, 2)); 
        lista.add(new Jugador ("Alvaro Arbeloa", Jugador.DEFENSA, 1)); 
        lista.add(new Jugador ("Andrés Iniesta", Jugador.CENTROCAMPISTA, 12)); 
        lista.add(new Jugador ("David Villa", Jugador. DELANTERO, 15)); 
        lista.add(new Jugador ("Fernando Torres", Jugador.DELANTERO, 2)); 
        lista.add(new Jugador ("José Manuel Reina", Jugador.PORTERO, 1)); 
        lista.add(new Jugador ("Roberto Soldado", Jugador.DELANTERO, 12)); 
        lista.add(new Jugador ("Santiago Cazorla", Jugador.CENTROCAMPISTA, 5)); 
        lista.add(new Jugador ("Jordi Alba", Jugador. DEFENSA, 2)); 
        lista.add(new Jugador("Cesc Fabregas", Jugador.CENTROCAMPISTA,4));

        Collections.sort(lista);
        lista.forEach((n) -> System.out.println(n));;
    }
}
