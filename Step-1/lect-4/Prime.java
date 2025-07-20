public class Prime {
    public static void main(String[] args) {

        int a = 7;
        int divisor = 0;
        System.out.println("All divisors of " + a + " are: ");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                divisor++;
            }
        }
        if (divisor == 2) {
            System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is not a prime number.");
        }
    }
}
