package DESAFIOS;

import java.util.Scanner;

public class AburrimientoAutopista {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long casosPrueba;

        casosPrueba = scan.nextLong();
        scan.nextLine();

        for(int i = 0; i < casosPrueba; i++){
            String matriculas = "";
            long contadorNueva = 0;
            long contadorVieja = 0;
            boolean matriculaPrimera = true;
            String matriculaEdu = "";

            while(!matriculas.equals("0")){
                matriculas = scan.next();
                if(!matriculas.equals("0")) {
                    if(matriculaPrimera){
                        matriculaEdu = matriculas;
                        matriculaPrimera = false;
                    } else{
                        String letrasEdu = matriculaEdu.substring(4);
                        String letras = matriculas.substring(4);
                        String numerosEdu = matriculaEdu.substring(0,4);
                        String numeros = matriculas.substring(0,4);

                        int compararLetras = letrasEdu.compareTo(letras);

                        if(compararLetras == 0){
                            int compararNumeros = numerosEdu.compareTo(numeros);
                            if(compararNumeros < 0)
                                contadorVieja++;
                            else
                                contadorNueva++;
                        } else if (compararLetras < 0) {
                            contadorVieja++;
                        } else {
                            contadorNueva++;
                        }
                    }
                }
            }
            System.out.printf("%d %d\n", contadorVieja, contadorNueva);

        }

        scan.close();
    }
}