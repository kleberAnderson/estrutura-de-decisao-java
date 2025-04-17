/*
   Nome do programa : ExercLt1_26
   Objetivo                            :

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 18/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex26_Estdecisao {
    public static void main (String args[])
    {
        int N1, N2;
        N1 = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE O PRIMEIRO VALOR"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE O SEGUNDO VALOR"));
        if (N1 > N2 ){
            if (N1 % N2 == 0){
                JOptionPane.showMessageDialog(null,
                        N1 +" É MULTIPLO DE "+ N2);
            }
            else {
                JOptionPane.showMessageDialog(null,
                        N1 +" NÃO É MULTIPLO "+ N2);
            }
        }
        else if (N2 > N1){
            if (N2 % N1 == 0 ){
                JOptionPane.showMessageDialog(null,
                        N2 +" É MULTIPLO DE "+ N1);
            }
            else {
                JOptionPane.showMessageDialog(null,
                N2 +" NÃO É MULTIPLO DE "+ N1);
            }    
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "VALORES IGUAIS, AMBOS MULTIPLOS");           
        }  
    }   
}
