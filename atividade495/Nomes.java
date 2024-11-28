package atividade495;
import javax.swing.JOptionPane;

public class Nomes {
    public static void ordena(String[] vet, int tam) {
        String aux;
        for (int li = 0; li < tam - 1; li++) {
            for (int ci = li + 1; ci < tam; ci++) {
                if (vet[li].compareTo(vet[ci]) > 0) {
                    aux = vet[li];
                    vet[li] = vet[ci];
                    vet[ci] = aux;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] nome = new String[5];

        for (int l = 0; l < 5; l++) {
            nome[l] = JOptionPane.showInputDialog("Digite o nome " + (l + 1) + ":");
        }
        ordena(nome, 5);
        StringBuilder resultado = new StringBuilder("\n\nNOMES ORDENADOS\n");
        for (int l = 0; l < 5; l++) {
            resultado.append((l + 1)).append(" - ").append(nome[l]).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
