import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler input do usuário

        System.out.print("Digite um número inteiro: "); // Pede ao usuário para digitar um número

        int numero = scanner.nextInt(); // Lê o número inteiro digitado

        int quadrado = numero * numero; // Calcula o quadrado

        System.out.println("O quadrado de " + numero + " é " + quadrado); // Exibe o resultado

        scanner.close(); // Fecha o scanner
    }
}