/*
   Nome do programa : ExercLt1_07
   Objetivo                            : Receba os valores do comprimento, 
largura e altura de um paralelepípedo. Calcule e mostre seu volume.

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex07 {
    public static void main (String args[])
    {
        Double Comp, Larg, Alt, Vol;
        Comp = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O COMPRIMENTO DO PARALELEPÍPEDO"));
        Larg = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE A LARGURA DO PARALELEPÍPEDO"));
        Alt = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE A ALTURA DO PARALELEPÍPEDO"));
        
        Vol = (Comp * Larg * Alt);
        
        JOptionPane.showMessageDialog(null,"O VOLUME DO PARALELEPÍPEDO: "+ Vol);
        
    }
    
}
