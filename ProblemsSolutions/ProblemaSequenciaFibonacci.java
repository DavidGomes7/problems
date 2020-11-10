package problemasequenciafibonacci;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class ProblemaSequenciaFibonacci {

    public static void main(String[] args) {
        int N, a=0, b=1, c=0;
        Scanner entrada = new Scanner(System.in);
        N = entrada.nextInt();
        if (N >= 0 && N<40) {
            for (int i=1; i<=N; i++) {
                System.out.println(a);
                c = a + b;
                a = b;
                b = c;
            } 
        } else if (N<0) {
            System.out.println("N é menor que zero");
        } else {
            System.out.println("N é maior que 40");
        }
    }
    
}
