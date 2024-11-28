package atividade470;
import javax.swing.JOptionPane;

public class Primo {
    public static int primo(int n) {
        int c = 0; 
        int p = 2; 

        while (c == 0 && p <= n / 2) {
            if (n % p == 0) {
                c = 1; 
            }
            p++;
        }
        return c; 
    }

    public static void main(String[] args) {
        int num, pri;

        num = Integer.parseInt(JOptionPane.showInputDialog("\nDigite um número > 0:"));
        pri = primo(num);

        if (pri == 0) {
            JOptionPane.showMessageDialog(null, "\nÉ primo: " + num);
        } else {
            JOptionPane.showMessageDialog(null, "\nNão é primo: " + num);
        }

        JOptionPane.showMessageDialog(null, "\n");
    }
}
