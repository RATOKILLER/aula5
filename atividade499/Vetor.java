package atividade499;
import javax.swing.JOptionPane;

public class Vetor {
    public static void entrada(int[] vet, int t) {
        for (int l = 0; l < t; l++) {
            vet[l] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (l + 1) + ":"));
        }
    }

    public static void ordena(int[] vet, int tam) {
        int aux;
        for (int l1 = 0; l1 < tam - 1; l1++) {
            for (int c1 = l1 + 1; c1 < tam; c1++) {
                if (vet[l1] > vet[c1]) {
                    aux = vet[l1];
                    vet[l1] = vet[c1];
                    vet[c1] = aux;
                }
            }
        }
    }

    public static void imprime(int[] vet, int t) {
        StringBuilder sb = new StringBuilder("\nVETOR\n");
        for (int l = 0; l < t; l++) {
            sb.append(l + 1).append(" - ").append(vet[l]).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public static void main(String[] args) {
        int[] num = new int[5];
        int op;
        int flag = 0;

        do {
            String menu = "\n\n\nMENU VETOR - FUNÇÃO\n" +
                          "1. Dados do VETOR\n" +
                          "2. Ordena VETOR\n" +
                          "3. Imprime VETOR\n" +
                          "4. Sai do programa\n" +
                          "OPÇÃO: ";
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (op) {
                case 1:
                    entrada(num, 5);
                    flag = 1;
                    break;

                case 2:
                    if (flag == 1) {
                        ordena(num, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro a opção 1");
                    }
                    break;

                case 3:
                    if (flag == 1) {
                        imprime(num, 5);
                    } else {
                        JOptionPane.showMessageDialog(null, "Escolha primeiro a opção 1");
                    }
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do Algoritmo");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (op != 4);
    }
}
