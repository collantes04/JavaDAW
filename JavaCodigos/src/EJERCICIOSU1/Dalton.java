package EJERCICIOSU1;

import java.util.Scanner;

public class Dalton {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long personajes = 1; 
        long dalton;
        long aux;


        while (personajes != 0){
            boolean flag = true;
            boolean banderaDecreciente = true;
            personajes = scan.nextLong();
            scan.nextLine();

            if(personajes == 0){
                break;
            }
            
            aux = scan.nextLong();
            for(int i = 1; i < personajes; i++){
                    dalton = scan.nextLong();
                    if (dalton <= aux) {
                        flag = false;
                    }
                    if(dalton >= aux){
                        banderaDecreciente = false;
                    }
                    aux = dalton;
            }
            scan.nextLine();


            if(flag || banderaDecreciente){
                System.out.println("DALTON");
            } else{
                System.out.println("DESCONOCIDOS");
            }
        }
            
        scan.close();    
    }
        
}
