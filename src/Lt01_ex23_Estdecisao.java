/*
   Nome do programa : ExercLt1_23
   Objetivo                            :

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 18/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex23_Estdecisao {
    public static void main (String args[]){
        
        double X1, X2, X3, X4;
        
        JOptionPane.showMessageDialog(null,
                            "DIGITE TRÊS NÚMEROS EM ORDEM CRESCENTE");
        X1 = Double.parseDouble(JOptionPane.showInputDialog
                            ("DIGITE O 1º NÚMERO:"));
        X2 = Double.parseDouble(JOptionPane.showInputDialog
                            ("DIGITE O 2º NÚMERO:"));
        X3 = Double.parseDouble(JOptionPane.showInputDialog
                            ("DIGITE O 3º NÚMERO:"));
        JOptionPane.showMessageDialog(null,
                            "DIGITE O 4º NÚMERO FORA DE ORDEM");
        X4 = Double.parseDouble(JOptionPane.showInputDialog
                            ("DIGITE O 4º NÚMERO:"));
        if (X4 > X3){
            JOptionPane.showMessageDialog(null,
                              "ORDEM: "+ X1+", "+X2+", "+X3+", "+X4);
        }
        else if(X4 > X2){
        JOptionPane.showMessageDialog(null,
                              "ORDEM: "+ X1+", "+X2+", "+X4+", "+X3);
        }
        else if (X4 > X1){
            JOptionPane.showMessageDialog(null,
                              "ORDEM: "+ X1+", "+X4+", "+X2+", "+X3);    
        }
        else {
            JOptionPane.showMessageDialog(null,
                              "ORDEM: "+ X4+", "+X1+", "+X2+", "+X3);
        }
    } 
}
