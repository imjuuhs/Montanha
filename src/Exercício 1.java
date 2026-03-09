public static Integer verificarPrimeiro(int[] lista) {
    if (lista.length == 0) {
        return null;
    }
    return lista[0];
}

// Complexidade: O(1)
// Justificativa: O algoritmo acessa apenas o primeiro elemento do vetor, independentemente do tamanho.