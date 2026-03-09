public static void imprimirParesESoma(int[] lista) {

    // bloco 1
    for (int i = 0; i < lista.length; i++) {
        System.out.println(lista[i]);
    }

    // bloco 2
    for (int i = 0; i < lista.length; i++) {
        for (int j = 0; j < lista.length; j++) {
            System.out.println(lista[i] + " " + lista[j]);
        }
    }

}

// Complexidade: O(n²)
// Justificativa: O primeiro loop é O(n), mas o segundo possui dois loops aninhados, resultando em O(n²), que domina.