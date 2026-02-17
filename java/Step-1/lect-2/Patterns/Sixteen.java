public class Sixteen {
    public static void main(String[] args) {
        /*
         * Input Format: N = 6
Result:   
A 
B B
C C C
D D D D
E E E E E
F F F F F F
         */
        int n=5;
        for(int i=0;i<=n;i++)
        {
            for(char ch='A';ch<='A'+i;ch++)
            {

             System.out.print((char)(('A'+i)) + " ");
            }
            System.err.println();
        }
    }
}
