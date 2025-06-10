import java.util.Scanner;

public class Main {
    public static long calcularPotencia(int x, int y) {

        if (y < 0) {
            throw new IllegalArgumentException("Erro: O expoente deve ser maior ou igual a zero.");
        }

        if (y == 0) {
            return 1;
        }

        return x * calcularPotencia(x, y - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (x): ");
        int x = scanner.nextInt();

        System.out.print("Digite o expoente (y): ");
        int y = scanner.nextInt();

        try {
            long potencia = calcularPotencia(x, y);
            System.out.println(x + " elevado a " + y + " é: " + potencia);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {

            scanner.close();
        }
    }
}