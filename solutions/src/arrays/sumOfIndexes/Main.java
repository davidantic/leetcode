package arrays.sumOfIndexes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;

        System.out.println(Arrays.toString(indexSum(nums, target)));
    }

    /**
     * Finds two indices in the given array whose elements sum up to the target.
     * Time complexity: O(n^2) due to nested iteration through the array.
     *
     * @param nums    input array of integers
     * @param target  target sum to be achieved
     * @return        array with two indices or an empty array if no such pair exists
     */

    public static int[] indexSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
