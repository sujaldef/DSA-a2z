public class Moveszerotoend {

    
    public void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPos] = nums[i];
                insertPos = insertPos + 1;
            }
        }

        // Step 2: Fill the remaining positions with zero
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos = insertPos + 1;
        }
    }

    
    public static void main(String[] args) {
        Moveszerotoend mover = new Moveszerotoend();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        mover.moveZeroes(nums);

        System.out.println("\nAfter:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
