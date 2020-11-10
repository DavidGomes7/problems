package problemanumeroespelho;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemaNumeroEspelho {
    
    public static void main(String[] args) {
        
        
        //criando um scanner para ler um número em hexadecimal do teclado
        Scanner teclado = new Scanner(System.in);
        String numHex = teclado.nextLine();
        
 
        //variavel usada para converter numHex em um numero decimal inteiro
        int numInt = Integer.parseInt(numHex, 16);
        
        
        //convertendo o valor de numInt em uma String temporaria para poder trabalhar com vetor
        String temp = Integer.toString(numInt);
        
        //criando um vetor com um número de posições igual a quantidade de caracteres de numInt
        char[] inverso = new char[temp.length()];
        
        
        //para atribuir os valores de numInt em inverso[] e realiza a inversão
        for (int i=0; i<temp.length(); i++){
            int posInversa = temp.length() - i-1;
            inverso[i] = temp.charAt(posInversa);  
        }
            
        //converte o array inverso em uma String
        //String numInverso = Arrays.toString(inverso);
        String numInverso = new String(inverso);
        
        
        //comparando numInt/temp com numInverso
        if (temp.equals(numInverso) == true) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        
        /*
        System.out.println(numInverso);
        //para mostrar os valores do vetor
        for (int j=0; j<temp.length(); j++){
            System.out.print(inverso[j]);
        }
        System.out.println();
        */
                      
    }
    
}
