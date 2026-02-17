public class eight {
    public static void main(String[] args) {
        /*
         *
        ***********
        *********
        *******
        ***** 
         ***    
          *
         */
        int n = 6; // Number of rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.err.print(" ");
             for( int k=1; k<2*(n-i);k++){
                System.err.print("*");
             }
             System.err.println();
            }
    }
}
