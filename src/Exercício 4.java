public static void paresComSoma(int[] lista, int alvo) {

    for (int i = 0; i < lista.length; i++) {

        for (int j = i + 1; j < lista.length; j++) {

            if (lista[i] + lista[j] == alvo) {
                System.out.println(lista[i] + " " + lista[j]);
            }

        }

    }

}

// Complexidade: O(n²)
// Justificativa: Dois loops aninhados percorrem a lista.