public static int[] mergeSort(int[] lista) {

    if (lista.length <= 1) {
        return lista;
    }

    int meio = lista.length / 2;

    int[] esquerda = Arrays.copyOfRange(lista, 0, meio);
    int[] direita = Arrays.copyOfRange(lista, meio, lista.length);

    esquerda = mergeSort(esquerda);
    direita = mergeSort(direita);

    return merge(esquerda, direita);
}

// Complexidade: O(n log n)
// Justificativa: O algoritmo divide a lista em partes menores e depois percorre todos os elementos para juntar.