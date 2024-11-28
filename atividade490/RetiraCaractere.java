package atividade490;
import javax.swing.JOptionPane;

public class RetiraCaractere {
    public static int restantes(char[] vet, int tam, char x) {
        int cont = 0;

        for (int i = 0; i < tam; i++) {
            if (vet[i] == x) {
                vet[i] = '*';
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        String[] nome = new String[10];
        char[][] vetores = new char[10][];
        int tam;

        for (int L = 0; L < 10; L++) {
            nome[L] = JOptionPane.showInputDialog("Digite palavra em letras minúsculas " + (L + 1) + ":");
            vetores[L] = nome[L].toCharArray(); 
            tam = vetores[L].length; 
            restantes(vetores[L], tam, 'c'); 
        }

        StringBuilder resultado = new StringBuilder();
        for (int L = 0; L < 10; L++) {
            resultado.append((L + 1)).append(" - ").append(String.valueOf(vetores[L])).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
