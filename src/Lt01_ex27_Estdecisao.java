/*
   Nome do programa : ExercLt1_27
   Objetivo                            :

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 18/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex27_Estdecisao {
    public static void main (String args[])
    {
        int Numv;
        double Extm, Temp, Me, S, Ms, Km;
        
        Numv = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE O NÚMERO DE VOLTAS"));
        Extm = Double.parseDouble(JOptionPane.showInputDialog
                            ("DIGITE A EXTENSÃO DO CIRCUITO EM METROS"));
        Temp = Double.parseDouble(JOptionPane.showInputDialog
                            ("DIGITE O TEMPO DE DURAÇÃO (MINUTOS)"));
        Me = (Numv * Extm);
        S = (double) (Temp * 60);
        Ms = (double) (Me / S);       
        Km = (double) (Ms * 3.6); 
        JOptionPane.showMessageDialog(null,
                "VELOCIDADE MÉDIA: "+ Km +"Km");
    }  
}
