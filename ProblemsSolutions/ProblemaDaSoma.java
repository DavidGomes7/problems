package problemadasoma;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProblemaDaSoma {

    public static void main(String[] args) {
        
        int N, num, soma_dec = 0, soma_par = 0, soma_imp = 0;
        
        System.out.print("Informe a quantidade de números inteiros que deseja somar: ");
        Scanner teclado = new Scanner(System.in); 
        N = teclado.nextInt(); //variavel que armazena a quantidade de inteiros que serão lidos
        
        //condição para 1<N<1000
        if (N>1 && N<1000) {
            for (int c=1; c<=N;c++){
                System.out.println("Digite o " + c + " valor: ");
                num = teclado.nextInt();
                soma_dec += num;     //realiza a soma de decimais 
                
                if (num %2 == 0){    //condição para par
                    soma_par += num;
                } else {            //condição para impar
                    soma_imp += num;
                }
                /*condição de suspensão do programa caso a soma resulte em um número inteiro de 32 bits
                if (soma_dec > 2147483647){
                    System.out.println("Limite de tamanho atingido!");
                    break;
                }*/
            } 
        } else {
            System.out.println("Quantidade Inválida!");
        }
        
        System.out.println("Soma dos valores: " + soma_dec);
        System.out.println("Soma dos pares em hexadecimal é: " + Integer.toHexString(soma_par));
        System.out.println("A soma dos valores impares em octal é: " + Integer.toOctalString(soma_imp));
    }
    
}
