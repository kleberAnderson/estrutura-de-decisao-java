/*
   Nome do programa : ExercLt1_08
   Objetivo                            : Receba o valor de um depósito em poupança.
Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex08 {
    public static void main (String args [])
    {
        double Poup, Rend;
        
        Poup = Double.parseDouble(JOptionPane.showInputDialog
                                ("DIGITE O VALOR DE UM DEPÓSITO: "));
        Rend = Poup * (Math.pow((1+00.013), 1));
        
        JOptionPane.showMessageDialog(null,
                                ("VALOR DE POUPANÇA APÓS RENDA DE 1,3% a.m." + Rend));
        
        
        
        
        
        
        
    
        
        
        
    }
    
}
