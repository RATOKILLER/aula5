package atividade497;
import javax.swing.JOptionPane;

public class Busca {
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

    public static int busca(int[] vet, int tam, int chave) {
        int ini = 0, fim = tam - 1, meio;

        while (ini <= fim) {
            meio = (ini + fim) / 2;

            if (vet[meio] == chave) {
                return meio; 
            } else if (chave < vet[meio]) {
                fim = meio - 1;
            } else {
                ini = meio + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] num = new int[10];
        int n, pos;

        for (int l = 0; l < 10; l++) {
            num[l] = Integer.parseInt(JOptionPane.showInputDialog("Digite número " + (l + 1) + ":"));
        }
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de busca:"));
        ordena(num, 10);

        pos = busca(num, 10, n);

        StringBuilder vetor = new StringBuilder("\nVETOR\n");
        for (int l = 0; l < 10; l++) {
            vetor.append(l + 1).append(" - ").append(num[l]).append("\n");
        }
        JOptionPane.showMessageDialog(null, vetor.toString());

        if (pos != -1) {
            JOptionPane.showMessageDialog(null, "\nPosição no vetor: " + (pos + 1));
        } else {
            JOptionPane.showMessageDialog(null, "\nNÃO ENCONTRADO");
        }
    }
}
