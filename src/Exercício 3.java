public static int buscaBinaria(int[] lista, int alvo) {

    int esquerda = 0;
    int direita = lista.length - 1;

    while (esquerda <= direita) {

        int meio = (esquerda + direita) / 2;

        if (lista[meio] == alvo) {
            return meio;
        }

        if (lista[meio] < alvo) {
            esquerda = meio + 1;
        } else {
            direita = meio - 1;
        }
    }

    return -1;
}

// Complexidade: O(log n)
// Justificativa: A cada passo a busca reduz o intervalo pela metade.