/*
   Nome do programa : ExercLt1_13
   Objetivo                            : Receba a quantidade de alimento em
quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.


   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex13 {
    public static void main (String args[])
    {
        double Alimento;
        int Dias;
        
        Alimento = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE QUANTIDADE DE ALIMENTO EM KG: "));
        
        Dias = (int)(Alimento * 1000)/50;
        
        JOptionPane.showMessageDialog(null,
                "DIAS DE DURAÇÃO DO ALIMENTO CONSUMIDO 50g AO DIA: "+ Dias +" DIAS");
        
        
    }
    
}
