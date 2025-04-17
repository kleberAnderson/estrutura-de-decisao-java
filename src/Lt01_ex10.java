/*
   Nome do programa : ExercLt1_10
   Objetivo                            : Receba 2 números reais. Calcule e 
                                        mostre a diferença desses valores.


   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex10 {
    public static void main (String args[])
    {
        Double X, Y, Z;
        X = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O PRIMEIRO NÚMERO REAL: "));
        Y = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O SEGUNDO NÚMERO REAL "));
        
        Z = (X- Y);
        
        JOptionPane.showMessageDialog
        (null,"A DIFERENÇA DO PRIMEIRO PELO SEGUNDO:"+ Z);
        
        
        
        
    }
    
}
