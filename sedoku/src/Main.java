import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] tabuleiro = new int[9][9];
        boolean[][] fixo = new boolean[9][9];

        System.out.println("Digite os valores e se são fixos (true/false) no formato linha,coluna;valor,fixo:");
        System.out.println("Exemplo: 0,0;4,false");
        System.out.println("Você pode digitar várias entradas separadas por espaço ou uma por linha.");
        System.out.println("Pressione Enter em linha vazia para terminar.");

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            if (linha.isEmpty()) break; // encerra entrada

            // Divide várias entradas numa mesma linha por espaço
            String[] entradas = linha.split(" ");
            for (String entrada : entradas) {
                try {
                    String[] partes = entrada.split(";");
                    String[] pos = partes[0].split(",");
                    int l = Integer.parseInt(pos[0]);
                    int c = Integer.parseInt(pos[1]);

                    String[] valorFixo = partes[1].split(","); // <--- separa valor e fixo
                    int valor = Integer.parseInt(valorFixo[0]);
                    boolean isFixo = Boolean.parseBoolean(valorFixo[1].toLowerCase());

                    tabuleiro[l][c] = valor;
                    fixo[l][c] = isFixo;
                } catch (Exception e) {
                    System.out.println("Entrada inválida: " + entrada);
                }
            }
        }

        System.out.println("\nTabuleiro inicial:");
        mostrarTabuleiro(tabuleiro);
        scanner.close();
    }

    public static void mostrarTabuleiro(int[][] tabuleiro) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
    }
}