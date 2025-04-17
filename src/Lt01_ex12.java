/*
   Nome do programa : ExercLt1_12
   Objetivo                            : Receba o ano de nascimento e o 
    ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.


   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex12 {
    public static void main(String args[])
    {
        int Anon, Anoa, Idadef;
        Anon = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE O ANO DE NASCIMENTO:"));
        
        Anoa = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE O ANO ATUAL:"));
        
        Idadef = (Anoa - Anon);
        JOptionPane.showMessageDialog
                (null,"IDADE ATUAL: " + Idadef + " ANOS");
        Idadef = ((Anoa-Anon)+17);
        
        
        JOptionPane.showMessageDialog
                (null,"A IDADE DAQUI À 17 ANOS: "+ Idadef + " ANOS");
        
        
        
    }
    
}
