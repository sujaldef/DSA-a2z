class Palindrome {
    public void isPalindrome(int x) {
        int reverse = 0;
        int num = x;
        if (num < 0) {
            System.out.println("Not Palindrome");
        } else {
            while (x != 0) {
                int lastdigit = x % 10;
                reverse = reverse * 10 + lastdigit;
                x = x / 10;
            }
            if (num == reverse) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        }
    }

    public static void main(String[] args) {
        Palindrome sol = new Palindrome();
        sol.isPalindrome(123454321);
        sol.isPalindrome(123456);
        sol.isPalindrome(-121);
    }
}
