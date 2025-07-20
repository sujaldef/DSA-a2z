public class Eightteen {
    public static void main(String[] args) {
        
    /*
     * Input Format: N = 6
Result:   
F
E F
D E F
C D E F
B C D E F
A B C D E F
     */
    int n=8;
    
       for (int i = 0; i < n; i++) {
            // Start character: depends on 'A' + n - 1 - i
            char start = (char) ('A' + n - 1 - i);
            char end = (char) ('A' + n - 1); // Always ends at the nth letter

            for (char ch = start; ch <= end; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}