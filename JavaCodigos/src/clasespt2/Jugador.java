package clasespt2;

public class Jugador implements Comparable<Jugador>{
    private String nombre;
    private int posicion;
    private int goles;

    public static final int PORTERO = 0;
    public static final int DEFENSA = 1;
    public static final int CENTROCAMPISTA = 2;
    public static final int DELANTERO = 3;
    private String[] posiciones = {"Portero", "Denfensa", "Centrocampista", "Delantero"};

    public Jugador(String nombre, int posicion, int goles){
        this.nombre = nombre;
        this.posicion = posicion;
        this.goles = goles;
    }

    public String toString(){
        return nombre + ": " +this.posiciones[posicion]+" ha marcado "+goles+" goles";
    }

    @Override
    public int compareTo(Jugador j){
        int orden;
        if (this.posicion == j.posicion){
            orden = j.nombre.compareTo(this.nombre);
        } else {
            orden = this.posicion - j.posicion;
        }

        return orden;
    }

    public int getPosition(){
        return this.posicion;
    }

    public String getNombre(){
        return this.nombre;
    }

}
