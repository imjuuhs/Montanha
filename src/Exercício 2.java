public static int somarLista(int[] lista) {
    int total = 0;

    for (int i = 0; i < lista.length; i++) {
        total += lista[i];
    }

    return total;
}

// Complexidade: O(n)
//Justificativa: O loop percorre todos os elementos uma vez.