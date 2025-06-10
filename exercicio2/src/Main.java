import java.util.Scanner;

public class Main {
    public static long calcularFatorial(int n) {
        if (n < 0) return 0;
        if (n == 0 || n == 1) return 1;

        long resultado = 1;

        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int numero = scanner.nextInt();

        long fatorial = calcularFatorial(numero);

        System.out.println("Fatorial de " + numero + ": " + fatorial);

        scanner.close();
    }
}