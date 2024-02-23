package leetcode.RunningSumOf1DArray_1480;

import java.util.Arrays;

public class RunningSumOf1DArray_1480 {

    public static void main(String[] args) {
        RunningSumOf1DArray_1480 runningSumOf1DArray1480 = new RunningSumOf1DArray_1480();

        int[] nums = new int[] {3,1,2,10,1};
        int[] result = runningSumOf1DArray1480.runningSum(nums);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] runningSum(int[] nums) {
        for(int i=1; i< nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}