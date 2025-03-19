import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double milhas, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em milhas: ");
        milhas = in.nextDouble();

        result = milhas * 1.60934;

        System.out.println("O valor adiciona em milhas, convertido para km/h fica igual à: " + result);
    }
}