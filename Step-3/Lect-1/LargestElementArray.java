public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 67, 45, 89, 2, 99};

        // Assume first element is the largest
        int max = arr[0];

        // Traverse the array to find the actual largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if current is greater
            }
        }

        System.out.println("The largest element is: " + max);
    }
}
