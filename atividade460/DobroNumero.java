package atividade460;

import javax.swing.JOptionPane;

public class DobroNumero {
    public static int dob(int x) {
        return x * 2;
    }

    public static void main(String[] args) {
        int a; 

        for (int c = 1; c <= 3; c++) {
            a = Integer.parseInt(JOptionPane.showInputDialog("\n\nDigite o número:"));
            JOptionPane.showMessageDialog(null, "Dobro: " + dob(a));
        }

        JOptionPane.showMessageDialog(null, "\n");
    }
}
