import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double polegadas, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma medida em polegada: ");
        polegadas = in.nextDouble();

        result = polegadas * 25.4;

        System.out.println("A medida convertida em milimetro é igual à: " + result);
    }
}