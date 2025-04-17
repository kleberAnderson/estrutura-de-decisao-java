/*
   Nome do programa : ExercLt1_00
   Objetivo                            : Conceito de compilação e Execução do programa Java
                                                 Exibir conteúdo 
   Nome do Programador    : Anderson Kleber
  Data de desenvolvimento: 09/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex00
 {
  public static void main(String args [])
   {
       int Lado,Area;
       Lado = Integer.parseInt(JOptionPane.showInputDialog
       ("DIGITE UM VALOR DO LADO"));
       
       Area = (Lado * Lado);
       JOptionPane.showMessageDialog(null,"A AREA DO QUADRADO " +Area);
       
       
  } 
  
} 

