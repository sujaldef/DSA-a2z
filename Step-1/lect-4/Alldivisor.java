public class Alldivisor {
  
    public static void main(String[] args) {

        int a = 56;
        System.out.println("All divisors of " + a + " are: ");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    }
