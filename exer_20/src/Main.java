import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        double x1 = 1;
        double x2 = 2;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira raiz: ");
        x1 = in.nextDouble();

        System.out.println("Digite a segunda raiz: ");
        x2 = in.nextDouble();

        System.out.println("x = " + x1 + ": " + (x1 * x1 - 3 * x1 + 2));
        System.out.println("x = " + x2 + ": " + (x2 * x2 - 3 * x2 + 2));
    }
}
