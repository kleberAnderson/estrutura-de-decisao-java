/*
   Nome do programa : ExercLt1_09
   Objetivo                            : Receba os 2 números inteiros. Calcule 
                                         e mostre a soma dos quadrados.

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex09 {
    public static void main (String args [])
    {
        int X,Y,Z;
        
        X = Integer.parseInt(JOptionPane.showInputDialog
                ("DIGITE O PRIMEIRO NÚMERO"));
        Y = Integer.parseInt(JOptionPane.showInputDialog
                ("DIGITE O SEGUNDO VALOR"));
        Z = (int) (Math.pow(X, 2) + Math.pow(Y, 2));
        
        JOptionPane.showMessageDialog(null,"A SOMA DOS QUADRADOS: "+ Z);

    }
    
}
