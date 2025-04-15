import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, fatorial;
        fatorial = 1;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = in.nextInt();
        System.out.println(n + " ! : ");

        while (n>1){
            fatorial *= n;
            n--;
        }

        System.out.println();
    }
}