/*
   Nome do programa : ExercLt1_03
   Objetivo                            : Receber a base e a altura de um 
                                      triângulo. Calcule e mostre sua área.

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/

import javax.swing.JOptionPane;
public class Lt01_ex03{
    public static void main (String args[])
    {
        double Bas,Alt,Area;
        Bas = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A BASE DO TRIÂNGULO: "));
        Alt = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A ALTURA DO TRIÂNGULO: "));
        Area = (Bas * Alt)/2;
        
        JOptionPane.showMessageDialog(null,"ÁREA DO TRIÂNGULO: "+Area);
        
        
        
        
        
    }
}