import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      double tempCelsius, fahrenheit;

      Scanner in = new Scanner(System.in);

      System.out.println("Digite uma temperatura em Celsius: ");
      tempCelsius = in.nextDouble();

      fahrenheit = tempCelsius * 9 / 5 + 32;

      System.out.println("O número convertido em fahrenheit é: " + fahrenheit);
    }
}