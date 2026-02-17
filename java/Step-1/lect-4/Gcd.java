public class Gcd {
    public int Solution(int a,int b)
    {
        int num=1;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0 && b%i==0)
            {
                
                num=i;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Gcd sol = new Gcd();
        int a = 56, b = 98;
        System.out.println("GCD of " + a + " and " + b + " is: " + sol.Solution(a, b));
    }
}
