import java.util.Scanner;

public class Main {
    public static boolean isPalindromo(String texto) {

        String limpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return isPalindromoRecursivo(limpo, 0, limpo.length() - 1);
    }

    private static boolean isPalindromoRecursivo(String texto, int inicio, int fim) {

        if (inicio >= fim) {
            return true;
        }
        if (texto.charAt(inicio) != texto.charAt(fim)) {
            return false;
        }
        return isPalindromoRecursivo(texto, inicio + 1, fim - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        if (isPalindromo(entrada)) {
            System.out.println("É palíndromo.");
        } else {
            System.out.println("Não é palíndromo.");
        }

        scanner.close();
    }
}