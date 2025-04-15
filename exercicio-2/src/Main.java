import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior, menor;   // Variáveis para armazenar apenas o maior e o menor

        System.out.print("Digite o primeiro número: ");
        int numero = scanner.nextInt();
        maior = numero;
        menor = numero;

        System.out.print("Digite o segundo número: ");
        numero = scanner.nextInt();
        if (numero > maior) maior = numero;
        if (numero < menor) menor = numero;

        System.out.print("Digite o terceiro número: ");
        numero = scanner.nextInt();
        if (numero > maior) maior = numero;
        if (numero < menor) menor = numero;

        System.out.print("Digite o quarto número: ");
        numero = scanner.nextInt();
        if (numero > maior) maior = numero;
        if (numero < menor) menor = numero;

        System.out.print("Digite o quinto número: ");
        numero = scanner.nextInt();
        if (numero > maior) maior = numero;
        if (numero < menor) menor = numero;

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

    }
}