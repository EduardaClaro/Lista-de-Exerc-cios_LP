public class Main {
    public static void main(String[] args) {
        System.out.println("Números positivos divisíveis por 4 menores que 200:");

        int contador = 0;
        for (int i = 1; i < 200; i++) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
                contador++;
                if (contador % 10 == 0) {
                    System.out.println();
                }
            }
        }

    }
}