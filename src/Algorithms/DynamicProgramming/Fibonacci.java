package Algorithms.DynamicProgramming;

// Print the nth Fibonacci number
// Fibonacci numbers = 0 1 1 2 3 5 8 13 21
// n = 0 1 2 3 4 5 6 7  8
public class Fibonacci {
    // Fibonacci
    private static int fibSchoolMethod(int n) {
        int a = 0, b = 1, c = 0;
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    // Fibonacci - simple recursion
    private static int fibRecursion(int n) {
        if (n <= 1)
            return n;
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }

    // Fibonacci - dynamic programming
    public static int fibDP(int n) {
        int[] ans = new int[n + 1];

        // Storing the independent values in the
        // answer array
        ans[0] = 0;
        ans[1] = 1;

        // Using the bottom-up approach
        for (int i = 2; i <= n; i++) {
            ans[i] = ans[i - 1] + ans[i - 2];
        }

        // Returning the final index
        return ans[n];
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(n + "th Fibonacci number - school method: " + fibSchoolMethod(n));
        System.out.println(n + "th Fibonacci number - simple recursion: " + fibRecursion(n));
        System.out.println(n + "th Fibonacci number - DP: " + fibDP(n));
    }
}
