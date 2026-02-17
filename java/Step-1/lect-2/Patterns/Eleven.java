public class Eleven {
    public static void main(String[] args) {
        /*
Input Format: N = 6
Result:   
1
01
101
0101
10101
010101
         */
        int n = 6; // Number of rows
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
    
                if((i+j)%2==0)
                {
                    System.err.print("1");
                }
                else
                {
                    System.err.print("0");
                }
                
            }
            System.err.println();
        }
    }
}
