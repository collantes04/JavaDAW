import java.util.Scanner;
import java.util.Stack;

public class ParentesisBalanceados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            Stack<Character> pilaParentesis = new Stack<>();
            String caso = scan.nextLine();
            boolean estadoBalance = true;

            if(caso.isEmpty()){
                estadoBalance = false;
            }

            for(char simbolo : caso.replace(" ", "").toCharArray()){
                if(estadoBalance == true){

                    switch (simbolo) {
                        case '(':
                        case '[':
                        case '{':
                            pilaParentesis.push(simbolo);
                            break;
                        case ')':
                            if (pilaParentesis.empty() || pilaParentesis.pop() != '(') {
                                estadoBalance = false;
                            }
                            break;

                        case ']':
                            if (pilaParentesis.empty() || pilaParentesis.pop() != '[') {
                                estadoBalance = false;
                            }
                            break;

                        case '}':
                            if (pilaParentesis.empty() || pilaParentesis.pop() != '{') {
                                estadoBalance = false;
                            }
                            break;
                        default:
                            break;
                    }
                } else{
                    break;
                }

            }

            if(pilaParentesis.isEmpty() == false){
                estadoBalance = false;
            }

            if(estadoBalance == true){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }


        }

        scan.close();
    }
}
