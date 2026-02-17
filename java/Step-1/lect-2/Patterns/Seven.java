public class Seven {
    public static void main(String[] args) {
        /*
         * 
         *** 
         ***** 
         ******* 
         ********* 
         ***********
         * for an input of n=6 [ 6 lines]
         */

        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.err.println("");
        }
    }
}
