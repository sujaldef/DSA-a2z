public class Fourteen {
    public static void main(String[] args) {
        /*
         Input Format: N = 6
Result:   
A
A B
A B C
A B C D
A B C D E
A B C D E F
         */
        int n=6;
        for(int i=0;i<=n;i++)
        {
            for(char ch='A'; ch<='A'+i; ch++){
                System.out.print(ch + " ");
            }
System.out.println();
        }
    }
}
