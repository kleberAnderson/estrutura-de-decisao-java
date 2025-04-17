import javax.swing.JOptionPane;
public class Lt01_ex18_Estdecisao {
public static void main(String args[])
    {
        int X,Y,Z;
        X = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE O PRIMEIRO NÚMERO: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE O SEGUNDO NÚMERO"));
        
if (X > Y) {
    Z = (X - Y);
    JOptionPane.showMessageDialog(null,"A AREA DO QUADRADO "+Z);
}
else {
    if (Y>X) {
        Z = (Y - X);
        JOptionPane.showMessageDialog(null,"A AREA DO QUADRADO "+Z);
    }
    
    }
}
        
}
    