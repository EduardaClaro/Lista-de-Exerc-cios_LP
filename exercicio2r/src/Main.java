import java.util.Scanner;

public class Main {
    public static long calcularFatorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("Erro: N deve ser maior ou igual a 0");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * calcularFatorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        try {
            int numero = scanner.nextInt();
            long fatorial = calcularFatorial(numero);
            System.out.println("Fatorial de " + numero + ": " + fatorial);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {

            scanner.close();
        }
    }
}