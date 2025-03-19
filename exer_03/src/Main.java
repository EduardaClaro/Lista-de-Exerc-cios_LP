import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número real: ");

        double numero = scanner.nextDouble();

        double quintaParte = numero / 5; // Calcula a quinta parte

        System.out.println("A quinta parte de " + numero + " é " + quintaParte); // Exibe o resultado

        scanner.close();
    }
}