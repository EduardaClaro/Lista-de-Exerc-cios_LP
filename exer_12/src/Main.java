import  java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        double number1, number2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        number1 = in.nextDouble();

        System.out.println("Digite o segundo número: ");
        number2 = in.nextDouble();

        if (number1>10 || number2>10)
            System.out.println("As notas inseridas devem ser menor ou igual a 10");

        else{
            System.out.println("A média das duas notas inseridas é : " + ((number1 * 1) + (number2 * 2)) / 3);

        }
    }
}