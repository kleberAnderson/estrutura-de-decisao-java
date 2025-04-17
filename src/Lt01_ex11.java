/*
   Nome do programa : ExercLt1_11
   Objetivo                            : Receba o raio de uma circunferência.
                            Calcule e mostre o comprimento da circunferência.


   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;

public class Lt01_ex11 {
    public static void main(String args[])
    {
        Double Raio,Comp;
        
        Raio = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O RAIO DA CIRCUNFERÊNCIA: "));
        
        Comp = (2 * 3.14 * Raio);
        
        JOptionPane.showMessageDialog(null,
        "O COMPRIMENTO DA CIRCUNFERÊNCIA: "+ Comp);
        
        
        
        
        
        
    } 
           
    
    
}
