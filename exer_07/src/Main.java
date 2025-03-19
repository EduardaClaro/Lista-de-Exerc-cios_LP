import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double milimetro, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma medida em milimetro: ");
        milimetro = in.nextDouble();

        result = milimetro / 25.4;

        System.out.println("A medida convertida em polegadas é igual à: " + result);
    }
}