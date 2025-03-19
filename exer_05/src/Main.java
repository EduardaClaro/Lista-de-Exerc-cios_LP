import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double velocidade1, velocidade2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em km/h: ");
        velocidade1 = in.nextDouble();

        velocidade2 = velocidade1 / 3.6;

        System.out.println("A velocidade convertida para m/s é: " + velocidade2);
    }
}