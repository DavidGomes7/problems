package problemadamedia;

import java.util.Scanner;

/**
 *
 * @author jdavi
 */
public class ProblemaDaMedia {

    public static void main(String[] args) {
        
        //Variaveis
        int N, num, desconto=0;
        float m, soma=0;
        
        Scanner teclado = new Scanner(System.in);
        N = teclado.nextInt(); //lê valor de N
        
        //Condição para 1<N<1000
        if (N >= 1 && N <= 1000){
            
            for (int c=0; c<N; c++){
                num = teclado.nextInt(); //lê valor de num
                
                //condição para -1000<num<1000
                if (num >= -1000 && num <= 1000){
                    soma += num;
                } else{
                    desconto += 1;
                }
                
            }//fim de for
            
            N -= desconto;
            m = soma / N; //calculo media
            System.out.println(m);
            
        } else {
            System.out.println("Valor de N inválido!");
        }
    }
    
}
