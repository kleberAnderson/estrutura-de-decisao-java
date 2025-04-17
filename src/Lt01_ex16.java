/*
   Nome do programa : ExercLt1_16
   Objetivo                            : Receba a quantidade de horas
trabalhadas, o valor por hora, o percentual de desconto e o número de
descendentes. Calcule o salário que serão as horas trabalhadas x o 
valor por hora. Calcule o salário líquido (= Salário Bruto – desconto).
A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba
o salário a receber


   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex16 {
    public static void main(String args[])
    {
        int Ht,Nd;
        double Vh, Pd, S, Sv, Sl, A, D;
        
        Ht = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE A QUANTIDADE DE HORAS TRABALHADAS: "));
        Vh = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O VALOR POR HORA:"));
        Pd = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O PERCENTUAL DE DESCONTO:"));
        Nd = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE O NÚMERO DE DESCENDENTES:"));
        
        S = (Ht * Vh);
        D = (S * (Pd/100));
        Sl = (S - D);
        A = (Nd * 100);
        Sv = (Sl + A);
        
        JOptionPane.showMessageDialog
        (null,"SALÁRIO A RECEBER: R$ " + Sv);
        
                
        
        
        
        
        
        
    }
    
}
