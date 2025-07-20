public class FactorialofNnumbers {
    static int factorial(int n){
        int value=1;
        for(int i=1; i<=n; i++){
            value *= i; // Multiply value by i
        }
 return value;
    }
    public static void main(String[] args) {
        int n = 5; // Example input
        int result = factorial(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}
