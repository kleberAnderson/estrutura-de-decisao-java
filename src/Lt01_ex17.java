/*
   Nome do programa : ExercLt1_17
   Objetivo                            : Calcule a quantidade de litros gastos 
em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso
e a velocidade média.


   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex17 {
    public static void main (String args[])
    {
        double Temp, Velm, C, Li;
        Temp = Double.parseDouble(JOptionPane.showInputDialog
        (null,"DIGITE O TEMPO DO PERCURSO:"));
        Velm = Double.parseDouble(JOptionPane.showInputDialog
        (null,"DIGITE A VELOCIDADE MÉDIA:"));
        
        C = (Temp * Velm);
        Li = (C /12);
        
        JOptionPane.showMessageDialog(null,
                "A QUANTIDADE DE LITROS GASTO EM UMA VIAGEM: "+ Li +" LITROS");
    }
}
