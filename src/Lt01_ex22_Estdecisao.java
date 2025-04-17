/*
   Nome do programa : ExercLt1_22
   Objetivo                            :

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 17/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex22_Estdecisao {
    public static void main (String args[])
    {
        int X1, X2;
        X1 = Integer.parseInt(JOptionPane.showInputDialog
                    ("DIGITE O PRIMEIRO NÚMERO:"));
        X2 = Integer.parseInt(JOptionPane.showInputDialog
                    ("DIITE O SEGUNDO NÚMERO:"));
        
        if (X1 != X2){
            if (X2 > X1){
                JOptionPane.showMessageDialog
                 (null,"ORDEM CRESCENTE: "+ X1 + ", "+ X2); 
            }
            else{
                JOptionPane.showMessageDialog
                (null,"ORDEM CRESCENTE: "+ X2 + ", "+ X1);     
            }

        }
            else{
                JOptionPane.showMessageDialog
                (null, "ERRO, NÚMEROS IGUAIS!");
            }
    }    
}
