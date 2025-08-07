public class RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        // j is the "write" pointer.
        // It keeps track of the position of the last unique element.
        int j = 0;  

        for (int i = 1; i < nums.length; i++) {
            // i is the "read" pointer, starts from 1 since we assume the first element j[0] is always unique. 
        
            if (nums[i] != nums[j]) {
               j++;  // move write pointer ahead
                nums[j] = nums[i];  // copy the new unique element to the j-th position
           }
             // else, it's a duplicate → skip it
        }

        return j + 1; // total unique elements
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Modified array: ");
        // the nums has been modified in place to have unique elemet s as in j array 
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
