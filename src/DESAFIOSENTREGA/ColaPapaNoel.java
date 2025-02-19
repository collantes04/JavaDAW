import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ColaPapaNoel {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int casosPrueba = scan.nextInt();
    for(int i = 0; i < casosPrueba; i++){
                Queue<Integer> colaNinos = new LinkedList<>();
                int regalosAitor = 0;
                int numNinos = scan.nextInt();
                int posicionAitor = scan.nextInt();
                int tiempo = 0;

                for(int j = 0; j < numNinos; j++){
                    int regalosNinos = scan.nextInt();
                    colaNinos.offer(regalosNinos);
                    if(j == posicionAitor - 1){
                        regalosAitor = regalosNinos;
                    }
                }

                int controlPosicion = posicionAitor;
                while (regalosAitor > 0){
                    int estadoNino = colaNinos.poll();
                    estadoNino--;    
                    tiempo +=2;

                    if(estadoNino > 0){
                        colaNinos.offer(estadoNino);

                    }
                    controlPosicion--;

                    if(controlPosicion == 0){
                        regalosAitor--;
                        controlPosicion = colaNinos.size();
                    }

                }

                System.out.println(tiempo);
            }
            scan.close();

        }

}