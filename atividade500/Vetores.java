package atividade500;
import javax.swing.JOptionPane;

public class Vetores {
    public static void entrada(int[] vet, int t, String c) {
        for (int l = 0; l < t; l++) {
            vet[l] = Integer.parseInt(JOptionPane.showInputDialog("Digite número " + (l + 1) + " do vetor " + c + ":"));
        }
    }

    public static void imprime(int[] vet, int t, String c) {
        StringBuilder sb = new StringBuilder("\nVETOR " + c + "\n");
        for (int l = 0; l < t; l++) {
            sb.append(l + 1).append(" - ").append(vet[l]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void soma(int[] vet, int[] vet1, int t) {
        StringBuilder sb = new StringBuilder("\nSOMA\n");
        for (int l = 0; l < t; l++) {
            sb.append(vet[l] + vet1[l]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void subtrai(int[] vet, int[] vet1, int t) {
        StringBuilder sb = new StringBuilder("\nDIFERENÇA\n");
        for (int l = 0; l < t; l++) {
            sb.append(vet[l] - vet1[l]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void main(String[] args) {
        int[] num = new int[5];
        int[] num1 = new int[5];
        int op, flag = 0, flag1 = 0;

        do {
            String menu = "\n\n\nVETORES\n" +
                          "1. Dados do VETOR A\n" +
                          "2. Dados do VETOR B\n" +
                          "3. Imprime VETORES\n" +
                          "4. Soma VETORES\n" +
                          "5. Subtrai VETORES\n" +
                          "6. Sai do programa\n" +
                          "OPÇÃO: ";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1:
                    entrada(num, 5, "A");
                    flag = 1;
                    break;

                case 2:
                    entrada(num1, 5, "B");
                    flag1 = 1;
                    break;

                case 3:
                    if (flag != 0 && flag1 != 0) {
                        imprime(num, 5, "A");
                        imprime(num1, 5, "B");
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2");
                    }
                    break;

                case 4:
                    if (flag != 0 && flag1 != 0) {
                        soma(num, num1, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2");
                    }
                    break;

                case 5:
                    if (flag != 0 && flag1 != 0) {
                        subtrai(num, num1, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro as opções 1 e 2");
                    }
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do Algoritmo");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 6);
    }
}
