public class Ten {
    public static void main(String[] args) {
        /*
  *  
  **
  ***  
  **
  * 
  for n=3 { we will go to the 3 stars and then we will go back to the 1 star}
         */
        int n = 3;
       
        // Upper half (increasing stars)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half (decreasing stars)
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}