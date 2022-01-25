package mediaautod;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MediaAutoD {
    
    public static void main(String[] args) {
        
        String distancia;
        String litros;
        float media;
        //Entrada de dados
        distancia = JOptionPane.showInputDialog("Informe a distancia percorrida: ");
        float distConv = Float.parseFloat(distancia);
        
        litros = JOptionPane.showInputDialog("Informe a quantidade de litros de combustivel; ");
        float litrosConv = Float.parseFloat(litros);
        
        media = distConv / litrosConv; //Formula - processamento
        String msg = "Litros" + " de combustivel. \nSua Média é: " + media;
//Saida de dados
        JOptionPane.showMessageDialog(null, msg);
    }
    
}
