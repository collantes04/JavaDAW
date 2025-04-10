package DESAFIOS;
import java.util.Scanner;

public class CodigoBarras {
    public static void main(String[] args) {
        final String EEUU = "0";
        final String BULGARIA = "380";
        final String INGLATERRA = "50";
        final String IRLANDA = "539";
        final String PORTUGAL = "560";
        final String NORUEGA = "70";
        final String VENEZUELA = "759";
        final String CUBA = "850";
        final String INDIA = "890";

        Scanner scan = new Scanner(System.in);
        String codigoBarras = "1";

        while (!codigoBarras.equals("0")) {
            int longitud;
            int numerosUltimo = 0;
            int suma = 0;
            String codigoPais = "";
            String nombrePais = "";
            String resultado = "NO";
            boolean control = true;

            codigoBarras = scan.nextLine();

            if (codigoBarras.equals("0"))
                break;

            if (codigoBarras.length() <= 8)
                longitud = 8;
            else
                longitud = 13;

            while (codigoBarras.length() < longitud) {
                codigoBarras = "0" + codigoBarras;
            }

            for (int i = codigoBarras.length() - 2; i != -1; i--) {
                if (control) {
                    suma = suma + ((codigoBarras.charAt(i) - 48) * 3);
                    control = false;
                } else {
                    suma = suma + (codigoBarras.charAt(i) - 48);
                    control = true;
                }
            }

            numerosUltimo = Integer.parseInt(codigoBarras.substring(codigoBarras.length() - 1));

            if ((suma + numerosUltimo) % 10 == 0)
                resultado = "SI";

            if (codigoBarras.length() == 13 && resultado.equals("SI")) {
                for (int j = 1; j <= 3; j++) {
                    codigoPais = codigoBarras.substring(0, j);
                    switch (codigoPais) {
                        case EEUU:
                            nombrePais = "EEUU";
                            break;
                        case BULGARIA:
                            nombrePais = "Bulgaria";
                            break;
                        case INGLATERRA:
                            nombrePais = "Inglaterra";
                            break;
                        case IRLANDA:
                            nombrePais = "Irlanda";
                            break;
                        case PORTUGAL:
                            nombrePais = "Portugal";
                            break;
                        case NORUEGA:
                            nombrePais = "Noruega";
                            break;
                        case VENEZUELA:
                            nombrePais = "Venezuela";
                            break;
                        case CUBA:
                            nombrePais = "Cuba";
                            break;
                        case INDIA:
                            nombrePais = "India";
                            break;
                        default:
                            nombrePais = "Desconocido";
                            break;
                    }
                    if (!nombrePais.equals("Desconocido")) {
                        break;
                    }
                }
                resultado += " " + nombrePais;
            }

            System.out.println(resultado);
        }
        scan.close();
    }
}