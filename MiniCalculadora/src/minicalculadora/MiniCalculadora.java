
package minicalculadora;

import java.util.Scanner;

public class MiniCalculadora {

  
    public static void main(String[] args) {
     //declarqndo variaveis
     double num1, num2;
     double soma, subt, multi, divi;
     
     //Biblioterca que ira permitir a interação do usuario
     Scanner entrada = new Scanner(System.in);
     
     //solicitar ao usuario os dois numeros 
        System.out.println("--Mini calculadora--");
        
        System.out.println("Digite um numero");
        num1 = entrada.nextDouble();
        
        System.out.println("Digite outro numero");
        num2 = entrada.nextDouble();
        
        //Especificar o que cada variavel faz
        soma = num1 + num2;
        subt = num1 - num2;
        multi = num1 * num2;
        divi = num1 / num2;
        //imprimir (mostrar) na tela os resultados
        System.out.println("A soma dos numeros: " + num1+ " + " + num2 + " é: " + soma);
        System.out.println("A subtração dos numeros: " + num1+ " - " + num2 + " é: " + subt);
        System.out.println("A multiplicação dos numeros: " + num1+ " * " + num2 + " é: " + multi);
        System.out.println("A divisão dos numeros: " + num1+ " / " + num2 + " é: " + divi);
    }
  
    
}
