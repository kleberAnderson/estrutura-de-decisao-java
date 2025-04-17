/*
   Nome do programa          : ExercLt1_21
    Objetivo                              :
   Nome do Programador      :  Anderson Kleber
   Data de desenvolvimento :  15/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex21_Estdecisao{
    public static void main (String args[])
    {
        double N1,N2,N3,N4,Media;
        N1 = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE A 1º NOTA"));
        N2 = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE A 2º NOTA"));
        N3 = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE A 3º NOTA"));
        N4 = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE A 4º NOTA"));
        
        Media = ((N1+N2+N3+N4)/4);
        JOptionPane.showMessageDialog(null,"MÉDIA: "+ Media);
        
        if(Media >= 6){
            JOptionPane.showMessageDialog(null,"APROVADO");   
        }
        else if (Media >=3){
            JOptionPane.showMessageDialog(null,"EXAME");     
        }
        else if (Media < 3){
            JOptionPane.showMessageDialog(null,"RETIDO");     
        }   
    }    
}
