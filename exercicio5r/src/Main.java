public class Main {
    public static int buscaBinaria(int[] array, int valor) {
        return buscaBinariaRecursiva(array, valor, 0, array.length - 1);
    }

    private static int buscaBinariaRecursiva(int[] array, int valor, int inicio, int fim) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (array[meio] == valor) {
            return meio;
        }

        if (array[meio] < valor) {
            return buscaBinariaRecursiva(array, valor, meio + 1, fim);
        } else {
            return buscaBinariaRecursiva(array, valor, inicio, meio - 1);
        }
    }

    public static void main(String[] args) {
        int[] array = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 88};
        int valor = 42;
        int pos = buscaBinaria(array, valor);

        if (pos != -1) {
            System.out.println("Encontrado na posição: " + pos);
        } else {
            System.out.println("Não encontrado.");
        }
    }
}