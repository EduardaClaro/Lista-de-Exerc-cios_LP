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

        if(average >= 8.5){
            System.out.println("Nota A!");
        }
        else if(average >=7){
            System.out.println("Nota B!");
        }
        else if (average >= 5) {
            System.out.println("Nota C!");
        }
        else {
            System.out.println("Nota D!");
        }
    }
}