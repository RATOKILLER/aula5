package atividade480;
import javax.swing.JOptionPane;

public class Capicua {
    public static int reverso(int num) {
        int soma = 0, r;

        while (num != 0) {
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        int n, x;

        n = Integer.parseInt(JOptionPane.showInputDialog("\nDigite um número:"));
        x = reverso(n);

        JOptionPane.showMessageDialog(null, "\n" + n + " - " + x);

        if (x == n) {
            JOptionPane.showMessageDialog(null, "\nÉ um número capicua.");
        } else {
            JOptionPane.showMessageDialog(null, "\nNão é um número capicua.");
        }

        JOptionPane.showMessageDialog(null, "\n");
    }
}
