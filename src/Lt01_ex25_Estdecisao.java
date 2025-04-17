/*
   Nome do programa : ExercLt1_25
   Objetivo                            :

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 18/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex25_Estdecisao {
    public static void main (String args[])
    {
        int Hi, Mi, Hf, Mf, H, M;
        
        Hi = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE A HORA INICIAL"));
        Mi = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE O MINUTO INICIAL"));
        Hf = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE A HORA FINAL"));
        Mf = Integer.parseInt(JOptionPane.showInputDialog
                            ("DIGITE O MINUTO FINAL"));
        H = (Hf - Hi);
        M = (Mf - Mi);
        
        if (H == 0){
            if (M == 0){
                JOptionPane.showMessageDialog(null,
                        "TEMPO EXCEDIDO >= 24h");
            }
            else if (M < 0){
                M = (M +60);
                JOptionPane.showMessageDialog(null,
                        "HORAS JOGADAS: "+ H +":"+ M);
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "HORAS JOGADAS: "+ H +":"+M);
            }
        }
        else if (H < 0){
            H = (H + 24);
            if (M == 0){
                JOptionPane.showMessageDialog(null,
                        "HORAS JOGADAS "+ H +":"+ M);
            }
            else if (M < 0){
                M = (M + 60);
                JOptionPane.showMessageDialog(null,
                        "HORAS JOGADAS"+ H +":"+M);
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "HORAS JOGADAS "+ H +":"+M);
            }     
        }
        else if (M == 0){
            JOptionPane.showMessageDialog(null,
                    "HORAS JOGADAS "+ H +":"+ M);
        }
        else if (M < 0){
            H = (H -1);
            M = (M + 60);
            JOptionPane.showMessageDialog(null,
                    "HORAS JOGADAS: "+ H +":"+ M);    
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "HORAS JOGADAS: "+ H +":"+ M);
        }    
    }   
}
