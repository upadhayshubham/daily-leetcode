package leetcode.MinimizeMaximumPairSumInArray_1877;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray_1877 {
    public static void main(String[] args) {
        MinimizeMaximumPairSumInArray_1877 minimizeMaximumPairSumInArray1877 = new MinimizeMaximumPairSumInArray_1877();
        int[] nums = new int[]{3, 5, 2, 3};

        int result = minimizeMaximumPairSumInArray1877.minPairSum(nums);
        System.out.println(result);
    }

    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0, n = nums.length;

        for (int i = 0; i < nums.length / 2; i++) {
            System.out.println("Pair : " + nums[i] + " " + nums[n - i - 1]);
            result = Math.max(result, nums[i] + nums[n - i - 1]);
        }

        return result;
    }
}