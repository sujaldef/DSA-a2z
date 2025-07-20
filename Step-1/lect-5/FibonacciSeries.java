public class FibonacciSeries {
    public static int fib(int n) {  // changed to static
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 7;
        int result = fib(n);  // store the result
        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
