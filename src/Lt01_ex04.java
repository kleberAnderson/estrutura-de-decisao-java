/*
   Nome do programa : ExercLt1_04 
   Objetivo                            : Receba a temératura em graus Celsius.
Calcule e mostre a sua temperatura convertida em fahrenheit F =( 9*C+160)/5.

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex04 {
    public static void main(String args[])
    {
        double Celsius, F;
        Celsius = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A TEMPERATURA EM Cº"));
        F = ((9 * Celsius)+160)/5;
        
        JOptionPane.showMessageDialog(null,"TEMPERATURA EM FAHRENHEIT: "+ F);
        
    }
    
}
