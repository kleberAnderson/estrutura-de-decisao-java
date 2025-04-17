/*
   Nome do programa : ExercLt1_28
   Objetivo                            :

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 18/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex28_Estdecisao {
    public static void main (String args[])
    {
        double P, M;
        P = Double.parseDouble(JOptionPane.showInputDialog
                            ("DIGITE O PREÇO DO PRODUTO"));
        M = Double.parseDouble(JOptionPane.showInputDialog
                            ("DIGITE A MÉDIA MENSAL DO PRODUTO"));
        if (P >= 80){
            if (M >= 1000){
                P = (P * 0.95);
                JOptionPane.showMessageDialog(null,
                            "PREÇO ATUALIZADO: "+ P);
            }
            else{
                JOptionPane.showMessageDialog(null,
                                "PREÇO ATUAL: "+ P);
            }
        }
        else if (P >= 30){
            if (M >= 500 && M < 1000){
                P = (P * 1.15);
                JOptionPane.showMessageDialog(null,
                        "PREÇO ATUALIZADO: "+ P);
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "PREÇO ATUAL: "+ P);
            }
        }
        else if (M < 500){
            P = (P * 1.1);
            JOptionPane.showMessageDialog(null,
                    "PREÇO ATUALIZADO: "+ P);   
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "PREÇO ATUAL: "+ P);
        }
    }
}
