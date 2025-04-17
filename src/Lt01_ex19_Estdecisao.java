/*
   Nome do programa          : ExercLt1_19
    Objetivo                              :  Receba 2 valores reais. Calcule e
                                             mostre o maior deles.
   Nome do Programador      :  Anderson Kleber
   Data de desenvolvimento :  15/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex19_Estdecisao{
    public static void main (String args[])
    {
        Double X,Y;
        X = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O PRIMEIRO NÚMERO:"));
        Y = Double.parseDouble(JOptionPane.showInputDialog("DIGITE O SEGUNDO NÚMERO:"));
        
        if (X > Y){
            JOptionPane.showMessageDialog(null,"O MAIOR NÚMERO: " + X);
        }
        else {
            if(Y > X){
                JOptionPane.showMessageDialog(null,"O MAIOR NÚMERO: " + Y);
            }
            else
                JOptionPane.showMessageDialog(null,"ERRO, NÚMEROS IGUAIS");
            }
        
        
            
        }
    }
    

