import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double number1, number2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        number1 = in.nextDouble();

        System.out.println("Digite um outro número: ");
        number2 = in.nextDouble();

        result = number1 + number2 / 2;

        System.out.println("A média desses dois números é igual à: " + result);
        System.out.println("Fim do programa, obrigada pela atenção!!");
    }
}