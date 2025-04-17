/*
   Nome do programa : ExercLt1_14
   Objetivo                            : Receba 2ângulos de um triângulo.
                                   Calcule e mostre o valor do 3º ângulo.


   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex14 {
    public static void main (String ars[])
    {
        int Angulo1, Angulo2,Angulo3;
        Angulo1 = Integer.parseInt(JOptionPane.showInputDialog
                              ("DIGITE O PRIMEIRO ÂNGULO: "));
        Angulo2 = Integer.parseInt(JOptionPane.showInputDialog
                               ("DIGITE O SEGUNDO ÂNGULO: "));
        Angulo3 = (180 - (Angulo1 + Angulo2));
        JOptionPane.showMessageDialog
                      (null,"O VALOR DO 3º ÂNGULO: " + Angulo3 + "º");
        
        
    }
    
    
}
