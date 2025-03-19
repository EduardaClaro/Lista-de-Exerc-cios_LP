import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double initialSpeed, aceleration, time, speed;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a velocidade iniciaçl: ");
        initialSpeed = in.nextDouble();

        System.out.println("Digite a aceleração (m/s²): ");
        aceleration = in.nextDouble();

        System.out.println("Digite o tempo (s): ");
        time = in.nextDouble();

        speed = initialSpeed + aceleration * time;
        System.out.println("A velocidade final é:"  + speed +  "m/s");
    }
}