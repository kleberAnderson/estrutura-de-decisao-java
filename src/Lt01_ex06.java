/*
   Nome do programa : ExercLt1_06
   Objetivo                            : Receba os valores em x e y. Efetua a 
troca de seus valores e mostre seus conteúdos.

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex06 {
    public static void main(String args[])
    {
        int X,Y,Save;
        X = Integer.parseInt(JOptionPane.showInputDialog
                ("DIGITE O VALOR DE X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog
                ("DIGITE O VALOR DE Y"));
        
        Save = X;
        X = Y;
        Y = Save;
        
        JOptionPane.showMessageDialog(null,"O VALOR DE X: "+ X);
        JOptionPane.showMessageDialog(null,"O VALOR DE Y: "+ Y);
        
    }
    
}
