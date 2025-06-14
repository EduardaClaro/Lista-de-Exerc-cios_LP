public class Main {
    public static long somaAteN(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException("Erro: N deve ser maior que 0");
        }

        if (n == 1) {
            return 1;
        }

        return n + somaAteN(n - 1);
    }

    public static void main(String[] args) {

        try {
            System.out.println(somaAteN(2));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}