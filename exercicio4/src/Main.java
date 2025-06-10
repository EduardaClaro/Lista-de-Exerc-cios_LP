import java.util.Scanner;

public class Main {
    public static boolean isPalindromo(String texto) {

        String limpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int inicio = 0;
        int fim = limpo.length() - 1;
        while (inicio < fim) {
            if (limpo.charAt(inicio) != limpo.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }

        return true;
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