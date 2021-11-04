
package calcMédia;

import java.util.Scanner;


public class CalcMédia {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
        String aluno ;
        aluno = entrada.nextLine();
        
      double nota1, nota2, nota3, media;
      
                   
        
        System.out.println("Infome seu nome:");
        aluno= entrada.nextLine();
                
        System.out.println("Primeira nota:");
        nota1 = entrada.nextDouble();
        
        System.out.println("Segunda nota:");
        nota2 = entrada.nextDouble();
        
        System.out.println("Terceira nota:");
        nota3 = entrada.nextDouble();
        
        media = ( nota1 + nota2 + nota3)/3;
        
        System.out.println("O valor da média é:" + media);
    }
    
}
