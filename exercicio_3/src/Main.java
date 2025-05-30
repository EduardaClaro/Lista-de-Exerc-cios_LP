import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] vetor = {5, 8, 3, 9, 2, 7, 1, 6, 4, 0};
        int n;

        Scanner in = new Scanner(System.in);
        System.out.print("Mencione um número inteiro: ");
        n = in.nextInt();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                System.out.println("Valor encontrado na posição: " + i);
                return;
            }
        }

            System.out.println("Valor não encontrado");

    }
}
