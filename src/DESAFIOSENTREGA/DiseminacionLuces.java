import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiseminacionLuces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int casos = -1;

        while (casos != 0) {
            Map<Long, int[]> mapaLuces = new HashMap<>(); 
            casos = scan.nextInt();
            long diseminacion = 0;


            if(casos == 0){
                break;
            }


            for(int i = 0; i < casos; i++){
                long leds = scan.nextLong();
                
                if(mapaLuces.containsKey(leds) == false){
                    mapaLuces.put(leds, new int[]{i, i});
                } else{
                    mapaLuces.get(leds)[1] = i;
                }
            }

            if(mapaLuces.isEmpty()==false){
                for(Map.Entry<Long, int[]> luz: mapaLuces.entrySet()){
                    diseminacion += luz.getValue()[1] - luz.getValue()[0];
                }
            }
            System.out.println(diseminacion);
        }

        scan.close();
    }
}