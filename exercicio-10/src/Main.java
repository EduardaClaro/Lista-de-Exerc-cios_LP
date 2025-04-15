import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos: ");
        int n = scanner.nextInt();

        long a = 0, b = 1;
        System.out.print(a);

        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            long next = a + b;
            a = b;
            b = next;
        }
    }
}