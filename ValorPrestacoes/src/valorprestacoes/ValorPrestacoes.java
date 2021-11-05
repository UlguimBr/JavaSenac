
package valorprestacoes;

import java.util.Scanner;


public class ValorPrestacoes {

    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
 
 int prestacoes = 5;
 double produto, valorPrestacao;
 
        System.out.println("Valor do produto:");
        produto = entrada.nextDouble();
        
        valorPrestacao = produto / prestacoes;
        
        System.out.println("O valor da parcela é R$" + valorPrestacao);
        
 
 
 
    }
    
}
