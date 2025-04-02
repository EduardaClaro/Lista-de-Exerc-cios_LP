import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma opção entre 5 e 9: ");
        int number = in.nextInt();

        if (number >= 5 && number <= 9  ){
            System.out.println("Você escolheu a opção: " + number);
        }
        else {
            System.out.println("Opção invalida!");
        }
    }
}