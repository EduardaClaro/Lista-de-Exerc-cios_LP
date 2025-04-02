import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Digite uma nota: ");

        Scanner in = new Scanner(System.in);

        double nota1 = in.nextDouble();

        System.out.println("Digite outra nota: ");

        double nota2 = in.nextDouble();

        double result = (nota1 + nota2) / 2;

        if (result < 50)
            System.out.println("REPROVADO " + result);
        else if (result > 50)
            System.out.println("APROVADO " + result);
    }
}