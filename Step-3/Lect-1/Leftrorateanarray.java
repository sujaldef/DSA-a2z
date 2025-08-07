public class Leftrorateanarray {


    public void rotateLeft(int[] nums, int k) {
        int n = nums.length;

        // Edge case: no need to rotate if array is empty or has 1 element
        if (n <= 1) return;

        // if k> n, we can reduce it to k % n
        k = k % n;

        // Step 1: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 2: Reverse the rest (from k to end)
        reverse(nums, k, n - 1);

        // Step 3: Reverse the entire array
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Leftrorateanarray obj = new Leftrorateanarray();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;

        obj.rotateLeft(nums, k);

       
        for (int num : nums) {
            System.out.print(num + " ");
        }
       
    }
}
