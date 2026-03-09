public static int fibonacci(int n) {

    if (n <= 1) {
        return n;
    }

    return fibonacci(n - 1) + fibonacci(n - 2);
}

// Complexidade: O(2^n)
// Justificativa: Cada chamada gera duas novas chamadas recursivas.