import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota para obter sua tabuada: ");

        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
}


// quando um "for" estiver dentro de um outro "for", a letrinha do primeiro = 'i' e a do segundo = 'j'.