public class Twelve {
    public static void main(String[] args) {
        /*
         *
 Input Format: N = 6
Result:   
1          1
12        21
123      321
1234    4321
12345  54321
123456654321
         */
        int n = 7; // Number of rows
       for (int i = 0; i < n; i++) {
            // Print left side numbers: 1 to i+1
            for (int k = 1; k <= i + 1; k++) {
                System.out.print(k);
            }

            // Print spaces: 2 * (n - i - 1)
            for (int s = 1; s <= 2 * (n - i - 1); s++) {
                System.out.print(" ");
            }

            // Print right side numbers: i+1 down to 1
            for (int o = i + 1; o >= 1; o--) {
                System.out.print(o);
            }

            // Move to next line
            System.out.println();
        }
    }
}
