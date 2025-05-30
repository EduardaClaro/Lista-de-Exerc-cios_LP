public class Main {
    public static void main(String[] args) {

        int[] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] v2 = new int[10];

        for (int i = 0; i < 10; i++) {
            v2[i] = v1[9 - i];
        }

        System.out.print("v1: ");
        for (int x : v1) System.out.print(x + " ");
        System.out.println();

        System.out.print("v2: ");
        for (int x : v2) System.out.print(x + " ");
    }
}