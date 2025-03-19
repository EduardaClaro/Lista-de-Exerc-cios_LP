import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double raio, height, volume;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio do cone: ");
        raio = in.nextDouble();

        System.out.println("Digite a altura: ");
        height = in.nextDouble();

        volume = (1.0 / 3) * Math.PI * Math.pow(raio, 2) * height;

        System.out.println("Sua área é: " + volume);
    }
}