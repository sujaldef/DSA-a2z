public class Seventeen {
    public static void main(String[] args) {
        /*
         Input Format: N = 6
Result:   
     A     
    ABA    
   ABCBA   
  ABCDCBA  
 ABCDEDCBA 
ABCDEFEDCBA
         */
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            
            for (char ch = 'A'; ch <= 'A' + i-1; ch++) {
                System.out.print(ch);
            }
            System.err.println();
        }
    }
}
