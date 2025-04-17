/*
   Nome do programa : ExercLt1_24
   Objetivo                            :

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 18/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex24_Estdecisao {
    public static void main (String args[])
    {
        int X;
        X = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE UM NÚMERO INTEIRO:"));
        if (X % 2 == 0){
            if (X % 3 == 0){
                JOptionPane.showMessageDialog(null,
                        "NÚMERO " + X +", DIVISÍVEL POR 2 E 3");
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "NÚMERO "+ X + ", DIVISÍVEL APENAS POR 2");
            }   
        }
        
        else if (X % 3 == 0){
            JOptionPane.showMessageDialog(null,
                    "NÚMERO "+ X + ", DIVISÍVEL POR 3");
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "NÚMERO " + X + ", SEM DIVISIBILIDADE POR 2 E 3");
        }
    }  
}
