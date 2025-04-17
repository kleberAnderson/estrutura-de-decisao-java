/*
   Nome do programa : ExercLt1_01
   Objetivo                            : Coletar o valor do lado de um quadrado, calcular sua área
                                                    e apresentar o resultado.

   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 10/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex01 
{
    public static void main(String args[])
    {
        int Lado,Area;
        
        Lado = Integer.parseInt(JOptionPane.showInputDialog
                                ("DIGITE UM VALOR DO LADO"));
        
        Area = (Lado * Lado);
        
        JOptionPane.showMessageDialog(null,"A  AREA DO QUADRADO: "+ Area);
        
    }
            
    
}
