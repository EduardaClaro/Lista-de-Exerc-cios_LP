import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        double root = Math.sqrt(number);;
        if(number>0){
            System.out.println("A raiza quadrada do número é: "+ root);
        }
        else {
            System.out.println("Número invalido");
        }
    }
}