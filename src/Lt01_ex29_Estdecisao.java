/*
   Nome do programa : ExercLt1_29
   Objetivo                            :

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 18/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex29_Estdecisao {
    public static void main (String args[])
    {
        int Opc;
        double I, R;
        
        Opc = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE O TIPO DE INVESTIMENTO:"));
         
        switch (Opc) {
            case 1:
                I = Double.parseDouble(JOptionPane.showInputDialog
                    ("DIGITE O VALOR DO INVESTIMENTO"));
                R = (I * (Math.pow((1 + 0.03), 30)));
                JOptionPane.showMessageDialog(null,
                        "VALOR CORRIGIDO: "+ R);
                break;
            case 2:
                I = Double.parseDouble(JOptionPane.showInputDialog
                    ("DIGITE O VALOR DO INVESTIMENTO"));
                R = (I * (Math.pow((1 + 0.05), 30)));
                JOptionPane.showMessageDialog(null,
                        "VALOR CORRIGIDO: "+ R);
                break;
            default:
                JOptionPane.showMessageDialog(null,
                        "ERRO, TIPO DE INVESTIMENTO NÃO COMPREENDIDO");
                break;
        }
    }  
}
