import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double quilometro, milha;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma velocidade em km/h: ");
        quilometro = in.nextDouble();

        milha = quilometro * 0.621371;

        System.out.println("O valor adiciona em km/h, convertido para milhas fica igual à: " + milha);
    }
}