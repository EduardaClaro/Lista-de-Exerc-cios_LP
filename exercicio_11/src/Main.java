import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita dimensões das matrizes
        System.out.print("Linhas da matriz A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Colunas da matriz A: ");
        int colsA = scanner.nextInt();
        System.out.print("Linhas da matriz B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Colunas da matriz B: ");
        int colsB = scanner.nextInt();

        if (colsA != rowsB) {
            System.out.println("Não é possível multiplicar: colunas de A (" + colsA + ") devem ser iguais às linhas de B (" + rowsB + ").");
            scanner.close();
            return;
        }

        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] result = new int[rowsA][colsB];

        System.out.println("Digite os valores da matriz A (" + rowsA + "x" + colsA + "):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores da matriz B (" + rowsB + "x" + colsB + "):");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matrixB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                result[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Matriz produto (" + rowsA + "x" + colsB + "):");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}