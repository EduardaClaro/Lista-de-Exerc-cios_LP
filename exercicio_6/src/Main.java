public class Main {
    public static void main(String[] args) {

        int[] v = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.print("Original: ");
        for (int x : v) System.out.print(x + " ");

        int aux;
        for (int i = 0; i < 5; i++) {
            aux = v[i];
            v[i] = v[9 - i];
            v[9 - i] = aux;
        }

        System.out.print("Invertido: ");
        for (int x : v) System.out.print(x + " ");

    }
}