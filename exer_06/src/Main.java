import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double velocidade1, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em m/s: ");
        velocidade1 = in.nextDouble();

        result = velocidade1 * 3.6;

        System.out.println("A velocidade convertida para km/h é: " + result);
    }
}