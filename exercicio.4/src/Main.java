import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double number1 = in.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double number2 = in.nextDouble();

        double average = (number1 + number2) / 2;

        if(average > 50){
            System.out.println("Aprovado! Sua média foi: " +average);
        }
        else{
            System.out.println("Reprovado! Sua média foi: " +average);

            System.out.println("Digite a nota da terceira prova: ");
            double number3 = in.nextDouble();

            average = (average + number3) / 2;

            if(average > 50){
                System.out.println("Aprovado! Sua média foi: " +average);
            }
            else {
                System.out.println("Reprovado! Sua média foi: " +average);
            }
        }
    }
}