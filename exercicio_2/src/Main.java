public class Main {
    public static void main(String[] args) {

        int[] vetor = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        //12, 40, 32, 80, 52, 120, 70, 160, 92, 200 --> saída
        //0   1   2   3   4    5   6    7   8    9  --> indice


        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] += 2;
            } else {
                vetor[i] *= 2;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");

        }
    }
}
