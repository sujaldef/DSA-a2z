public class Fivteen {
    public static void main(String[] args) {

        // Print the pattern
        // A B C D E F
        // A B C D E
        // A B C D
        // A B C
        // A B
        // A
  

    int n=6;for(
    int i = 0;i<n;i++)
    {
        for (char ch = 'A'; ch < ('A' +n-i); ch++) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
  }