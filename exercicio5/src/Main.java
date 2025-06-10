public class Main {
    public static int buscaBinaria(int[] array, int valor) {

        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            if (array[meio] == valor) return meio;
            if (array[meio] < valor) inicio = meio + 1;
            else fim = meio - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] array = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int valor = 42;
        int pos = buscaBinaria(array, valor);

        if (pos != -1) System.out.println("Encontrado na posição: " + pos);

        else System.out.println("Não encontrado.");
    }
}