public class Six {
    public static void main(String[] args) {
        /*
         * 1 2 3 4 5 6
         * 1 2 3 4 5
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */

        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(j);
            }
            System.err.println();
        }
    }

}
