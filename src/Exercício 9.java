public static int[][] produtoMatrizes(int[][] A, int[][] B, int n) {

    int[][] C = new int[n][n];

    for (int i = 0; i < n; i++) {

        for (int j = 0; j < n; j++) {

            for (int k = 0; k < n; k++) {

                C[i][j] += A[i][k] * B[k][j];

            }

        }

    }

    return C;
}

// Complexidade: O(n³)
// Justificativa: Três loops aninhados.