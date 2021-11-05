
package calcconversao;

import java.util.Scanner;


public class CalcConversao {

    
    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);
        
      double dolar, cotacao, real;
      
        System.out.println("Quantos dólar você tem:");
        dolar= entrada.nextDouble();
                
        System.out.println(" Valor da cotação");
        cotacao = entrada.nextDouble();
        
       real=  dolar * cotacao;
       
        System.out.println("Você tem R$" + real);
        
    }
    
}
