import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double base, height, area;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o tamanho da base do triângulo retângulo: ");
        base = in.nextDouble();

        System.out.println("Digite a altura: ");
        height = in.nextDouble();

        area = base * height / 2;

        System.out.println("Sua área é: " + area);
    }
}