package leetcode.LeftAndRightSumDifferences_2574;

import java.util.Arrays;

public class LeftAndRightSumDifferences_2574 {
    public static void main(String[] args) {
        LeftAndRightSumDifferences_2574 lar = new LeftAndRightSumDifferences_2574();
        int[] nums = new int[]{1};

        int[] result = lar.leftRightDifference(nums);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] leftRightDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] result = new int[nums.length];
        leftSum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        rightSum[nums.length - 1] = 0;

        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}