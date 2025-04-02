import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um  número inteiro: ");
        int number = in.nextInt();

        if (number % 2 == 0){
            System.out.println("O número: " + number + " é par!");
        }
        else{
            System.out.println("O número: " + number + " é impar!");
        }
    }
}