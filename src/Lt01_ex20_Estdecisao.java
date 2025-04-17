/*
   Nome do programa          : ExercLt1_20
    Objetivo                              :  Receba 3 coeficiente A, B, C de uma
equação do 2º grau da fórmula AX²+BX+C=0. verifique e mostre a existência de 
raízes reais e se caso caso exista, calcule e mostre.
   Nome do Programador      :  Anderson Kleber
   Data de desenvolvimento :  15/08/2024
*/
import javax.swing.JOptionPane;
public class Lt01_ex20_Estdecisao{
    public static void main (String args[])
    {
        double A,B,C,D,X1,X2;
        A = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O COEFICIENTE A"));
        B = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O COEFICIENTE B"));
        C = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE O COEFICIENTE C"));
        D =(Math.pow(B, 2)-4 * A * C);
        
        if(D >= 0) {
            if (D == 0) {
                System.out.print("EXISTE UMA RAIZ");
                X1 =(B*-1)/(2*A);
                System.out.print("RAIZ: "+ X1);
            }
            else{
                System.out.print("EXISTE DUAS RAIZES");
                X1 = (((B * -1)+(Math.pow(D, 0.5))/2*A));
                X2 = (((B * -1)-(Math.pow(D, 0.5))/2*A));
                System.out.print("1º RAIZ: "+ X1 +", 2ºRAIZ: "+ X2);
            }
        }
        else if (D < 0) {
            System.out.print("NÃO HÁ RAIZES");
        }
    }
}
