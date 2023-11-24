package array.removeDuplicates;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3, 4, 5};

        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * Removes duplicates from the sorted array 'nums' and returns the length of the updated array.
     *
     * @param nums the input array containing sorted integers
     * @return the length of the updated array after removing duplicates
     */
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
