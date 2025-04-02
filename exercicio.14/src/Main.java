import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Insira o valor da compra!!");
        double price = scanner.nextDouble();
        System.out.println("--------------------------------");
        System.out.println("Menu:");
        System.out.println("    1 - Débito");
        System.out.println("    2 - Pix");
        System.out.println("    3 - Crédito ");
        System.out.println("    4 - Sair");
        System.out.println("--------------------------------");
        System.out.println("Escolha uma forma de pagamento: ");
        int value = scanner.nextInt();

        double base = 0;
        double height = 0;

        switch (value){
            case 1:
                double a = (price * 5) / 100;
                System.out.println("O valor no débito é: "+(price - a));
                break;

            case 2:
                double b = (price * 10) / 100;
                System.out.println("O valor no pix é: "+(price - 10));
                break;
            case 3:
                System.out.print("Informe em quantas vezes você quer: ");
                int times = scanner.nextInt();
                double price2;

                if (times >= 1 && times <= 4) {
                    price2 = (price * 1.02) / times;
                    System.out.println("O valor de cada parcela é: R$ " + String.format("%.2f", price2));
                } else if (times >= 5 && times <= 10) {
                    price2 = (price * 1.05) / times;
                    System.out.println("O valor de cada parcela é: R$ " + String.format("%.2f", price2));
                } else {
                    System.out.println("Número de parcelas inválido!! Escolha entre 1 e 10.");
                }
                break;
            default:
                break;
        }

    }
}