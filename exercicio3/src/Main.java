import java.util.Scanner;

public class Main {
    public static long calcularPotencia(int x, int y) {
        if (y < 0) {
            return 0;
        }

        if (y == 0) {
            return 1;
        }

        long resultado = 1;
        for (int i = 1; i <= y; i++) {
            resultado *= x;
        }

        return resultado;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (x): ");
        int x = scanner.nextInt();

        System.out.print("Digite o expoente (y): ");
        int y = scanner.nextInt();
        long potencia = calcularPotencia(x, y);

        if (potencia == 0 && y < 0) {
            System.out.println("Erro: O expoente deve ser maior ou igual a zero.");
        } else {
            System.out.println(x + " elevado a " + y + " é: " + potencia);
        }

        scanner.close();
    }
}