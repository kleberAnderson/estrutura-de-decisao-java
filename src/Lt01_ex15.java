/*
   Nome do programa : ExercLt1_15
   Objetivo                            : Receba os valores de 2 catetos
                de um triângulo retângulo. Calcule e mostre a hipotenusa.


   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex15 {
    public static void main (String args[])
    {
        double Cat1, Cat2, Hip;
        Cat1 = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O PRIMEIRO CATETO DO TRIÂNGULO: "));
        Cat2 = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O SEGUNDO CATETO DO TRIÂNGULO: "));
        Hip = Math.sqrt((Math.pow(Cat1, 2)+ Math.pow(Cat2, 2)));
        JOptionPane.showMessageDialog
                    (null,"A HIPOTENUSA DO TRIÂNGULO: " + Hip);
        
        
    }
    
}
