public class Nine {
    public static void main(String[] args) {
        /*
     *
    ***
   ***** 
  *******
 *********
***********  
***********
 *********
  *******
   ***** 
    ***    
     *
         */
        int n=6;

        for( int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for( int k=0;k<2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for( int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for( int k=1;k<2*(n-i);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
