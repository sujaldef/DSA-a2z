public class Fourth {
    public static void main(String[] args) {
        /*
         * 1
         * 2 2
         * 3 3 3
         * 4 4 4 4
         * 5 5 5 5 5
         * 6 6 6 6 6 6
         */
        for (int i=0;i<=6;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
