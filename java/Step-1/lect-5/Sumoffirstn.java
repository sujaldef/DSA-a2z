public class Sumoffirstn {
    static int sum(int a){
        int i=1;
        int sum=0;
        while(i<=a){
           
            sum=sum+i;
            i++;
        }
        return sum;

    }
    public static void main(String[] args) {
        int n=5;
        int result = sum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
    }
}
