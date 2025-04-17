/*
   Nome do programa : ExercLt1_02
   Objetivo                            : Receba o salário de um funcionário e 
                                     mostre o novo salário com reauste de 15%.

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex02 
{
    public static void main (String args [])
    {
        Double Sal,Reaj;
        
        Sal = Double.parseDouble(JOptionPane.showInputDialog("DIGITE SALÁRIO: "));
        Reaj = (Sal * 1.15);
        
        JOptionPane.showMessageDialog(null, "SALÁRIO A RECEBER: "+ Reaj);
        
        
        
        
        
    }
    
    
}
