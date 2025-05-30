import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int minor, major, minorIndex, majorIndex;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros (pressione Enter após cada número):");

        // Leitura dos números
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                array[i] = in.nextInt();
            }

            // Inicializa as variáveis com o primeiro elemento do vetor
            major = array[0];
            minor = array[0];
            majorIndex = 0;
            minorIndex = 0;

            // Percorre o vetor para encontrar o maior e o menor valor
            for (int i = 1; i < array.length; i++) {
                if (array[i] > major) {
                    major = array[i];
                    majorIndex = i;
                }
                if (array[i] < minor) {
                    minor = array[i];
                    minorIndex = i;
                }
            }

            // Exibe os resultados
            System.out.println("Maior valor = " + major + ", posição = " + majorIndex);
            System.out.println("Menor valor = " + minor + ", posição = " + minorIndex);

        } catch (Exception e) {
            System.out.println("Erro: Por favor, insira apenas números inteiros válidos.");
        } finally {
            in.close(); // Fecha o Scanner
        }
    }
}