import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char jogarNovamente;

        do {
            boolean acertouTudo = true;

            for (int i = 1; i <= 10 && acertouTudo; i++) {
                for (int j = 1; j <= 10 && acertouTudo; j++) {
                    System.out.print(i + " x " + j + " = ");
                    int resposta = scan.nextInt();

                    if (resposta != i * j) {
                        System.out.println("Resposta errada! Você perdeu.");
                        acertouTudo = false;
                    }
                }
            }

            if (acertouTudo) {
                System.out.println("Parabéns! Você completou todas as tabuadas!");
            }

            System.out.print("Jogar novamente? (S/N): ");
            jogarNovamente = scan.next().toUpperCase().charAt(0);

        } while (jogarNovamente == 'S');
    }
}